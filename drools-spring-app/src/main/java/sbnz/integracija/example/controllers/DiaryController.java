package sbnz.integracija.example.controllers;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.dto.AdviceMedalDTO;
import sbnz.integracija.example.dto.DiaryDTO;
import sbnz.integracija.example.dto.DiarySendDTO;
import sbnz.integracija.example.dto.GivenReviewDTO;
import sbnz.integracija.example.dto.ReviewPreparationsDTO;
import sbnz.integracija.example.facts.Advice;
import sbnz.integracija.example.facts.Diary;
import sbnz.integracija.example.facts.RegisteredUser;
import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.services.DiaryService;

@RestController
@RequestMapping(value = "/diary")
public class DiaryController {
	
	@Autowired
	DiaryService diaryService;
	
	
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_REGISTERED_USER')")
	public ResponseEntity<DiaryDTO> getDiary(){
		User loggedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Diary d = diaryService.getDiary(loggedUser);
		DiaryDTO dto = new DiaryDTO(d.getId(), d.getHairWash(),d.getHairGrowth(), d.getHairState(), d.getComments());
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_REGISTERED_USER')")
	public ResponseEntity<DiaryDTO> postNewThings(@RequestBody DiarySendDTO dto) {
		User loggedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Diary d = diaryService.inputInDiary(loggedUser, dto);
		DiaryDTO dto1 = new DiaryDTO(d.getId(), d.getHairWash(),d.getHairGrowth(), d.getHairState(), d.getComments());
		return new ResponseEntity<>(dto1, HttpStatus.OK);
	}
}
