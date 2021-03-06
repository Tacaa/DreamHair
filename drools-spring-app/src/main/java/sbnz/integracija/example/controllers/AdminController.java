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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.dto.DSDTO;
import sbnz.integracija.example.dto.DWSDTO;
import sbnz.integracija.example.dto.GivenReviewDTO;
import sbnz.integracija.example.dto.MaskRegDTO;
import sbnz.integracija.example.dto.OilDTO;
import sbnz.integracija.example.dto.OnePreparationDTO;
import sbnz.integracija.example.dto.ReviewPreparationsDTO;
import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.services.AdminService;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<ReviewPreparationsDTO> reviews() {
		ReviewPreparationsDTO prep = service.getAll();
		return new ResponseEntity<>(prep, HttpStatus.OK);
	}
	
	@GetMapping(value = "/littleGrade/{grade}", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<List<OnePreparationDTO>> littleGrade(@PathVariable("grade") Integer grade) {
		System.out.println("USLI U GRADE");
		List<OnePreparationDTO> list = service.getLittleGrades(grade);
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/bigGrade/{grade}", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<List<OnePreparationDTO>> bigGrade(@PathVariable("grade") Integer grade) {
		List<OnePreparationDTO> list = service.getBigGrades(grade);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/littleComment/{numComments}", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<List<OnePreparationDTO>> littleComment(@PathVariable("numComments") Integer numComments) {
		List<OnePreparationDTO> list = service.getLittleComments(numComments);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	
	@GetMapping(value = "/bigComment/{numComments}", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<List<OnePreparationDTO>> bigComment(@PathVariable("numComments") Integer numComments) {
		System.out.println("USLI U GRADE");
		List<OnePreparationDTO> list = service.getBigComments(numComments);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/postDSW", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<DWSDTO> postDSW(@RequestBody DWSDTO dto) {
		service.addDWS(dto);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/postOil", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<OilDTO> postOil(@RequestBody OilDTO dto) {
		System.out.println("ULJE");
		service.addOil(dto);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/postMask", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<MaskRegDTO> postMask(@RequestBody MaskRegDTO dto) {
		service.addMask(dto);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@PostMapping(value = "/postReg", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<MaskRegDTO> postReg(@RequestBody MaskRegDTO dto) {
		service.addReg(dto);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@PostMapping(value = "/postDS", produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<DSDTO> postDS(@RequestBody DSDTO dto) {
		service.addDS(dto);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}


}
