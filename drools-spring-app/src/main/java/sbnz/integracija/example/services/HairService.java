package sbnz.integracija.example.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.utils.KieHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.drools.template.DataProvider;
import org.drools.template.DataProviderCompiler;
import org.drools.template.objects.ArrayDataProvider;

import sbnz.integracija.example.dto.GivenReviewDTO;
import sbnz.integracija.example.dto.OnePreparationDTO;
import sbnz.integracija.example.dto.PreparationDTO;
import sbnz.integracija.example.dto.ReviewDTO;
import sbnz.integracija.example.dto.ReviewPreparationsDTO;
import sbnz.integracija.example.dto.UserInputDTO;
import sbnz.integracija.example.enums.HairSoftness;
import sbnz.integracija.example.enums.HairWeakness;
import sbnz.integracija.example.enums.Porosity;
import sbnz.integracija.example.enums.ScalpType;
import sbnz.integracija.example.facts.Advice;
import sbnz.integracija.example.facts.DailyShampoo;
import sbnz.integracija.example.facts.DeepWashShampoo;
import sbnz.integracija.example.facts.ExternalInfluences;
import sbnz.integracija.example.facts.Hair;
import sbnz.integracija.example.facts.HairProperty;
import sbnz.integracija.example.facts.Mask;
import sbnz.integracija.example.facts.Oil;
import sbnz.integracija.example.facts.PehValues;
import sbnz.integracija.example.facts.Preparation;
import sbnz.integracija.example.facts.Preparations;
import sbnz.integracija.example.facts.Regenerator;
import sbnz.integracija.example.facts.RegisteredUser;
import sbnz.integracija.example.facts.Review;
import sbnz.integracija.example.facts.Scalp;
import sbnz.integracija.example.facts.User;
import sbnz.integracija.example.facts.UserInput;
import sbnz.integracija.example.repositories.AdviceRepository;
import sbnz.integracija.example.repositories.PreparationsRepository;
import sbnz.integracija.example.repositories.ProductsRepository;
import sbnz.integracija.example.repositories.ReviewRepository;
import sbnz.integracija.example.repositories.UserRepository;


@Service
public class HairService {
	
	private static Logger log = LoggerFactory.getLogger(UserService.class);
	private final KieContainer kieContainer;
	
	@Autowired
	public HairService(KieContainer kieContainer) {
		log.info("Initialising a new user session.");
		this.kieContainer = kieContainer;
	}
	
	@Autowired
	ProductsRepository productsRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PreparationsRepository preparationsRepository;
	
	@Autowired
	AdviceRepository adviceRepo;
	
	@Autowired
	ReviewRepository reviewRepository;
	
	
	public Preparations calculatedPreparations(User user) {
		RegisteredUser ru = userRepository.findRegisteredUser(user.getId());
		return ru.getPreparations();
	}
	
