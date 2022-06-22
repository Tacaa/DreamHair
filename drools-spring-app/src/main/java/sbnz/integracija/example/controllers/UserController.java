package sbnz.integracija.example.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.dto.UserDTO;
import sbnz.integracija.example.facts.Preparations;
import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.services.UserService;



@RestController
@RequestMapping(value = "/user")
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDTO> getUser() {
		User loggedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDTO dto = new UserDTO(loggedUser.getId(), loggedUser.getName(), loggedUser.getLastname(), loggedUser.getUsername(), loggedUser.getPassword());
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	
	
}
