package sbnz.integracija.example.dto;

import java.util.ArrayList;
import java.util.List;

import sbnz.integracija.example.facts.DailyShampoo;
import sbnz.integracija.example.facts.DeepWashShampoo;
import sbnz.integracija.example.facts.Mask;
import sbnz.integracija.example.facts.Oil;
import sbnz.integracija.example.facts.Regenerator;

public class PreparationDTO {
	List<String> oils;
	List<String> masks;
	List<String> regenerators;
	List<String> dailyShampoos;
	List<String> deepWashShampoos;
	
	public List<String> getOils() {
		return oils;
	}
	public void setOils(List<String> oils) {
		this.oils = oils;
	}
	public List<String> getMasks() {
		return masks;
	}
	public void setMasks(List<String> masks) {
		this.masks = masks;
	}
	public List<String> getRegenerators() {
		return regenerators;
	}
	public void setRegenerators(List<String> regenerators) {
		this.regenerators = regenerators;
	}
	public List<String> getDailyShampoos() {
		return dailyShampoos;
	}
	public void setDailyShampoos(List<String> dailyShampoos) {
		this.dailyShampoos = dailyShampoos;
	}
	public List<String> getDeepWashShampoos() {
		return deepWashShampoos;
	}
	public void setDeepWashShampoos(List<String> deepWashShampoos) {
		this.deepWashShampoos = deepWashShampoos;
	}
	
	public PreparationDTO() {
		this.oils = new ArrayList<String>();
		this.masks = new ArrayList<String>();
		this.regenerators = new ArrayList<String>();
		this.dailyShampoos = new ArrayList<String>();
		this.deepWashShampoos = new ArrayList<String>();
	}
	
	
	
}
