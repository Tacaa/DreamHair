package sbnz.integracija.example;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.dto.UserDTO;
import sbnz.integracija.example.enums.ComponentType;
import sbnz.integracija.example.enums.HairDensity;
import sbnz.integracija.example.enums.HairShape;
import sbnz.integracija.example.enums.HairSoftness;
import sbnz.integracija.example.enums.HairTickness;
import sbnz.integracija.example.enums.HairWeakness;
import sbnz.integracija.example.enums.Porosity;
import sbnz.integracija.example.enums.ScalpSensitivity;
import sbnz.integracija.example.enums.ScalpType;
import sbnz.integracija.example.facts.ExternalInfluences;
import sbnz.integracija.example.facts.Hair;
import sbnz.integracija.example.facts.HairProperty;
import sbnz.integracija.example.facts.Item;
import sbnz.integracija.example.facts.PehValues;
import sbnz.integracija.example.facts.RegisteredUser;
import sbnz.integracija.example.facts.Scalp;
import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.facts.UserInput;
import sbnz.integracija.example.services.UserService;


@RestController
@RequestMapping("sample")
public class SampleAppController {
	private static Logger log = LoggerFactory.getLogger(SampleAppController.class);

	private final SampleAppService sampleService;
	private final UserService userService;

	@Autowired
	public SampleAppController(SampleAppService sampleService, UserService userService) {
		this.sampleService = sampleService;
		this.userService = userService;
	}
	
	
	@GetMapping("/proba")
	public ResponseEntity<UserDTO> proba() {
		System.out.println("TACA");
		User user = this.userService.getUser();
		//System.out.println();
		UserDTO dto = new UserDTO(user.getId(), user.getUsername(), user.getPassword(), user.getName(), user.getLastname());
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	
	@RequestMapping(value = "/item", method = RequestMethod.GET, produces = "application/json")
	public Item getQuestions(@RequestParam(required = true) String id, @RequestParam(required = true) String name,
			@RequestParam(required = true) double cost, @RequestParam(required = true) double salePrice) throws FileNotFoundException {

		System.out.println("TACA");
		User user = this.userService.getUser();
		System.out.println(user.getUsername());
		
		return new Item();
	}
	
	
	
}
