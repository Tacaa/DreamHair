package sbnz.integracija.example.facts;

import java.io.Serializable;

public class ExternalInfluences implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean dyedHair;
	private boolean bleachedHair;
	private boolean dandruff;
	private boolean fungal;
	private boolean pregnacy;
	
	
	public ExternalInfluences(boolean dyedHair, boolean bleachedHair, boolean dandruff, boolean fungal,
			boolean pregnacy) {
		super();
		this.dyedHair = dyedHair;
		this.bleachedHair = bleachedHair;
		this.dandruff = dandruff;
		this.fungal = fungal;
		this.pregnacy = pregnacy;
	}


	public ExternalInfluences() {
		super();
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


	@Override
	public String toString() {
		return "ExternalInfluences [dyedHair=" + dyedHair + ", bleachedHair=" + bleachedHair + ", dandruff=" + dandruff
				+ ", fungal=" + fungal + ", pregnacy=" + pregnacy + "]";
	}
	
	
	
	
}