	public PreparationDTO calculate(UserInputDTO dto, User user) {
		Scalp scalp = new Scalp();
		scalp.setScalpSensitivity(dto.getScalpSensitivity());
		scalp.setScalpType(dto.getScalpType());
		
		ExternalInfluences external = new ExternalInfluences();
		external.setBleachedHair(dto.isBleachedHair());
		external.setDandruff(dto.isDandruff());
		external.setDyedHair(dto.isDyedHair());
		external.setFungal(dto.isFungal());
		external.setItching(dto.isItching());
		external.setOperation(dto.isOperation());
		external.setPregnacy(dto.isPregnacy());
		external.setSickness(dto.isSickness());
		
		UserInput input = new UserInput();
		input.setExternalInfluences(external);
		input.setScalp(scalp);
		input.setHairDensity(dto.getHairDensity());
		input.setHairElasticity(dto.isHairElasticity());
		input.setHairTickness(dto.getHairTickness());
		input.setHairShape(dto.getHairShape());
		input.setPorosityInput(dto.getPorosityInput());
		
		HairProperty property = new HairProperty();
		property.setHairSoftness(HairSoftness.NA);
		property.setHairWeakness(HairWeakness.NA);
		property.setDry(false);
		property.setFragile(false);
		property.setHairShine(false);
		property.setHairVolume(false);
		property.setInflating(false);
		property.setTangling(false);
		
		PehValues peh = new PehValues();
		peh.setEmollientsPercentage(-1);
		peh.setHumectansPercentage(-1);
		peh.setProteinsPercentage(-1);
		
		Hair hair = new Hair();
		hair.setHairPorosity(Porosity.NA);
		hair.setHairProperty(property);
		hair.setPehValues(peh);
		hair.setUserInput(input);
		
		List<Mask> masks = productsRepository.findAllMask();
		List<Regenerator> regs = productsRepository.findAllRegenerators();
		List<DailyShampoo> daylies = productsRepository.findAllDailyShampoos();
		List<DeepWashShampoo> deep = productsRepository.findAllDeepWashShampoos();
		List<Oil> oils = productsRepository.findAllOils();
		
		
		
		Preparations prep = new Preparations();
		prep.setCurrent(true);
		prep.setDateOfRecommendation(LocalDateTime.now());
		prep.setDailyShampoos(new ArrayList<DailyShampoo>());
		prep.setDeepWashShampoos(new ArrayList<DeepWashShampoo>());
		prep.setMasks(new ArrayList<Mask>());
		prep.setOils(new ArrayList<Oil>());
		prep.setRegenerators(new ArrayList<Regenerator>());
		
		System.out.println(prep.getMasks().size());
		
		
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(hair.getUserInput().getScalp());
		kieSession.insert(hair.getPehValues());
		kieSession.insert(hair.getHairProperty());
		kieSession.insert(hair.getUserInput());
		kieSession.insert(hair);
		
		kieSession.insert(prep);
		
		for(int i = 0; i<masks.size(); i++) {
			if(masks.get(i).getReview() == null) {
				masks.get(i).setReview(new Review());
			}
			kieSession.insert(masks.get(i));
		}
		
		for(int i = 0; i<regs.size(); i++) {
			if(regs.get(i).getReview() == null) {
				regs.get(i).setReview(new Review());
			}
			kieSession.insert(regs.get(i));
		}
		
		
		for(int i = 0; i<daylies.size(); i++) {
			if(daylies.get(i).getReview() == null) {
				daylies.get(i).setReview(new Review());
			}
			kieSession.insert(daylies.get(i));
		}
		
		
		for(int i = 0; i<deep.size(); i++) {
			if(deep.get(i).getReview() == null) {
				deep.get(i).setReview(new Review());
			}
			kieSession.insert(deep.get(i));
		}
		
		
		for(int i = 0; i<oils.size(); i++) {
			if(oils.get(i).getReview() == null) {
				oils.get(i).setReview(new Review());
			}
			kieSession.insert(oils.get(i));
		}
		
		
		
		kieSession.fireAllRules();
		kieSession.dispose();
		
		System.out.println("Izracunata poroznost ---> " + hair.getHairPorosity());
		System.out.println("Izracunati property ---> " + hair.getHairProperty().toString());
		System.out.println("Izracunati peh ---> " + hair.getPehValues().toString());
		
		
		System.out.println("Maske: " + prep.getMasks().size());
		
		for(int i = 0; i<prep.getMasks().size(); i++) {
			System.out.println(prep.getMasks().get(i));
		}
		
		System.out.println("Regs: " + prep.getRegenerators().size());
				
		for(int i = 0; i<prep.getRegenerators().size(); i++) {
			System.out.println(prep.getRegenerators().get(i));
		}
				
		System.out.println("Dailys: " + prep.getDailyShampoos().size());
				
		for(int i = 0; i<prep.getDailyShampoos().size(); i++) {
			System.out.println(prep.getDailyShampoos().get(i));
		}
		
		System.out.println("Deep: " + prep.getDeepWashShampoos().size());
				
		for(int i = 0; i<prep.getDeepWashShampoos().size(); i++) {
			System.out.println(prep.getDeepWashShampoos().get(i));
		}
		
		System.out.println("Oils: " + prep.getOils().size());
				
		for(int i = 0; i<prep.getOils().size(); i++) {
			System.out.println(prep.getOils().get(i));
		}
		
		
		
		
		RegisteredUser ru = userRepository.findRegisteredUser(user.getId());
		
		
		prep.setUser(ru);
		preparationsRepository.save(prep);
		
		
		
		int adviceScore = calculateAdviceScore(hair);
		Advice advice = new Advice();
		advice.setScore(adviceScore);
		adviceRepo.save(advice);
		ru.setAdvices(advice);
		//return null;
		
		
		
		ru.setPreparations(prep);
		userRepository.save(ru);
		
		return transforminDTO(prep);
		
	}
	
	
	public PreparationDTO transforminDTO(Preparations prep) {
		PreparationDTO dto = new PreparationDTO();
		
		for(int i = 0; i<prep.getDailyShampoos().size(); i++) {
			dto.getDailyShampoos().add(prep.getDailyShampoos().get(i).getName());
		}
		
		for(int i = 0; i<prep.getDeepWashShampoos().size(); i++) {
			dto.getDeepWashShampoos().add(prep.getDeepWashShampoos().get(i).getName());
		}
		
		for(int i = 0; i<prep.getMasks().size(); i++) {
			dto.getMasks().add(prep.getMasks().get(i).getName());
		}
		
		for(int i = 0; i<prep.getRegenerators().size(); i++) {
			dto.getRegenerators().add(prep.getRegenerators().get(i).getName());
		}
		
		for(int i = 0; i<prep.getOils().size(); i++) {
			dto.getOils().add(prep.getOils().get(i).getName());
		}
		
		return dto;
		
	}
	
	
	
