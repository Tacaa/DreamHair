package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "preparations")
public class Preparations implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "date_of_recommendation")
	private LocalDateTime dateOfRecommendation;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "preparations_oil",
			joinColumns = @JoinColumn(name = "preparations_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "oil_id", referencedColumnName = "id"))
	List<Oil> oils;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "preparations_mask",
			joinColumns = @JoinColumn(name = "preparations_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "mask_id", referencedColumnName = "id"))
	List<Mask> masks;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "preparations_regenerator",
			joinColumns = @JoinColumn(name = "preparations_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "regenerator_id", referencedColumnName = "id"))
	List<Regenerator> regenerators;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "preparations_ds",
			joinColumns = @JoinColumn(name = "preparations_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "ds_id", referencedColumnName = "id"))
	List<DailyShampoo> dailyShampoos;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "preparations_dws",
			joinColumns = @JoinColumn(name = "preparations_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "dws_id", referencedColumnName = "id"))
	List<DeepWashShampoo> deepWashShampoos;
	

	/*
	@OneToMany(mappedBy = "preparations")
	Set<PreparationsDailyShampoo> preparationsDailyShampoo;
	
	@OneToMany(mappedBy = "preparations")
	Set<PreparationsDeepWashShampoo> preparationsDeepWashShampoo;
	
	@OneToMany(mappedBy="preparations")
	private List<PreparationsMask> preparationsMask;
	
	@OneToMany(mappedBy="preparations")
	private List<PreparationsOil> preparationsOil;
	
	@OneToMany(mappedBy="preparations")
	private List<PreparationsRegenerator> preparationsRegenerator;
	*/
	
	@Column(name = "current")
	private boolean current;
	
	@OneToOne(mappedBy = "preparations")
    private RegisteredUser user;

	public Preparations() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDateOfRecommendation() {
		return dateOfRecommendation;
	}

	public void setDateOfRecommendation(LocalDateTime dateOfRecommendation) {
		this.dateOfRecommendation = dateOfRecommendation;
	}

	/*
	public List<PreparationsMask> getPreparationsMask() {
		return preparationsMask;
	}

	public void setPreparationsMask(List<PreparationsMask> preparationsMask) {
		this.preparationsMask = preparationsMask;
	}

	public List<PreparationsOil> getPreparationsOil() {
		return preparationsOil;
	}

	public void setPreparationsOil(List<PreparationsOil> preparationsOil) {
		this.preparationsOil = preparationsOil;
	}

	public List<PreparationsRegenerator> getPreparationsRegenerator() {
		return preparationsRegenerator;
	}

	public void setPreparationsRegenerator(List<PreparationsRegenerator> preparationsRegenerator) {
		this.preparationsRegenerator = preparationsRegenerator;
	}
	*/

	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

	
	public RegisteredUser getUser() {
		return user;
	}

	public void setUser(RegisteredUser user) {
		this.user = user;
	}

	public List<Oil> getOils() {
		return oils;
	}

	public void setOils(List<Oil> oils) {
		this.oils = oils;
	}

	public List<Mask> getMasks() {
		return masks;
	}

	public void setMasks(List<Mask> masks) {
		this.masks = masks;
	}

	public List<Regenerator> getRegenerators() {
		return regenerators;
	}

	public void setRegenerators(List<Regenerator> regenerators) {
		this.regenerators = regenerators;
	}

	public List<DailyShampoo> getDailyShampoos() {
		return dailyShampoos;
	}

	public void setDailyShampoos(List<DailyShampoo> dailyShampoos) {
		this.dailyShampoos = dailyShampoos;
	}

	public List<DeepWashShampoo> getDeepWashShampoos() {
		return deepWashShampoos;
	}

	public void setDeepWashShampoos(List<DeepWashShampoo> deepWashShampoos) {
		this.deepWashShampoos = deepWashShampoos;
	}

	@Override
	public String toString() {
		return "Preparations [id=" + id + ", dateOfRecommendation=" + dateOfRecommendation + ", oils=" + oils
				+ ", masks=" + masks + ", regenerators=" + regenerators + ", dailyShampoos=" + dailyShampoos
				+ ", deepWashShampoos=" + deepWashShampoos + ", current=" + current + ", user=" + user + "]";
	}
	
	
	
	
}
