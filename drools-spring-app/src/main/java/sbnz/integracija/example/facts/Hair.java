package sbnz.integracija.example.facts;

import java.io.Serializable;

import sbnz.integracija.example.enums.Porosity;

public class Hair implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserInput userInput; 
	private HairProperty hairProperty;
	private Porosity hairPorosity;
	
	
	public Hair(UserInput userInput, HairProperty hairProperty, Porosity hairPorosity) {
		super();
		this.userInput = userInput;
		this.hairProperty = hairProperty;
		this.hairPorosity = hairPorosity;
	}


	public Hair() {
		super();
	}


	public UserInput getUserInput() {
		return userInput;
	}


	public void setUserInput(UserInput userInput) {
		this.userInput = userInput;
	}


	public HairProperty getHairProperty() {
		return hairProperty;
	}


	public void setHairProperty(HairProperty hairProperty) {
		this.hairProperty = hairProperty;
	}


	public Porosity getHairPorosity() {
		return hairPorosity;
	}


	public void setHairPorosity(Porosity hairPorosity) {
		this.hairPorosity = hairPorosity;
	}


	@Override
	public String toString() {
		return "Hair [userInput=" + userInput + ", hairProperty=" + hairProperty + ", hairPorosity=" + hairPorosity
				+ "]";
	}
	
	
	
	

}
