package sbnz.integracija.example.controllers;
import sbnz.integracija.example.dto.JwtAuthenticationRequest;
import sbnz.integracija.example.dto.UserDTO;
import sbnz.integracija.example.dto.UserTokenState;
import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.services.UserService;
import sbnz.integracija.example.util.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




//kontroler zaduzen za autentifikaciju korisnika
@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {
	@Autowired
	private TokenUtils tokenUtils;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserTokenState> createAuthenticationToken(@RequestBody JwtAuthenticationRequest authenticationRequest) {
		System.out.println("TACA");
		try {
			Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUsername().toLowerCase(), authenticationRequest.getPassword()));

			SecurityContextHolder.getContext().setAuthentication(authentication);

			User user = (User) authentication.getPrincipal();
			String jwt = tokenUtils.generateToken(user.getUsername(), user.getRoles());
			int expiresIn = tokenUtils.getExpiredIn();
			System.out.println(user.getName());
			return ResponseEntity.ok(new UserTokenState(jwt, expiresIn, user.getId(), user.getUsername(), user.getRoles().get(0).getName()));
		} catch (DisabledException de) {
			return new ResponseEntity<UserTokenState>(HttpStatus.FORBIDDEN);
		} catch (BadCredentialsException bdc) {
			return new ResponseEntity<UserTokenState>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDTO> register(@RequestBody UserDTO dto) {
		System.out.println("TACA");
		User userRet = userService.registerUser(dto);
		
		if(userRet.getUsername() == null) {
			return new ResponseEntity<UserDTO>(HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok(new UserDTO(userRet.getId(), userRet.getName(), userRet.getLastname(), userRet.getUsername(), userRet.getPassword()));
	}
	
}