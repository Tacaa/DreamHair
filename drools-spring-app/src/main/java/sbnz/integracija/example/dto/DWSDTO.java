package sbnz.integracija.example.dto;

import sbnz.integracija.example.enums.ScalpSensitivity;
import sbnz.integracija.example.enums.ScalpType;
import sbnz.integracija.example.enums.ShampooIntensity;

public class DWSDTO {
	private String name;
	private ScalpSensitivity scalpSensitivity;
	private ShampooIntensity shampooIntensity;
	private double proteinsPercentage;
	private double emollientsPercentage;
	private double humectansPercentage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public double getProteinsPercentage() {
		return proteinsPercentage;
	}
	public void setProteinsPercentage(double proteinsPercentage) {
		this.proteinsPercentage = proteinsPercentage;
	}
	public double getEmollientsPercentage() {
		return emollientsPercentage;
	}
	public void setEmollientsPercentage(double emollientsPercentage) {
		this.emollientsPercentage = emollientsPercentage;
	}
	public double getHumectansPercentage() {
		return humectansPercentage;
	}
	public void setHumectansPercentage(double humectansPercentage) {
		this.humectansPercentage = humectansPercentage;
	}
	public DWSDTO(String name, ScalpSensitivity scalpSensitivity, ShampooIntensity shampooIntensity,
			double proteinsPercentage, double emollientsPercentage, double humectansPercentage) {
		super();
		this.name = name;
		this.scalpSensitivity = scalpSensitivity;
		this.shampooIntensity = shampooIntensity;
		this.proteinsPercentage = proteinsPercentage;
		this.emollientsPercentage = emollientsPercentage;
		this.humectansPercentage = humectansPercentage;
	}
	public DWSDTO() {
		super();
	}
	
	
}
