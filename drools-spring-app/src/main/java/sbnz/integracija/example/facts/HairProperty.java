package sbnz.integracija.example.facts;

import java.io.Serializable;
import sbnz.integracija.example.enums.*;

public class HairProperty implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HairSoftness hairSoftness;
	private HairWeakness hairWeakness;
	private boolean hairVolume;
	private boolean tangling;
	private boolean hairShine;
	private boolean dry;
	private boolean inflating;
	private boolean fragile;
	
	
	public HairProperty(HairSoftness hairSoftness, HairWeakness hairWeakness, boolean hairVolume, boolean tangling,
			boolean hairShine, boolean dry, boolean inflating, boolean fragile) {
		super();
		this.hairSoftness = hairSoftness;
		this.hairWeakness = hairWeakness;
		this.hairVolume = hairVolume;
		this.tangling = tangling;
		this.hairShine = hairShine;
		this.dry = dry;
		this.inflating = inflating;
		this.fragile = fragile;
	}


	public HairProperty() {
		super();
	}


	public HairSoftness getHairSoftness() {
		return hairSoftness;
	}


	public void setHairSoftness(HairSoftness hairSoftness) {
		this.hairSoftness = hairSoftness;
	}




	public boolean isHairVolume() {
		return hairVolume;
	}


	public void setHairVolume(boolean hairVolume) {
		this.hairVolume = hairVolume;
	}


	public boolean isTangling() {
		return tangling;
	}


	public void setTangling(boolean tangling) {
		this.tangling = tangling;
	}


	public boolean isHairShine() {
		return hairShine;
	}


	public void setHairShine(boolean hairShine) {
		this.hairShine = hairShine;
	}


	public boolean isDry() {
		return dry;
	}


	public void setDry(boolean dry) {
		this.dry = dry;
	}


	public boolean isInflating() {
		return inflating;
	}


	public void setInflating(boolean inflating) {
		this.inflating = inflating;
	}


	public boolean isFragile() {
		return fragile;
	}


	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}


	public HairWeakness getHairWeakness() {
		return hairWeakness;
	}


	public void setHairWeakness(HairWeakness hairWeakness) {
		this.hairWeakness = hairWeakness;
	}


	
	
	

}
