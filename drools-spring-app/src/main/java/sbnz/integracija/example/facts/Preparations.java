package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Preparations implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocalDateTime dateOfRecommendation;
	private List<Mask> masks;
	private List<Oil> oils;
	private List<Regenerator>regenerators;
	private List<DailyShampoo> dailyShampoos;
	private List<DeepWashShampoo> deepWashShampoos;
	
	private boolean current;

	
	
	public Preparations(LocalDateTime dateOfRecommendation, boolean current) {
		super();
		this.dateOfRecommendation = dateOfRecommendation;
		this.current = current;
		this.masks = new ArrayList<Mask>();
		this.regenerators = new ArrayList<Regenerator>();
		this.oils = new ArrayList<Oil>();
		this.dailyShampoos = new ArrayList<DailyShampoo>();
		this.deepWashShampoos = new ArrayList<DeepWashShampoo>();
		
	}


	public Preparations() {
		super();
	}



	public LocalDateTime getDateOfRecommendation() {
		return dateOfRecommendation;
	}


	public void setDateOfRecommendation(LocalDateTime dateOfRecommendation) {
		this.dateOfRecommendation = dateOfRecommendation;
	}



	public List<Mask> getMasks() {
		return masks;
	}


	public void setMasks(List<Mask> masks) {
		this.masks = masks;
	}


	public List<Oil> getOils() {
		return oils;
	}


	public void setOils(List<Oil> oils) {
		this.oils = oils;
	}


	public List<Regenerator> getRegenerators() {
		return regenerators;
	}


	public void setRegenerators(List<Regenerator> regenerators) {
		this.regenerators = regenerators;
	}


	public List<DailyShampoo> getDailyShampoos() {
		return dailyShampoos;
	}


	public void setDailyShampoos(List<DailyShampoo> dailyShampoos) {
		this.dailyShampoos = dailyShampoos;
	}


	public List<DeepWashShampoo> getDeepWashShampoos() {
		return deepWashShampoos;
	}


	public void setDeepWashShampoos(List<DeepWashShampoo> deepWashShampoos) {
		this.deepWashShampoos = deepWashShampoos;
	}


	public boolean isCurrent() {
		return current;
	}


	public void setCurrent(boolean current) {
		this.current = current;
	}


	
	
}
