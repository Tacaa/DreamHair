
package sbnz.integracija.example.facts;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sbnz.integracija.example.enums.*;

@Entity
@Table(name = "hair_property")
public class HairProperty implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "hair_softness")
	private HairSoftness hairSoftness;
	
	@Column(name = "hair_weakness")
	private HairWeakness hairWeakness;
	
	@Column(name = "hair_volume")
	private boolean hairVolume;
	
	@Column(name = "tangling")
	private boolean tangling;
	
	@Column(name = "hair_shine")
	private boolean hairShine;
	
	@Column(name = "rating")
	private boolean dry;
	
	@Column(name = "inflating")
	private boolean inflating;
	
	@Column(name = "fragile")
	private boolean fragile;
	

	public HairProperty() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HairSoftness getHairSoftness() {
		return hairSoftness;
	}

	public void setHairSoftness(HairSoftness hairSoftness) {
		this.hairSoftness = hairSoftness;
	}

	public HairWeakness getHairWeakness() {
		return hairWeakness;
	}

	public void setHairWeakness(HairWeakness hairWeakness) {
		this.hairWeakness = hairWeakness;
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

	@Override
	public String toString() {
		return "HairProperty [id=" + id + ", hairSoftness=" + hairSoftness + ", hairWeakness=" + hairWeakness
				+ ", hairVolume=" + hairVolume + ", tangling=" + tangling + ", hairShine=" + hairShine + ", dry=" + dry
				+ ", inflating=" + inflating + ", fragile=" + fragile + "]";
	}

	
	
	

}
