package sbnz.integracija.example.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.enums.ComponentType;
import sbnz.integracija.example.enums.Porosity;
import sbnz.integracija.example.enums.ScalpSensitivity;
import sbnz.integracija.example.enums.ScalpType;
import sbnz.integracija.example.enums.ShampooIntensity;
import sbnz.integracija.example.facts.Component;
import sbnz.integracija.example.facts.DailyShampoo;
import sbnz.integracija.example.facts.DeepWashShampoo;
import sbnz.integracija.example.facts.Hair;
import sbnz.integracija.example.facts.Mask;
import sbnz.integracija.example.facts.Oil;
import sbnz.integracija.example.facts.PehValues;
import sbnz.integracija.example.facts.Preparation;
import sbnz.integracija.example.facts.Preparations;
import sbnz.integracija.example.facts.Regenerator;
import sbnz.integracija.example.facts.Review;



@Service
public class UserService {

	private static Logger log = LoggerFactory.getLogger(UserService.class);
	
	private final KieContainer kieContainer;
	
	@Autowired
	public UserService(KieContainer kieContainer) {
		log.info("Initialising a new user session.");
		this.kieContainer = kieContainer;
	}

	public Hair getPreparation(Hair hair) {
		Preparations prep = new Preparations(LocalDateTime.now(), true);
		
		Oil o1 = new Oil("Kokos", new Review(), Porosity.LOW);
		Oil o2 = new Oil("Shia", new Review(), Porosity.LOW);
		Oil o3 = new Oil("Ricinus", new Review(), Porosity.MEDIUM);
		Oil o4 = new Oil("Maslina", new Review(), Porosity.MEDIUM);
		Oil o5 = new Oil("Lavanda", new Review(), Porosity.HIGH);
		Oil o6 = new Oil("Piskavica", new Review(), Porosity.HIGH);
		
		PehValues p1 = new PehValues(2.0, 7.0, 4.0);
		Mask m1 = new Mask("Maskica", new Review(), p1);
		
		String s1 = "Kopriva";
		String s2 = "Lavanda";
		
		List<String> alergies = new ArrayList<String>();
		alergies.add(s1);
		alergies.add(s2);
		
		
		Mask m2 = new Mask("Maskica 2", new Review(), p1);
		m2.setComponents(alergies);
		
		Regenerator r1 = new Regenerator("reg1", new Review(), p1, new ArrayList<Component>());
		DailyShampoo d1 = new DailyShampoo("daily1", new Review(), ScalpType.DRY, new ArrayList<Component>(), p1);
		DeepWashShampoo dw1 = new DeepWashShampoo("dw1", new Review(), new ArrayList<Component>(), ScalpSensitivity.SENSITIVE, ShampooIntensity.WEAK, p1);
		
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(hair.getPehValues());
		kieSession.insert(hair.getHairProperty());
		kieSession.insert(hair.getUserInput());
		kieSession.insert(hair);
		kieSession.insert(prep);
		kieSession.insert(hair.getUserInput().getScalp());
		
		kieSession.insert(m1);
		kieSession.insert(m2);
		
		kieSession.insert(r1);
		kieSession.insert(d1);
		kieSession.insert(dw1);
		
		
		kieSession.insert(o1);
		kieSession.insert(o2);
		kieSession.insert(o3);
		kieSession.insert(o4);
		kieSession.insert(o5);
		kieSession.insert(o6);
		
		
		kieSession.fireAllRules();
		kieSession.dispose();
		
		
		System.out.println("POZ IZ SERVISA!");
		System.out.println("OILS ---> " + prep.getOils().size());
		
		System.out.println("Masks ---> " + prep.getMasks().size());
		
		return hair;
		
		
		
		
	}
	
	
}
