package sbnz.integracija.example.facts;

import java.util.List;

public class Advice {
	private int score;
	private String firstAdvice;
	private String secondAdvice;
	private String thirdAdvice;
	
	
	
	public Advice(int score, String firstAdvice, String secondAdvice, String thirdAdvice) {
		super();
		this.score = score;
		this.firstAdvice = firstAdvice;
		this.secondAdvice = secondAdvice;
		this.thirdAdvice = thirdAdvice;
	}

	

	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public String getThirdAdvice() {
		return thirdAdvice;
	}

	public void setThirdAdvice(String thirdAdvice) {
		this.thirdAdvice = thirdAdvice;
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

	public Advice() {
		super();
	}
	

	
	
}
