package sbnz.integracija.example.dto;

import sbnz.integracija.example.enums.ScalpType;

public class DSDTO {
	private String name;
	private ScalpType scalpType;
	private double proteinsPercentage;
	private double emollientsPercentage;
	private double humectansPercentage;
	
	
	
	public DSDTO() {
		super();
	}
	public DSDTO(String name, ScalpType scalpType, double proteinsPercentage, double emollientsPercentage,
			double humectansPercentage) {
		super();
		this.name = name;
		this.scalpType = scalpType;
		this.proteinsPercentage = proteinsPercentage;
		this.emollientsPercentage = emollientsPercentage;
		this.humectansPercentage = humectansPercentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ScalpType getScalpType() {
		return scalpType;
	}
	public void setScalpType(ScalpType scalpType) {
		this.scalpType = scalpType;
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
	
	
}
