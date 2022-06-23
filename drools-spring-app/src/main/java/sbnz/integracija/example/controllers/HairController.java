package sbnz.integracija.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.dto.UserDTO;
import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.facts.UserInput;
import sbnz.integracija.example.services.UserService;

@RestController
@RequestMapping(value = "/hair")
public class HairController {
	@Autowired
	private UserService userService;

	
	@PostMapping(value = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDTO> register(@RequestBody UserInput dto) {
		
		/*
		 * 1. dovesti input ovdje
		 * 2. dobaviti usera
		 * 3. napraviti klase i sacuvati od tog usera
		 * 4. napravi proizvode i sacuvaj u bazi
		 * 5. dobavi ih iz baze 
		 * 6. pravi kiasesiju i ukljuci 
		 * */
		return null;
	}
	
}
