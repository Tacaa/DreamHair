package sbnz.integracija.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import sbnz.integracija.example.facts.Preparations;
import sbnz.integracija.example.services.UserService;



@RestController
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	
	/*
	 * Pravicemo funkciju getPreparation
	 * tu cemo vaditi korisnika
	 * odatle uzimamo njegovu kosu 
	 * gledamo da li je stare preparate imao, ako jeste stavlajmo current false
	 * pravimo nove preparate sa defaultnim vrijednostima i prosljedjujemo i to servisu*/
	
	
	
}
