package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "MASK")
public class Mask extends Preparation implements Serializable{
private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "peh_values_id", referencedColumnName = "id")
	private PehValues pehValues;
	
	/*
	@OneToMany(mappedBy = "mask")
	private List<PreparationsMask> preparationsMask;
	*/
	
	public Mask() {
		super();
	}

	public PehValues getPehValues() {
		return pehValues;
	}

	public void setPehValues(PehValues pehValues) {
		this.pehValues = pehValues;
	}

	@Override
	public String toString() {
		return "Mask [pehValues=" + pehValues + ", getId()=" + getId() + ", getName()=" + getName() + ", getReview()="
				+ getReview() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	/*
	public List<PreparationsMask> getPreparationsMask() {
		return preparationsMask;
	}

	public void setPreparationsMask(List<PreparationsMask> preparationsMask) {
		this.preparationsMask = preparationsMask;
	}
	*/
	
	
	
}
