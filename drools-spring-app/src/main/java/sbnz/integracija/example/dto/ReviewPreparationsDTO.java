package sbnz.integracija.example.dto;

import java.util.ArrayList;
import java.util.List;

public class ReviewPreparationsDTO {
	List<OnePreparationDTO> oils;
	List<OnePreparationDTO> masks;
	List<OnePreparationDTO> regenerators;
	List<OnePreparationDTO> dailyShampoos;
	List<OnePreparationDTO> deepWashShampoos;
	
	
	public ReviewPreparationsDTO() {
		this.oils = new ArrayList<OnePreparationDTO>();
		this.masks = new ArrayList<OnePreparationDTO>();;
		this.regenerators = new ArrayList<OnePreparationDTO>();;
		this.dailyShampoos = new ArrayList<OnePreparationDTO>();;
		this.deepWashShampoos = new ArrayList<OnePreparationDTO>();;
	}
	
	
	public ReviewPreparationsDTO(List<OnePreparationDTO> oils, List<OnePreparationDTO> masks,
			List<OnePreparationDTO> regenerators, List<OnePreparationDTO> dailyShampoos,
			List<OnePreparationDTO> deepWashShampoos) {
		super();
		this.oils = oils;
		this.masks = masks;
		this.regenerators = regenerators;
		this.dailyShampoos = dailyShampoos;
		this.deepWashShampoos = deepWashShampoos;
	}
	public List<OnePreparationDTO> getOils() {
		return oils;
	}
	public void setOils(List<OnePreparationDTO> oils) {
		this.oils = oils;
	}
	public List<OnePreparationDTO> getMasks() {
		return masks;
	}
	public void setMasks(List<OnePreparationDTO> masks) {
		this.masks = masks;
	}
	public List<OnePreparationDTO> getRegenerators() {
		return regenerators;
	}
	public void setRegenerators(List<OnePreparationDTO> regenerators) {
		this.regenerators = regenerators;
	}
	public List<OnePreparationDTO> getDailyShampoos() {
		return dailyShampoos;
	}
	public void setDailyShampoos(List<OnePreparationDTO> dailyShampoos) {
		this.dailyShampoos = dailyShampoos;
	}
	public List<OnePreparationDTO> getDeepWashShampoos() {
		return deepWashShampoos;
	}
	public void setDeepWashShampoos(List<OnePreparationDTO> deepWashShampoos) {
		this.deepWashShampoos = deepWashShampoos;
	}
	
	
}
