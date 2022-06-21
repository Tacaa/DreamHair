package sbnz.integracija.example.facts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "peh_values")
public class PehValues {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "proteins_percentage")
	private double proteinsPercentage;
	
	@Column(name = "emollients_percentage")
	private double emollientsPercentage;
	
	@Column(name = "humectans_percentage")
	private double humectansPercentage;

	public PehValues() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
