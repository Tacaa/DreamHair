package sbnz.integracija.example.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.drools.template.DataProvider;
import org.drools.template.DataProviderCompiler;
import org.drools.template.objects.ArrayDataProvider;
import org.kie.api.builder.Results;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.kie.internal.utils.KieHelper;
import org.kie.api.builder.Message;

import sbnz.integracija.example.enums.ComponentType;
import sbnz.integracija.example.enums.Porosity;
import sbnz.integracija.example.enums.Role;
import sbnz.integracija.example.enums.Medal;
import sbnz.integracija.example.enums.ScalpSensitivity;
import sbnz.integracija.example.enums.ScalpType;
import sbnz.integracija.example.enums.ShampooIntensity;
import sbnz.integracija.example.facts.Advice;
import sbnz.integracija.example.facts.Component;
import sbnz.integracija.example.facts.DailyShampoo;
import sbnz.integracija.example.facts.DeepWashShampoo;
import sbnz.integracija.example.facts.Diary;
import sbnz.integracija.example.facts.Hair;
import sbnz.integracija.example.facts.Mask;
import sbnz.integracija.example.facts.Oil;
import sbnz.integracija.example.facts.PehValues;
import sbnz.integracija.example.facts.Preparation;
import sbnz.integracija.example.facts.Preparations;
import sbnz.integracija.example.facts.Regenerator;
import sbnz.integracija.example.facts.RegisteredUser;
import sbnz.integracija.example.facts.Review;
import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.repositories.UserRepository;



@Service
public class UserService {

	private static Logger log = LoggerFactory.getLogger(UserService.class);
	
	private final KieContainer kieContainer;
	
	@Autowired
	public UserService(KieContainer kieContainer) {
		log.info("Initialising a new user session.");
		this.kieContainer = kieContainer;
	}

	@Autowired
	private UserRepository repository;
	