	private int calculateAdviceScore(Hair hair) {
		int adviceScore = 0;
		if(hair.getUserInput().getScalp().getScalpType() == ScalpType.GREASY) {
			adviceScore += 10;
		}
		
		if(hair.getUserInput().getExternalInfluences().isItching()) {
			adviceScore += 20;
		}
		
		if(hair.getHairProperty().isHairVolume()) {
			adviceScore += 30;
		}
		
		if(hair.getHairProperty().isInflating()) {
			adviceScore += 70;
		}
		
		if(hair.getHairProperty().isDry()) {
			adviceScore += 135;
		}
		
		if(hair.getUserInput().getExternalInfluences().isBleachedHair() && hair.getUserInput().getExternalInfluences().isDyedHair()) {
			adviceScore += 270;
		}
		
		if(hair.getHairProperty().getHairWeakness() == HairWeakness.WEAK) {
			adviceScore += 540;
		}
		
		if(hair.getUserInput().getExternalInfluences().isDandruff()) {
			adviceScore += 1080;
		}
		if(hair.getUserInput().getExternalInfluences().isFungal()) {
			adviceScore += 2160;
		}
		if(hair.getUserInput().getExternalInfluences().isPregnacy()) {
			adviceScore += 4315;
		}
		if(hair.getUserInput().getExternalInfluences().isSickness()) {
			adviceScore += 8630;
		}
		if(hair.getUserInput().getExternalInfluences().isOperation()) {
			adviceScore += 17255;
		}
		
		return adviceScore;
	}
	
	
	public RegisteredUser giveMedal(User user) throws FileNotFoundException {
		RegisteredUser ru = userRepository.findRegisteredUser(user.getId());
		//System.out.println(ru.getDiary().toString());
		
		InputStream template = new FileInputStream(new File("C:\\Users\\Tatjana Gavrilović\\Documents\\SIIT4.2\\SBNZ2\\repo\\DreamHair\\drools-spring-kjar\\src\\main\\resources\\sbnz\\integracija\\medal.drt"));
        System.out.println(template);
		
		
        DataProvider dataProvider = new ArrayDataProvider(new String[][]{
            new String[]{"0", "9", "Medal.BRONZE"},
            new String[]{"10", "19", "Medal.SILVER"},
            new String[]{"20", "1000", "Medal.GOLD"},
        });
        
        DataProviderCompiler converter = new DataProviderCompiler();
        String drl = converter.compile(dataProvider, template);
        
        KieSession kieSession1 = createKieSessionFromDRL(drl);
		
        kieSession1.insert(ru.getDiary());
        kieSession1.insert(ru);
        
        kieSession1.fireAllRules();
		kieSession1.dispose();
		
		return ru;
		
	}
	
	
	public Advice giveAdvices(RegisteredUser user) throws FileNotFoundException {
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
        
        kieSession1.insert(user);
        
        kieSession1.fireAllRules();
		kieSession1.dispose();
        
		System.out.println("\n\n" + user.getAdvices().toString());
        
        return user.getAdvices();
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
	
	public ReviewPreparationsDTO giveReviews(User user) {
		RegisteredUser ru = userRepository.findRegisteredUser(user.getId());
		return transformIntoReviewDTO(ru.getPreparations());
	}
	
	public ReviewPreparationsDTO transformIntoReviewDTO(Preparations prep) {
		ReviewPreparationsDTO dto = new ReviewPreparationsDTO();
		
		for(int i = 0; i<prep.getDailyShampoos().size(); i++) {
			ReviewDTO r = new ReviewDTO();
			r.setId(-1);
			if(prep.getDailyShampoos().get(i).getReview() != null) {
				r.setId(prep.getDailyShampoos().get(i).getReview().getId());
				r.setComments(prep.getDailyShampoos().get(i).getReview().getComments());
				r.setRating(prep.getDailyShampoos().get(i).getReview().getRating());
			}
			OnePreparationDTO op = new OnePreparationDTO();
			op.setId(prep.getDailyShampoos().get(i).getId());
			op.setName(prep.getDailyShampoos().get(i).getName());
			op.setReview(r);
			dto.getDailyShampoos().add(op);
		}
		
		for(int i = 0; i<prep.getDeepWashShampoos().size(); i++) {
			ReviewDTO r = new ReviewDTO();
			r.setId(-1);
			if(prep.getDeepWashShampoos().get(i).getReview() != null) {
				r.setId(prep.getDeepWashShampoos().get(i).getReview().getId());
				r.setComments(prep.getDeepWashShampoos().get(i).getReview().getComments());
				r.setRating(prep.getDeepWashShampoos().get(i).getReview().getRating());
			}
			OnePreparationDTO op = new OnePreparationDTO();
			op.setId(prep.getDeepWashShampoos().get(i).getId());
			op.setName(prep.getDeepWashShampoos().get(i).getName());
			op.setReview(r);
			dto.getDeepWashShampoos().add(op);
		}
		
		for(int i = 0; i<prep.getMasks().size(); i++) {
			ReviewDTO r = new ReviewDTO();
			r.setId(-1);
			if(prep.getMasks().get(i).getReview() != null) {
				r.setId(prep.getMasks().get(i).getReview().getId());
				r.setComments(prep.getMasks().get(i).getReview().getComments());
				r.setRating(prep.getMasks().get(i).getReview().getRating());
			}
			OnePreparationDTO op = new OnePreparationDTO();
			op.setId(prep.getMasks().get(i).getId());
			op.setName(prep.getMasks().get(i).getName());
			op.setReview(r);
			dto.getMasks().add(op);
		}
		
		for(int i = 0; i<prep.getRegenerators().size(); i++) {
			ReviewDTO r = new ReviewDTO();
			r.setId(-1);
			if(prep.getRegenerators().get(i).getReview() != null) {
				r.setId(prep.getRegenerators().get(i).getReview().getId());
				r.setComments(prep.getRegenerators().get(i).getReview().getComments());
				r.setRating(prep.getRegenerators().get(i).getReview().getRating());
			}
			OnePreparationDTO op = new OnePreparationDTO();
			op.setId(prep.getRegenerators().get(i).getId());
			op.setName(prep.getRegenerators().get(i).getName());
			op.setReview(r);
			dto.getRegenerators().add(op);
		}
		
		for(int i = 0; i<prep.getOils().size(); i++) {
			ReviewDTO r = new ReviewDTO();
			r.setId(-1);
			if(prep.getOils().get(i).getReview() != null) {
				r.setId(prep.getOils().get(i).getReview().getId());
				r.setComments(prep.getOils().get(i).getReview().getComments());
				r.setRating(prep.getOils().get(i).getReview().getRating());
			}
			OnePreparationDTO op = new OnePreparationDTO();
			op.setId(prep.getOils().get(i).getId());
			op.setName(prep.getOils().get(i).getName());
			op.setReview(r);
			dto.getOils().add(op);
		}
		
		return dto;
	}
	
	private double calculateReview(List<String>ratings) {
		double rate = 0;
		for(int i = 0; i<ratings.size(); i++) {
			rate += Double.parseDouble(ratings.get(i));
		}
		double returnRating = rate/ratings.size();
		return returnRating;
	}
	
	public ReviewPreparationsDTO giveReview(User user, GivenReviewDTO dto) {
		Review review = reviewRepository.findById(dto.getId());
		if(review == null) {
			review = new Review();
			review.setComments(new ArrayList<String>());
			review.setListOfRatings(new ArrayList<String>());
		}
		
		if(dto.getComment().equals("")) {
			List<String>cs = new ArrayList<String>();
			for(int i = 0; i<review.getComments().size(); i++) {
				cs.add(review.getComments().get(i));
			}
			cs.add(dto.getComment());
			review.setComments(cs);
			
		}
		
		if(dto.getRate() != -1) {
			List<String>rs = new ArrayList<String>();
			for(int i = 0; i<review.getListOfRatings().size(); i++) {
				rs.add(review.getListOfRatings().get(i));
			}
			rs.add(String.valueOf(dto.getRate()));
			//review.getListOfRatings().add(String.valueOf(dto.getRate()));
			review.setListOfRatings(rs);
			review.setRating(calculateReview(rs));
		}
		
		reviewRepository.save(review);
		RegisteredUser ru = userRepository.findRegisteredUser(user.getId());
		System.out.println(ru.getPreparations());
		return transformIntoReviewDTO(ru.getPreparations());
		
	}
}
