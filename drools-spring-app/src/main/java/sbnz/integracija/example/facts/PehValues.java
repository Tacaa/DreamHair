package sbnz.integracija.example.facts;

public class PehValues {
	private double proteinsPercentage;
	private double emollientsPercentage;
	private double humectansPercentage;
	
	public PehValues(double proteinsPercentage, double emollientsPercentage, double humectansPercentage) {
		super();
		this.proteinsPercentage = proteinsPercentage;
		this.emollientsPercentage = emollientsPercentage;
		this.humectansPercentage = humectansPercentage;
	}

	public PehValues() {
		super();
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

	@Override
	public String toString() {
		return "PehValues [proteinsPercentage=" + proteinsPercentage + ", emollientsPercentage=" + emollientsPercentage
				+ ", humectansPercentage=" + humectansPercentage + "]";
	}
	
	
}
