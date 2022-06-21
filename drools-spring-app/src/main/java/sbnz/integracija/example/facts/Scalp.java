package sbnz.integracija.example.facts;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import sbnz.integracija.example.enums.*;

@Entity
@Table(name = "scalp")
public class Scalp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "scalp_sensitivity")
	private ScalpSensitivity scalpSensitivity;
	
	@Column(name = "scalp_type")
	private ScalpType scalpType;


	public Scalp() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ScalpSensitivity getScalpSensitivity() {
		return scalpSensitivity;
	}

	public void setScalpSensitivity(ScalpSensitivity scalpSensitivity) {
		this.scalpSensitivity = scalpSensitivity;
	}

	public ScalpType getScalpType() {
		return scalpType;
	}

	public void setScalpType(ScalpType scalpType) {
		this.scalpType = scalpType;
	}

	
}
