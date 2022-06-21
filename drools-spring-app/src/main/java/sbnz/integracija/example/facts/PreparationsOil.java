package sbnz.integracija.example.facts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "preparations_oil")
public class PreparationsOil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "preparations_id")
	private Preparations preparations;
	
	@ManyToOne
	@JoinColumn(name = "oil_id")
	private Oil oil;
	
	@Column(name = "deleted")
	private Boolean deleted;

	public PreparationsOil() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Preparations getPreparations() {
		return preparations;
	}

	public void setPreparations(Preparations preparations) {
		this.preparations = preparations;
	}

	public Oil getOil() {
		return oil;
	}

	public void setOil(Oil oil) {
		this.oil = oil;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
	
}
