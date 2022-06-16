package sbnz.integracija.example.facts;

import java.io.Serializable;

public class Preparation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Review review;
	
	public Preparation(String name, Review review) {
		super();
		this.name = name;
		this.review = review;
	}
	



	public Preparation() {
		super();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	
	
}
