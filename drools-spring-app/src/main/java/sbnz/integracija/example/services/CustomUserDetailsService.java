package sbnz.integracija.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.repositories.UserRepository;


@Service
public class CustomUserDetailsService  implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	//funkcija koja na osnovu username-a iz baze vraca objekat User-a
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException(String.format("No user found with given username '%s' :(", username));
		} else {
			return user;
		}
	}
}