package sbnz.integracija.example.dto;

import sbnz.integracija.example.enums.Medal;

public class AdviceMedalDTO {
	private String firstAdvice;
	private String secondAdvice;
	private String thirdAdvice;
	private Medal medal;
	
	
	
	public AdviceMedalDTO() {
		super();
	}
	public AdviceMedalDTO(String firstAdvice, String secondAdvice, String thirdAdvice, Medal medal) {
		super();
		this.firstAdvice = firstAdvice;
		this.secondAdvice = secondAdvice;
		this.thirdAdvice = thirdAdvice;
		this.medal = medal;
	}
	
	
	public String getFirstAdvice() {
		return firstAdvice;
	}
	public void setFirstAdvice(String firstAdvice) {
		this.firstAdvice = firstAdvice;
	}
	public String getSecondAdvice() {
		return secondAdvice;
	}
	public void setSecondAdvice(String secondAdvice) {
		this.secondAdvice = secondAdvice;
	}
	public String getThirdAdvice() {
		return this.thirdAdvice;
	}
	public void setThirdAdvice(String thirdAdvice) {
		this.thirdAdvice = thirdAdvice;
	}
	public Medal getMedal() {
		return medal;
	}
	public void setMedal(Medal medal) {
		this.medal = medal;
	}
	
	
}
