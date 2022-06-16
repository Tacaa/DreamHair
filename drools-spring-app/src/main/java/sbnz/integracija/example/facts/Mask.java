package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mask extends Preparation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> components;
	private PehValues pehValues;
	
	public Mask(String name, Review review, PehValues pehValues) {
		super(name, review);
		this.components = new ArrayList<String>();
		this.pehValues = pehValues;
	}
	
	
	public PehValues getPehValues() {
		return pehValues;
	}


	public void setPehValues(PehValues pehValues) {
		this.pehValues = pehValues;
	}


	public Mask() {
		super();
	}

	public List<String> getComponents() {
		return components;
	}

	public void setComponents(List<String> components) {
		this.components = components;
	}

	@Override
	public String toString() {
		return "Mask [components=" + components + "]";
	}

	
	
}
