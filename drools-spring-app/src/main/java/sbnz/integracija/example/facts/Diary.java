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
	private List<HairState> hairState;
	private List<String> comments;
	private List<LocalDateTime> consistency;
	
	
	public Diary(List<LocalDateTime> hairWash, List<Integer> hairGrowth, List<HairState> hairState,
			List<String> comments, List<LocalDateTime> consistency) {
		super();
		this.hairWash = hairWash;
		this.hairGrowth = hairGrowth;
		this.hairState = hairState;
		this.comments = comments;
		this.consistency = consistency;
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


	public List<LocalDateTime> getConsistency() {
		return consistency;
	}


	public void setConsistency(List<LocalDateTime> consistency) {
		this.consistency = consistency;
	}


	@Override
	public String toString() {
		return "Diary [hairWash=" + hairWash + ", hairGrowth=" + hairGrowth + ", hairState=" + hairState + ", comments="
				+ comments + ", consistency=" + consistency + "]";
	}
	
	
	
	
	
	
}
