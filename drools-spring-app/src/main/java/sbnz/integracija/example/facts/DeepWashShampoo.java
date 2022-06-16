package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;

import sbnz.integracija.example.enums.ScalpSensitivity;
import sbnz.integracija.example.enums.ShampooIntensity;

public class DeepWashShampoo extends Preparation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Component> components;
	private ScalpSensitivity scalpSensitivity;
	private ShampooIntensity shampooIntensity;
	private PehValues pehValues;
	
	public DeepWashShampoo(String name, Review review, List<Component> components, ScalpSensitivity scalpSensitivity,
			ShampooIntensity shampooIntensity,  PehValues pehValues) {
		super(name, review);
		this.components = components;
		this.scalpSensitivity = scalpSensitivity;
		this.shampooIntensity = shampooIntensity;
		this.pehValues = pehValues;
	}
	
	
	public PehValues getPehValues() {
		return pehValues;
	}


	public void setPehValues(PehValues pehValues) {
		this.pehValues = pehValues;
	}
	
	
	public DeepWashShampoo() {
		super();
	}



	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public ScalpSensitivity getScalpSensitivity() {
		return scalpSensitivity;
	}

	public void setScalpSensitivity(ScalpSensitivity scalpSensitivity) {
		this.scalpSensitivity = scalpSensitivity;
	}

	public ShampooIntensity getShampooIntensity() {
		return shampooIntensity;
	}

	public void setShampooIntensity(ShampooIntensity shampooIntensity) {
		this.shampooIntensity = shampooIntensity;
	}



	@Override
	public String toString() {
		return "DeepWashShampoo [components=" + components + ", scalpSensitivity=" + scalpSensitivity
				+ ", shampooIntensity=" + shampooIntensity + "]";
	}
	
	
	
	

}
