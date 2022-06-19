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

import sbnz.integracija.example.enums.ComponentType;
import sbnz.integracija.example.enums.HairDensity;
import sbnz.integracija.example.enums.HairShape;
import sbnz.integracija.example.enums.HairSoftness;
import sbnz.integracija.example.enums.HairTickness;
import sbnz.integracija.example.enums.HairWeakness;
import sbnz.integracija.example.enums.Porosity;
import sbnz.integracija.example.enums.Role;
import sbnz.integracija.example.enums.ScalpSensitivity;
import sbnz.integracija.example.enums.ScalpType;
import sbnz.integracija.example.facts.Component;
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

@CrossOrigin(origins = "http://localhost:4200")
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
	public ResponseEntity<User> proba() {
		System.out.println("TACA");
		User user = this.userService.getUser();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/item", method = RequestMethod.GET, produces = "application/json")
	public Item getQuestions(@RequestParam(required = true) String id, @RequestParam(required = true) String name,
			@RequestParam(required = true) double cost, @RequestParam(required = true) double salePrice) throws FileNotFoundException {

		//Item newItem = new Item(Long.parseLong(id), name, cost, salePrice);

		//log.debug("Item request received for: " + newItem);

		//Item i2 = sampleService.getClassifiedItem(newItem);
		//return i;
		
		
		log.debug("Pravimo ulaz --> ");
		
		//RegisteredUser user = new RegisteredUser(1, "taca", "taca", "Tatjana", "Gavrilovic", Role.REGISTERED_USER);
		
		List<Integer> porosity = new ArrayList<Integer>(Arrays.asList(3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2));
	

		String s1 = "Kopriva";
		String s2 = "Lavanda";
		
		List<String> alergies = new ArrayList<String>();
		alergies.add(s1);
		alergies.add(s2);
		
		Scalp scalp = new Scalp(ScalpSensitivity.SENSITIVE, ScalpType.DRY);
		
		UserInput input = new UserInput(HairShape.A1, HairTickness.THIN, true, HairDensity.SPARSE, alergies, porosity, scalp, new ExternalInfluences());
		HairProperty property = new HairProperty(HairSoftness.NA, HairWeakness.NA, false, false, false, false, false, false);
		
		PehValues peh = new PehValues(-1, -1, -1);
		
		Hair hair = new Hair(input, property, Porosity.NA, peh);
		
		Hair returnHair = userService.getPreparation(hair);
		
		//System.out.println((returnHair.getPehValues().getProteinsPercentage()/9)*100);
		System.out.println(returnHair.getPehValues().getProteinsPercentage());
		System.out.println(returnHair.getPehValues().getEmollientsPercentage());
		System.out.println(returnHair.getPehValues().getHumectansPercentage());
		
		return new Item();
	}
	
	
	
}
