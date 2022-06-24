package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "REGENERATOR")
public class Regenerator extends Preparation implements Serializable{
private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "peh_values_id", referencedColumnName = "id")
	private PehValues pehValues;

	/*
	@OneToMany(mappedBy = "regenerator")
	private List<PreparationsRegenerator> PreparationsRegenerator;
	*/
	
	
	public Regenerator() {
		super();
	}

	public PehValues getPehValues() {
		return pehValues;
	}

	public void setPehValues(PehValues pehValues) {
		this.pehValues = pehValues;
	}

	/*
	public List<PreparationsRegenerator> getPreparationsRegenerator() {
		return PreparationsRegenerator;
	}

	public void setPreparationsRegenerator(List<PreparationsRegenerator> preparationsRegenerator) {
		PreparationsRegenerator = preparationsRegenerator;
	}
	*/
	
	
}
