package sbnz.integracija.example.facts;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "external_influences")
public class ExternalInfluences implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "dyed_hair")
	private boolean dyedHair;
	
	@Column(name = "bleached_hair")
	private boolean bleachedHair;
	
	@Column(name = "dandruff")
	private boolean dandruff;
	
	@Column(name = "fungal")
	private boolean fungal;
	
	@Column(name = "pregnacy")
	private boolean pregnacy;
	
	@Column(name = "sickness")
	private boolean sickness;
	
	@Column(name = "operation")
	private boolean operation;
	
	@Column(name = "itching")
	private boolean itching;

	public ExternalInfluences() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isDyedHair() {
		return dyedHair;
	}

	public void setDyedHair(boolean dyedHair) {
		this.dyedHair = dyedHair;
	}

	public boolean isBleachedHair() {
		return bleachedHair;
	}

	public void setBleachedHair(boolean bleachedHair) {
		this.bleachedHair = bleachedHair;
	}

	public boolean isDandruff() {
		return dandruff;
	}

	public void setDandruff(boolean dandruff) {
		this.dandruff = dandruff;
	}

	public boolean isFungal() {
		return fungal;
	}

	public void setFungal(boolean fungal) {
		this.fungal = fungal;
	}

	public boolean isPregnacy() {
		return pregnacy;
	}

	public void setPregnacy(boolean pregnacy) {
		this.pregnacy = pregnacy;
	}

	public boolean isSickness() {
		return sickness;
	}

	public void setSickness(boolean sickness) {
		this.sickness = sickness;
	}

	public boolean isOperation() {
		return operation;
	}

	public void setOperation(boolean operation) {
		this.operation = operation;
	}

	public boolean isItching() {
		return itching;
	}

	public void setItching(boolean itching) {
		this.itching = itching;
	}

	
	
}
