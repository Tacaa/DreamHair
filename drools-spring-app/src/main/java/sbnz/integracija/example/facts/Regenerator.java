package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;

public class Regenerator extends Preparation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Component> components;
	private PehValues pehValues;

	public Regenerator(String name, Review review, PehValues pehValues, List<Component> components) {
		super(name, review);
		this.components = components;
		this.pehValues = pehValues;
	}
	
	
	public PehValues getPehValues() {
		return pehValues;
	}


	public void setPehValues(PehValues pehValues) {
		this.pehValues = pehValues;
	}

	public Regenerator() {
		super();
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	@Override
	public String toString() {
		return "Regenerator [components=" + components + "]";
	}
	
	
	
	
	
}
