package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import sbnz.integracija.example.enums.Porosity;

@Entity
@DiscriminatorValue(value = "OIL")
public class Oil extends Preparation implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Column(name = "type")
	private Porosity type;

	/*
	@OneToMany(mappedBy = "oil")
	private List<PreparationsOil> preparationsOil;
	*/
	
	public Oil() {
		super();
	}

	public Porosity getType() {
		return type;
	}

	public void setType(Porosity type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Oil [type=" + type + ", getName()=" + getName() + "]";
	}

	/*
	public List<PreparationsOil> getPreparationsOil() {
		return preparationsOil;
	}

	public void setPreparationsOil(List<PreparationsOil> preparationsOil) {
		this.preparationsOil = preparationsOil;
	}
	*/
	
	
	
}
