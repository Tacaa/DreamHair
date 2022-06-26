package sbnz.integracija.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sbnz.integracija.example.dto.OnePreparationDTO;
import sbnz.integracija.example.dto.ReviewDTO;
import sbnz.integracija.example.dto.ReviewPreparationsDTO;
import sbnz.integracija.example.facts.DailyShampoo;
import sbnz.integracija.example.facts.DeepWashShampoo;
import sbnz.integracija.example.facts.Mask;
import sbnz.integracija.example.facts.Oil;
import sbnz.integracija.example.facts.Preparation;
import sbnz.integracija.example.facts.Preparations;
import sbnz.integracija.example.facts.Regenerator;
import sbnz.integracija.example.repositories.PreparationsRepository;
import sbnz.integracija.example.repositories.ProductsRepository;

@Service
public class AdminService {
	
	@Autowired
	ProductsRepository productsRepository;
	
	private static Logger log = LoggerFactory.getLogger(UserService.class);
	private final KieContainer kieContainer;
	
	@Autowired
	public AdminService(KieContainer kieContainer) {
		log.info("Initialising a new user session.");
		this.kieContainer = kieContainer;
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

	public ReviewPreparationsDTO getAll() {
		Preparations prep = new Preparations();
		List<Oil> o = productsRepository.findAllOils();
		List<Mask> m = productsRepository.findAllMask();
		List<Regenerator> r = productsRepository.findAllRegenerators();
		List<DailyShampoo> ds = productsRepository.findAllDailyShampoos();
		List<DeepWashShampoo> dws = productsRepository.findAllDeepWashShampoos();
		
		prep.setDailyShampoos(ds);
		prep.setDeepWashShampoos(dws);
		prep.setMasks(m);
		prep.setRegenerators(r);
		prep.setOils(o);
		
		ReviewPreparationsDTO dto =  transformIntoReviewDTO(prep);
		
		return dto;
	}
	
	public OnePreparationDTO transform(Preparation prep) {
		ReviewDTO r = new ReviewDTO();
		r.setId(prep.getReview().getId());
		r.setRating(prep.getReview().getRating());
		r.setComments(prep.getReview().getComments());
		
		OnePreparationDTO dto = new OnePreparationDTO();
		dto.setId(prep.getId());
		dto.setName(prep.getName());
		dto.setReview(r);
		return dto;
		
	}
	
	public List<OnePreparationDTO> getLittleGrades(int x) {
		Preparations prep = new Preparations();
		List<Oil> o = productsRepository.findAllOils();
		List<Mask> m = productsRepository.findAllMask();
		List<Regenerator> r = productsRepository.findAllRegenerators();
		List<DailyShampoo> ds = productsRepository.findAllDailyShampoos();
		List<DeepWashShampoo> dws = productsRepository.findAllDeepWashShampoos();
		
		KieSession kieSession = kieContainer.newKieSession();
		
		for(int i = 0; i<o.size(); i++) {
			if(o.get(i).getReview() != null) {
				kieSession.insert(o.get(i));
			}
		}
		
		for(int i = 0; i<m.size(); i++) {
			if(m.get(i).getReview() != null) {
				kieSession.insert(m.get(i));
			}
		}
		
		for(int i = 0; i<r.size(); i++) {
			if(r.get(i).getReview() != null) {
				kieSession.insert(r.get(i));
			}
		}
		
		for(int i = 0; i<ds.size(); i++) {
			if(ds.get(i).getReview() != null) {
				kieSession.insert(ds.get(i));
			}
		}
		
		for(int i = 0; i<dws.size(); i++) {
			if(dws.get(i).getReview() != null) {
				kieSession.insert(dws.get(i));
			}
		}
		
		List<OnePreparationDTO> list = new ArrayList<OnePreparationDTO>();
		
		QueryResults results = kieSession.getQueryResults( "products with grade x-ic and less",  new Object[] {x});
		for ( QueryResultsRow row : results ) {
			Preparation p = ( Preparation ) row.get( "product" );
			OnePreparationDTO op = transform(p);
			list.add(op);
		}
		
		return list;
	}
	
	
	
	
	public List<OnePreparationDTO> getBigGrades(int x) {
		Preparations prep = new Preparations();
		List<Oil> o = productsRepository.findAllOils();
		List<Mask> m = productsRepository.findAllMask();
		List<Regenerator> r = productsRepository.findAllRegenerators();
		List<DailyShampoo> ds = productsRepository.findAllDailyShampoos();
		List<DeepWashShampoo> dws = productsRepository.findAllDeepWashShampoos();
		
		KieSession kieSession = kieContainer.newKieSession();
		
		for(int i = 0; i<o.size(); i++) {
			if(o.get(i).getReview() != null) {
				kieSession.insert(o.get(i));
			}
		}
		
		for(int i = 0; i<m.size(); i++) {
			if(m.get(i).getReview() != null) {
				kieSession.insert(m.get(i));
			}
		}
		
		for(int i = 0; i<r.size(); i++) {
			if(r.get(i).getReview() != null) {
				kieSession.insert(r.get(i));
			}
		}
		
		for(int i = 0; i<ds.size(); i++) {
			if(ds.get(i).getReview() != null) {
				kieSession.insert(ds.get(i));
			}
		}
		
		for(int i = 0; i<dws.size(); i++) {
			if(dws.get(i).getReview() != null) {
				kieSession.insert(dws.get(i));
			}
		}
		
		List<OnePreparationDTO> list = new ArrayList<OnePreparationDTO>();
		
		QueryResults results = kieSession.getQueryResults( "products with grade x-ic and more",  new Object[] {x});
		for ( QueryResultsRow row : results ) {
			Preparation p = ( Preparation ) row.get( "product" );
			OnePreparationDTO op = transform(p);
			list.add(op);
		}
		
		return list;
	}
	
	
	
	
	public List<OnePreparationDTO> getLittleComments(int x) {
		Preparations prep = new Preparations();
		List<Oil> o = productsRepository.findAllOils();
		List<Mask> m = productsRepository.findAllMask();
		List<Regenerator> r = productsRepository.findAllRegenerators();
		List<DailyShampoo> ds = productsRepository.findAllDailyShampoos();
		List<DeepWashShampoo> dws = productsRepository.findAllDeepWashShampoos();
		
		KieSession kieSession = kieContainer.newKieSession();
		
		for(int i = 0; i<o.size(); i++) {
			if(o.get(i).getReview() != null) {
				kieSession.insert(o.get(i));
			}
		}
		
		for(int i = 0; i<m.size(); i++) {
			if(m.get(i).getReview() != null) {
				kieSession.insert(m.get(i));
			}
		}
		
		for(int i = 0; i<r.size(); i++) {
			if(r.get(i).getReview() != null) {
				kieSession.insert(r.get(i));
			}
		}
		
		for(int i = 0; i<ds.size(); i++) {
			if(ds.get(i).getReview() != null) {
				kieSession.insert(ds.get(i));
			}
		}
		
		for(int i = 0; i<dws.size(); i++) {
			if(dws.get(i).getReview() != null) {
				kieSession.insert(dws.get(i));
			}
		}
		
		List<OnePreparationDTO> list = new ArrayList<OnePreparationDTO>();
		
		QueryResults results = kieSession.getQueryResults( "products with less than x-ic comments",  new Object[] {x});
		for ( QueryResultsRow row : results ) {
			Preparation p = ( Preparation ) row.get( "product" );
			OnePreparationDTO op = transform(p);
			list.add(op);
		}
		
		return list;
	}
	
	
	
	
	public List<OnePreparationDTO> getBigComments(int x) {
		Preparations prep = new Preparations();
		List<Oil> o = productsRepository.findAllOils();
		List<Mask> m = productsRepository.findAllMask();
		List<Regenerator> r = productsRepository.findAllRegenerators();
		List<DailyShampoo> ds = productsRepository.findAllDailyShampoos();
		List<DeepWashShampoo> dws = productsRepository.findAllDeepWashShampoos();
		
		KieSession kieSession = kieContainer.newKieSession();
		
		for(int i = 0; i<o.size(); i++) {
			if(o.get(i).getReview() != null) {
				kieSession.insert(o.get(i));
			}
		}
		
		for(int i = 0; i<m.size(); i++) {
			if(m.get(i).getReview() != null) {
				kieSession.insert(m.get(i));
			}
		}
		
		for(int i = 0; i<r.size(); i++) {
			if(r.get(i).getReview() != null) {
				kieSession.insert(r.get(i));
			}
		}
		
		for(int i = 0; i<ds.size(); i++) {
			if(ds.get(i).getReview() != null) {
				kieSession.insert(ds.get(i));
			}
		}
		
		for(int i = 0; i<dws.size(); i++) {
			if(dws.get(i).getReview() != null) {
				kieSession.insert(dws.get(i));
			}
		}
		
		List<OnePreparationDTO> list = new ArrayList<OnePreparationDTO>();
		
		QueryResults results = kieSession.getQueryResults( "products with more than x-ic comments",  new Object[] {x});
		for ( QueryResultsRow row : results ) {
			Preparation p = ( Preparation ) row.get( "product" );
			OnePreparationDTO op = transform(p);
			list.add(op);
		}
		
		return list;
	}
}
