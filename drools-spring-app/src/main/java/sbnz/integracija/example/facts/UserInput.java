package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import sbnz.integracija.example.enums.*;

public class UserInput implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HairShape hairShape;
	private HairTickness hairTickness;
	private boolean hairElasticity;
	private HairDensity hairDensity;
	private List<String> alergies;
	private List<Integer> porosityInput;
	private Scalp scalp;
	private ExternalInfluences externalInfluences;
	
	
	public UserInput(HairShape hairShape, HairTickness hairTickness, boolean hairElasticity, HairDensity hairDensity,
			List<String> alergies, List<Integer> porosityInput, Scalp scalp, ExternalInfluences externalInfluences) {
		super();
		this.hairShape = hairShape;
		this.hairTickness = hairTickness;
		this.hairElasticity = hairElasticity;
		this.hairDensity = hairDensity;
		this.alergies = alergies;
		this.porosityInput = porosityInput;
		this.scalp = scalp;
		this.externalInfluences = externalInfluences;
	}


	public UserInput() {
		super();
	}


	public HairShape getHairShape() {
		return hairShape;
	}


	public void setHairShape(HairShape hairShape) {
		this.hairShape = hairShape;
	}


	public HairTickness getHairTickness() {
		return hairTickness;
	}


	public void setHairTickness(HairTickness hairTickness) {
		this.hairTickness = hairTickness;
	}


	public boolean isHairElasticity() {
		return hairElasticity;
	}


	public void setHairElasticity(boolean hairElasticity) {
		this.hairElasticity = hairElasticity;
	}


	public HairDensity getHairDensity() {
		return hairDensity;
	}


	public void setHairDensity(HairDensity hairDensity) {
		this.hairDensity = hairDensity;
	}



	public List<String> getAlergies() {
		return alergies;
	}


	public void setAlergies(List<String> alergies) {
		this.alergies = alergies;
	}


	public List<Integer> getPorosityInput() {
		return porosityInput;
	}


	public void setPorosityInput(List<Integer> porosityInput) {
		this.porosityInput = porosityInput;
	}


	public Scalp getScalp() {
		return scalp;
	}


	public void setScalp(Scalp scalp) {
		this.scalp = scalp;
	}


	public ExternalInfluences getExternalInfluences() {
		return externalInfluences;
	}


	public void setExternalInfluences(ExternalInfluences externalInfluences) {
		this.externalInfluences = externalInfluences;
	}



	
	
	
	
	
}
