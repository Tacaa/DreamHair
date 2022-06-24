package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import sbnz.integracija.example.enums.ScalpType;

@Entity
@DiscriminatorValue(value = "DAILY_SHAMPOO")
public class DailyShampoo extends Preparation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "scalp_type")
	private ScalpType scalpType;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "peh_values_id", referencedColumnName = "id")
	private PehValues pehValues;
	

	public DailyShampoo() {
		super();
	}

	public ScalpType getScalpType() {
		return scalpType;
	}

	public void setScalpType(ScalpType scalpType) {
		this.scalpType = scalpType;
	}

	public PehValues getPehValues() {
		return pehValues;
	}

	public void setPehValues(PehValues pehValues) {
		this.pehValues = pehValues;
	}

	
	
}
