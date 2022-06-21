package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	
}
