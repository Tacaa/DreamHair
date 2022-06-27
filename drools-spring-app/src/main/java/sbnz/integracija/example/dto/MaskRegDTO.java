package sbnz.integracija.example.dto;

public class MaskRegDTO {
	private String name;
	private double proteinsPercentage;
	private double emollientsPercentage;
	private double humectansPercentage;
	
	public MaskRegDTO() {
		super();
	}
	public MaskRegDTO(String name, double proteinsPercentage, double emollientsPercentage, double humectansPercentage) {
		super();
		this.name = name;
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
