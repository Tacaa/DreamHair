package sbnz.integracija.example.dto;

import java.util.List;

import javax.persistence.Column;

import sbnz.integracija.example.converter.ListToIntegerConverter;
import sbnz.integracija.example.enums.HairDensity;
import sbnz.integracija.example.enums.HairShape;
import sbnz.integracija.example.enums.HairTickness;
import sbnz.integracija.example.enums.ScalpSensitivity;
import sbnz.integracija.example.enums.ScalpType;

public class UserInputDTO {
	private HairShape hairShape;
	private HairTickness hairTickness;
	private boolean hairElasticity;
	private HairDensity hairDensity;
	private List<Integer> porosityInput;
	private ScalpSensitivity scalpSensitivity;
	private ScalpType scalpType;
	private boolean dyedHair;
	private boolean bleachedHair;
	private boolean dandruff;
	private boolean fungal;
	private boolean pregnacy;
	private boolean sickness;
	private boolean operation;
	private boolean itching;
	
	
	
	public UserInputDTO(HairShape hairShape, HairTickness hairTickness, boolean hairElasticity, HairDensity hairDensity,
			List<Integer> porosityInput, ScalpSensitivity scalpSensitivity, ScalpType scalpType, boolean dyedHair,
			boolean bleachedHair, boolean dandruff, boolean fungal, boolean pregnacy, boolean sickness,
			boolean operation, boolean itching) {
		super();
		this.hairShape = hairShape;
		this.hairTickness = hairTickness;
		this.hairElasticity = hairElasticity;
		this.hairDensity = hairDensity;
		this.porosityInput = porosityInput;
		this.scalpSensitivity = scalpSensitivity;
		this.scalpType = scalpType;
		this.dyedHair = dyedHair;
		this.bleachedHair = bleachedHair;
		this.dandruff = dandruff;
		this.fungal = fungal;
		this.pregnacy = pregnacy;
		this.sickness = sickness;
		this.operation = operation;
		this.itching = itching;
	}

	public UserInputDTO() {
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
	public List<Integer> getPorosityInput() {
		return porosityInput;
	}
	public void setPorosityInput(List<Integer> porosityInput) {
		this.porosityInput = porosityInput;
	}
	public ScalpSensitivity getScalpSensitivity() {
		return scalpSensitivity;
	}
	public void setScalpSensitivity(ScalpSensitivity scalpSensitivity) {
		this.scalpSensitivity = scalpSensitivity;
	}
	public ScalpType getScalpType() {
		return scalpType;
	}
	public void setScalpType(ScalpType scalpType) {
		this.scalpType = scalpType;
	}
	public boolean isDyedHair() {
		return dyedHair;
	}
	public void setDyedHair(boolean dyedHair) {
		this.dyedHair = dyedHair;
	}
	public boolean isBleachedHair() {
		return bleachedHair;
	}
	public void setBleachedHair(boolean bleachedHair) {
		this.bleachedHair = bleachedHair;
	}
	public boolean isDandruff() {
		return dandruff;
	}
	public void setDandruff(boolean dandruff) {
		this.dandruff = dandruff;
	}
	public boolean isFungal() {
		return fungal;
	}
	public void setFungal(boolean fungal) {
		this.fungal = fungal;
	}
	public boolean isPregnacy() {
		return pregnacy;
	}
	public void setPregnacy(boolean pregnacy) {
		this.pregnacy = pregnacy;
	}
	public boolean isSickness() {
		return sickness;
	}
	public void setSickness(boolean sickness) {
		this.sickness = sickness;
	}
	public boolean isOperation() {
		return operation;
	}
	public void setOperation(boolean operation) {
		this.operation = operation;
	}
	public boolean isItching() {
		return itching;
	}
	public void setItching(boolean itching) {
		this.itching = itching;
	}
	
	
	@Override
	public String toString() {
		return "UserInputDTO [hairShape=" + hairShape + ", hairTickness=" + hairTickness + ", hairElasticity="
				+ hairElasticity + ", hairDensity=" + hairDensity + ", porosityInput=" + porosityInput
				+ ", scalpSensitivity=" + scalpSensitivity + ", scalpType=" + scalpType + ", dyedHair=" + dyedHair
				+ ", bleachedHair=" + bleachedHair + ", dandruff=" + dandruff + ", fungal=" + fungal + ", pregnacy="
				+ pregnacy + ", sickness=" + sickness + ", operation=" + operation + ", itching=" + itching + "]";
	}
	
}
