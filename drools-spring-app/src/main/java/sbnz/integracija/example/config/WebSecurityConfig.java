package sbnz.integracija.example.config;

import sbnz.integracija.example.security.RestAuthenticationEntryPoint;
import sbnz.integracija.example.security.TokenAuthenticationFilter;
import sbnz.integracija.example.services.CustomUserDetailsService;
import sbnz.integracija.example.util.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	//koristi se za hesiranje lozinke
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		//return PasswordEncoderFactories.createDelegatingPasswordEncoder();
		
	}

	//servis koji dobavlja korisnika iz baze
	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	//handler za vracanje 401 kada klijent sa neodogovarajucim korisnickim imenom i lozinkom pokusa da pristupi resursu
	@Autowired
	private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

	//registrujemo authentication manager koji ce da uradi autentifikaciju korisnika za nas
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	//definisemo nacin utvrdjivanja korisnika pri autentifikaciji
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserDetailsService) //kazemo da koristi customUserDetailsService za dobavljanje podataka
		.passwordEncoder(passwordEncoder()); //te kako da hesira lozinku
	}

	@Autowired
	private TokenUtils tokenUtils;
	
	// koristiti jedan od dole nacina za funkciju u svojim kontrolerima!!!!
	// primjer --> .antMatchers("/admin").hasRole("ADMIN") ili .antMatchers("/admin").hasAuthority("ROLE_ADMIN")
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				.exceptionHandling().authenticationEntryPoint(restAuthenticationEntryPoint).and()
				.authorizeRequests().antMatchers("/auth/login").permitAll() //svi imaju pristup logovanju
				.antMatchers("/user/").permitAll()
				.antMatchers("/auth/register").permitAll()
				.antMatchers("/hair/calculate").permitAll()
				.antMatchers("/hair/advices").permitAll()
				.antMatchers("/hair/calculatedProducts").permitAll()
				.antMatchers("/hair/reviews").permitAll()
				.antMatchers("/hair/giveReview").permitAll()
				.antMatchers("/diary/").permitAll()
				.antMatchers("/admin/products").permitAll()
				.antMatchers("/admin/littleGrade/{grade}").permitAll()
				.antMatchers("/admin/bigGrade/{grade}").permitAll()
				.antMatchers("/admin/littleComment/{numComments}").permitAll()
				.antMatchers("/admin/bigComment/{numComments}").permitAll()
				.antMatchers("/admin/postDSW").permitAll()
				.antMatchers("/admin/postOil").permitAll()
				.antMatchers("/admin/postMask").permitAll()
				.antMatchers("/admin/postReg").permitAll()
				.antMatchers("/admin/postDS").permitAll()
				.antMatchers("/api/**").permitAll()
			.anyRequest().authenticated().and()
			.cors().and()
			.addFilterBefore(new TokenAuthenticationFilter(tokenUtils, customUserDetailsService), BasicAuthenticationFilter.class);
		http.csrf().disable();
	}
	
	
	//definisanje konfiguracije koja utice na generalnu bezbednost aplikacije
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers(HttpMethod.POST, "/auth/login");
		web.ignoring().antMatchers(HttpMethod.GET, "/", "/webjars/**", "/*.html", "favicon.ico", "/**/*.html",
				"/**/*.css", "/**/*.js");
	}

}
