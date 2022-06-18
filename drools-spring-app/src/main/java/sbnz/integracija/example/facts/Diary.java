package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.time.*;
import java.util.List;

import sbnz.integracija.example.enums.HairState;

public class Diary implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<LocalDateTime> hairWash;
	private List<Integer> hairGrowth;
	private List<LocalDateTime> hairGrowthConsistency;
	private List<HairState> hairState;
	private List<LocalDateTime> hairStateConsistency;
	private List<String> comments;
	private List<LocalDateTime> commentsConsistency;
	
	

	public List<LocalDateTime> getHairGrowthConsistency() {
		return hairGrowthConsistency;
	}



	public void setHairGrowthConsistency(List<LocalDateTime> hairGrowthConsistency) {
		this.hairGrowthConsistency = hairGrowthConsistency;
	}



	public List<LocalDateTime> getHairStateConsistency() {
		return hairStateConsistency;
	}



	public void setHairStateConsistency(List<LocalDateTime> hairStateConsistency) {
		this.hairStateConsistency = hairStateConsistency;
	}



	public List<LocalDateTime> getCommentsConsistency() {
		return commentsConsistency;
	}



	public void setCommentsConsistency(List<LocalDateTime> commentsConsistency) {
		this.commentsConsistency = commentsConsistency;
	}



	public Diary() {
		super();
	}

	

	public List<LocalDateTime> getHairWash() {
		return hairWash;
	}


	public void setHairWash(List<LocalDateTime> hairWash) {
		this.hairWash = hairWash;
	}


	public List<Integer> getHairGrowth() {
		return hairGrowth;
	}


	public void setHairGrowth(List<Integer> hairGrowth) {
		this.hairGrowth = hairGrowth;
	}


	public List<HairState> getHairState() {
		return hairState;
	}


	public void setHairState(List<HairState> hairState) {
		this.hairState = hairState;
	}


	public List<String> getComments() {
		return comments;
	}


	public void setComments(List<String> comments) {
		this.comments = comments;
	}


	


	
	
	
	
	
	
}
