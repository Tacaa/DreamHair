package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Preparations implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RegisteredUser user;
	private LocalDateTime dateOfRecommendation;
	private Preparation preparation;
	private boolean current;
	
	
	public Preparations(RegisteredUser user, LocalDateTime dateOfRecommendation, Preparation preparation,
			boolean current) {
		super();
		this.user = user;
		this.dateOfRecommendation = dateOfRecommendation;
		this.preparation = preparation;
		this.current = current;
	}


	public Preparations() {
		super();
	}


	public RegisteredUser getUser() {
		return user;
	}


	public void setUser(RegisteredUser user) {
		this.user = user;
	}


	public LocalDateTime getDateOfRecommendation() {
		return dateOfRecommendation;
	}


	public void setDateOfRecommendation(LocalDateTime dateOfRecommendation) {
		this.dateOfRecommendation = dateOfRecommendation;
	}


	public Preparation getPreparation() {
		return preparation;
	}


	public void setPreparation(Preparation preparation) {
		this.preparation = preparation;
	}


	public boolean isCurrent() {
		return current;
	}


	public void setCurrent(boolean current) {
		this.current = current;
	}


	@Override
	public String toString() {
		return "Preparations [user=" + user + ", dateOfRecommendation=" + dateOfRecommendation + ", preparation="
				+ preparation + ", current=" + current + "]";
	}
	
	
	
	
}
