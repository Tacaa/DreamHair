package sbnz.integracija.example.controllers;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.dto.AdviceMedalDTO;
import sbnz.integracija.example.dto.GivenReviewDTO;
import sbnz.integracija.example.dto.PreparationDTO;
import sbnz.integracija.example.dto.ReviewPreparationsDTO;
import sbnz.integracija.example.dto.UserDTO;
import sbnz.integracija.example.dto.UserInputDTO;
import sbnz.integracija.example.facts.Advice;
import sbnz.integracija.example.facts.Preparations;
import sbnz.integracija.example.facts.RegisteredUser;
import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.facts.UserInput;
import sbnz.integracija.example.services.HairService;
import sbnz.integracija.example.services.UserService;

@RestController
@RequestMapping(value = "/hair")
public class HairController {
	@Autowired
	private HairService service;

	
	@PostMapping(value = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_REGISTERED_USER')")
	public ResponseEntity<PreparationDTO> calculate(@RequestBody UserInputDTO dto) {
		User loggedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		PreparationDTO returnPrep = service.calculate(dto, loggedUser);
		
		return new ResponseEntity<>(returnPrep, HttpStatus.OK);
	}
	
	@GetMapping(value = "/advices", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_REGISTERED_USER')")
	public ResponseEntity<AdviceMedalDTO> advices() throws FileNotFoundException {
		User loggedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		RegisteredUser ru = service.giveMedal(loggedUser);
		Advice advice = service.giveAdvices(ru);
		AdviceMedalDTO dto = new AdviceMedalDTO(advice.getFirstAdvice(), advice.getSecondAdvice(), advice.getThirdAdvice(), ru.getMedal());
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/calculatedProducts", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_REGISTERED_USER')")
	public ResponseEntity<Preparations> calculatedProducts() throws FileNotFoundException {
		User loggedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Preparations prep = service.calculatedPreparations(loggedUser);
		return new ResponseEntity<>(prep, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/reviews", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_REGISTERED_USER')")
	public ResponseEntity<ReviewPreparationsDTO> reviews() throws FileNotFoundException {
		User loggedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ReviewPreparationsDTO prep = service.giveReviews(loggedUser);
		return new ResponseEntity<>(prep, HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/giveReview", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_REGISTERED_USER')")
	public ResponseEntity<ReviewPreparationsDTO> giveReview(@RequestBody GivenReviewDTO dto) {
		User loggedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ReviewPreparationsDTO returnDto = service.giveReview(loggedUser, dto);
		return new ResponseEntity<>(returnDto, HttpStatus.OK);
	}
}
