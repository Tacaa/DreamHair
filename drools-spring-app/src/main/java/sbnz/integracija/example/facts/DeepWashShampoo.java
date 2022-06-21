package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import sbnz.integracija.example.enums.ScalpSensitivity;
import sbnz.integracija.example.enums.ShampooIntensity;

@Entity
@DiscriminatorValue(value = "DEEP_WASH_SHAMPOO")
public class DeepWashShampoo extends Preparation implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Column(name = "scalp_sensitivity")
	private ScalpSensitivity scalpSensitivity;
	
	@Column(name = "shampoo_intensity")
	private ShampooIntensity shampooIntensity;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "peh_values_id", referencedColumnName = "id")
	private PehValues pehValues;

	public DeepWashShampoo() {
		super();
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

	public PehValues getPehValues() {
		return pehValues;
	}

	public void setPehValues(PehValues pehValues) {
		this.pehValues = pehValues;
	}

	

}
