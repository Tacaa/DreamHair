package sbnz.integracija.example.facts;

import java.io.Serializable;

import sbnz.integracija.example.enums.Porosity;

public class Oil extends Preparation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Porosity type;

	public Oil(String name, Review review, Porosity type) {
		super(name, review);
		this.type = type;
	}

	public Porosity getType() {
		return type;
	}

	public void setType(Porosity type) {
		this.type = type;
	}

	public Oil() {
		super();
	}

	@Override
	public String toString() {
		return "Oil [type=" + type + "]";
	}
	
	

}