	public Hair getPreparation(Hair hair) throws FileNotFoundException {
		
		/*
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
		
		
		
		
		
		///////////////////////////////  MEDALJE  ////////////////////////////////////
		
		
		kieSession.fireAllRules();
		kieSession.dispose();
		
		*/
		
		/*
		InputStream template = new FileInputStream(new File("C:\\Users\\Tatjana Gavrilović\\Documents\\SIIT4.2\\SBNZ2\\repo\\DreamHair\\drools-spring-kjar\\src\\main\\resources\\sbnz\\integracija\\medal.drt"));
        System.out.println(template);
		
		
        DataProvider dataProvider = new ArrayDataProvider(new String[][]{
            new String[]{"0", "9", "Medal.BRONZE"},
            new String[]{"10", "29", "Medal.SILVER"},
            new String[]{"30", "1000", "Medal.GOLD"},
        });
        
        DataProviderCompiler converter = new DataProviderCompiler();
        String drl = converter.compile(dataProvider, template);
        
        KieSession kieSession1 = createKieSessionFromDRL(drl);
        
        
		
		RegisteredUser user = new RegisteredUser(1, "taca", "taca", "taca", "taca", Role.REGISTERED_USER);
		
		Diary diary = new Diary();
		LocalDateTime now = LocalDateTime.now();
		List<LocalDateTime> lista1 = new ArrayList<LocalDateTime>();
		lista1.add(now);
		lista1.add(now);
		lista1.add(now);
		lista1.add(now);
		lista1.add(now);
		diary.setHairWash(lista1);
		lista1.add(now);
		lista1.add(now);
		diary.setHairGrowthConsistency(lista1);
		
		user.setDiary(diary);
		
		kieSession1.insert(diary);
        kieSession1.insert(user);
        
        kieSession1.fireAllRules();
		kieSession1.dispose();
        
		
		System.out.println("POZ IZ SERVISA!");
		//System.out.println("OILS ---> " + prep.getOils().size());
		
	//	System.out.println("Masks ---> " + prep.getMasks().size());
		
		System.out.println("\n\n");
		
		System.out.println("Medalja ---> " + user.getMedal());
		
		*/
		
		
		////////////////////////////////// SAVJETI //////////////////////////////////
		
		
		/*
		InputStream template = new FileInputStream(new File("C:\\Users\\Tatjana Gavrilović\\Documents\\SIIT4.2\\SBNZ2\\repo\\DreamHair\\drools-spring-kjar\\src\\main\\resources\\sbnz\\integracija\\advices.drt"));
        System.out.println(template);
		
		
        DataProvider dataProvider = new ArrayDataProvider(new String[][]{
            new String[]{"0", "10", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"11", "30", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"31", "60", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"70", "130", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"136", "265", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"270", "535", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"540", "1075", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"1080", "2155", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"2160", "4310", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"4315", "8625", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"8630", "17255", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            new String[]{"17260", "50000", "Medal.BRONZE", "\"\"", "\"\"", "\"\""},
            
            new String[]{"0", "10", "Medal.SILVER", "\"Upotrijebiti bijelu ili zelenu glinu\"", "\"\"", "\"\""},
            new String[]{"11", "30", "Medal.SILVER", "\"Raditi piling od kafe\"", "\"\"", "\"\""},
            new String[]{"31", "60", "Medal.SILVER", "\"Feniraj kosu okrenutu ka dole\"", "\"\"", "\"\""},
            new String[]{"70", "130", "Medal.SILVER", "\"Izbjegavati aloa veru i glicerin\"", "\"\"", "\"\""},
            new String[]{"136", "265", "Medal.SILVER", "\"Koristiti chia maske\"", "\"\"", "\"\""},
            new String[]{"270", "535", "Medal.SILVER", "\"Maska od želatina\"", "\"\"", "\"\""},
            new String[]{"540", "1075", "Medal.SILVER", "\"Masaža kose sa piskavicom\"", "\"\"", "\"\""},
            new String[]{"1080", "2155", "Medal.SILVER", "\"Ispiranje kose lavandom\"", "\"\"", "\"\""},
            new String[]{"2160", "4310", "Medal.SILVER", "\"Myoceb sampon\"", "\"\"", "\"\""},
            new String[]{"4315", "8625", "Medal.SILVER", "\"Izbjegavati farbanje i hemikalije\"", "\"\"", "\"\""},
            new String[]{"8630", "17255", "Medal.SILVER", "\"Upotreba jaja\"", "\"\"", "\"\""},
            new String[]{"17260", "50000", "Medal.SILVER", "\"Losion kapi za zeludac\"", "\"\"", "\"\""},
            
            new String[]{"0", "10", "Medal.GOLD", "\"Upotrijebiti bijelu ili zelenu glinu\"", "\"Maska od čička\"", "\"Maska od kadulje\""},
            new String[]{"11", "30", "Medal.GOLD", "\"Raditi piling od kafe\"", "\"Cesce prati kosu samponom za dubinsko pranje\"", "\"Koristiti sampon bez silikona\""},
            new String[]{"31", "60", "Medal.GOLD", "\"Feniraj kosu okrenutu ka dole\"", "\"Koristiti losion od koprive\"", "\"Iskoristiti nim prah u maskama\""},
            new String[]{"70", "130", "Medal.GOLD", "\"Izbjegavati aloa veru i glicerin\"", "\"Ne ispirati biljkama\"", "\"Koristiti kreme koje se ne ispiru\""},
            new String[]{"136", "265", "Medal.GOLD", "\"Koristiti chia maske\"", "\"Ne koristiti preparate sa alkoholom\"", "\"Maska od zobenih pahuljica\""},
            new String[]{"270", "535", "Medal.GOLD", "\"Maska od želatina\"", "\"Maska od krompira\"", "\"Maska od gustina\""},
            new String[]{"540", "1075", "Medal.GOLD", "\"Masaža kose sa piskavicom\"", "\"Redovno se sisati\"", "\"Kosu motati u pamučnu majicu\""},
            new String[]{"1080", "2155", "Medal.GOLD", "\"Ispiranje kose lavandom\"", "\"Ulje shea drveta\"", "\"Ispiranje kamilicom\""},
            new String[]{"2160", "4310", "Medal.GOLD", "\"Myoceb sampon\"", "\"Izbjegavati secere\"", "\"Providan jod\""},
            new String[]{"4315", "8625", "Medal.GOLD", "\"Izbjegavati farbanje i hemikalije\"", "\"Upotreba kvasca\"", "\"Upotreba rižine vode\""},
            new String[]{"8630", "17255", "Medal.GOLD", "\"Upotreba jaja\"", "\"Upotreba maske od meda\"", "\"Upotreba losiona od vode\""},
            new String[]{"17260", "50000", "Medal.GOLD", "\"Losion kapi za zeludac\"", "\"Losion na bazi alkohola\"", "\"Tinktura od koprive\""},
        });
        
        DataProviderCompiler converter = new DataProviderCompiler();
        String drl = converter.compile(dataProvider, template);
        
        KieSession kieSession1 = createKieSessionFromDRL(drl);
        
        
		
		RegisteredUser user = new RegisteredUser(1, "taca", "taca", "taca", "taca", Role.REGISTERED_USER);
		user.setMedal(Medal.SILVER);
		Advice advice = new Advice();
		advice.setScore(11);
		user.setAdvices(advice);
		
		
        kieSession1.insert(user);
        
        kieSession1.fireAllRules();
		kieSession1.dispose();
        
		*/
		//System.out.println("POZ IZ SERVISA!");
		//System.out.println("OILS ---> " + prep.getOils().size());
		
		//System.out.println("Masks ---> " + prep.getMasks().size());
		
		//System.out.println("\n\n");
		
		//System.out.println("Advice 1 ---> " + user.getAdvices().getFirstAdvice());
		//System.out.println("Advice 2 ---> " + user.getAdvices().getSecondAdvice());
		//System.out.println("Advice 3 ---> " + user.getAdvices().getThirdAdvice());
		
		//System.out.println("\n Izasla iz servisa, hvala lepo, poy!!!");
		
		//////// RATING ////////
		/*
		PehValues p1 = new PehValues(2.0, 7.0, 4.0);
		
		Review r1 = new Review();
		r1.setRating(1.4);
		Review r2 = new Review();
		r2.setRating(1.2);
		Review r3 = new Review();
		r3.setRating(4.5);
		
		Regenerator reg1 = new Regenerator("reg1", r1, p1, new ArrayList<Component>());
		DailyShampoo d1 = new DailyShampoo("daily1", r2, ScalpType.DRY, new ArrayList<Component>(), p1);
		DeepWashShampoo dw1 = new DeepWashShampoo("dw1", r3, new ArrayList<Component>(), ScalpSensitivity.SENSITIVE, ShampooIntensity.WEAK, p1);
		
		
		
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(reg1);
		kieSession.insert(d1);
		kieSession.insert(dw1);
		
		QueryResults results = kieSession.getQueryResults( "products with grade 2 and less" );
		System.out.println( "we have " + results.size() + " products with grade 2 and less" );


		for ( QueryResultsRow row : results ) {
		    Preparation p = ( Preparation ) row.get( "product" );
		    System.out.println( p.getName() + "\n" );
		}
		*/
		
		/*
		ArrayList<String> comments = new ArrayList<String>();
		comments.add("coment 1");
		comments.add("coment 2");
		Review r1 = new Review();
		r1.setComments(comments);
		
		ArrayList<String> comments2 = new ArrayList<String>();
		comments2.add("coment 1");
		comments2.add("coment 2");
		comments2.add("coment 3");
		comments2.add("coment 4");
		Review r2 = new Review();
		r2.setComments(comments2);
		
		
		ArrayList<String> comments3 = new ArrayList<String>();
		comments3.add("coment 1");
		comments3.add("coment 2");
		comments3.add("coment 3");
		comments3.add("coment 4");
		comments3.add("coment 5");
		comments3.add("coment 6");
		Review r3 = new Review();
		r3.setComments(comments3);
		
		
		PehValues p1 = new PehValues(2.0, 7.0, 4.0);
		Regenerator reg1 = new Regenerator("reg1", r1, p1, new ArrayList<Component>());
		DailyShampoo d1 = new DailyShampoo("daily1", r2, ScalpType.DRY, new ArrayList<Component>(), p1);
		DeepWashShampoo dw1 = new DeepWashShampoo("dw1", r3, new ArrayList<Component>(), ScalpSensitivity.SENSITIVE, ShampooIntensity.WEAK, p1);
		
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(reg1);
		kieSession.insert(d1);
		kieSession.insert(dw1);
		
		QueryResults results = kieSession.getQueryResults( "products with more than x-ic comments",  new Object[] {5});

		
		for ( QueryResultsRow row : results ) {
		    Preparation p = ( Preparation ) row.get( "product" );
		    System.out.println( p.getName() + "\n" );
		}
		
		System.out.println("\n");
		*/
		
		//User user = repository.findById(1);
		//System.out.print(user.getName() + " " + user.getLastname());
		
		return hair;
		
		
	}
	
	
	private KieSession createKieSessionFromDRL(String drl){
        KieHelper kieHelper = new KieHelper();
        kieHelper.addContent(drl, ResourceType.DRL);
        
        Results results = kieHelper.verify();
        
        if (results.hasMessages(Message.Level.WARNING, Message.Level.ERROR)){
            List<Message> messages = results.getMessages(Message.Level.WARNING, Message.Level.ERROR);
            for (Message message : messages) {
                System.out.println("Error: "+message.getText());
            }
            
            throw new IllegalStateException("Compilation errors were found. Check the logs.");
        }
        
        return kieHelper.build().newKieSession();
    }
	
}
