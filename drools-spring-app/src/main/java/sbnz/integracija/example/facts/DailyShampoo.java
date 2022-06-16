package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;

import sbnz.integracija.example.enums.ScalpType;

public class DailyShampoo extends Preparation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ScalpType scalpType;
	private List<Component> components;
	private PehValues pehValues;
	
	public DailyShampoo(String name, Review review, ScalpType scalpType, List<Component> components, PehValues pehValues) {
		super(name, review);
		this.scalpType = scalpType;
		this.components = components;
		this.pehValues = pehValues;
	}
	
	
	public PehValues getPehValues() {
		return pehValues;
	}


	public void setPehValues(PehValues pehValues) {
		this.pehValues = pehValues;
	}
	public DailyShampoo() {
		super();
	}

	public ScalpType getScalpType() {
		return scalpType;
	}

	public void setScalpType(ScalpType scalpType) {
		this.scalpType = scalpType;
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	@Override
	public String toString() {
		return "DailyShampoo [scalpType=" + scalpType + ", components=" + components + "]";
	}
	
	
	
	
	

	
}
