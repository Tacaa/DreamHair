package sbnz.integracija.example.facts;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sbnz.integracija.example.converter.ListToIntegerConverter;
import sbnz.integracija.example.enums.*;

@Entity
@Table(name = "user_input")
public class UserInput implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "hair_shape")
	private HairShape hairShape;
	
	@Column(name = "hair_tickness")
	private HairTickness hairTickness;
	
	@Column(name = "hair_elasticity")
	private boolean hairElasticity;
	
	@Column(name = "hair_density")
	private HairDensity hairDensity;
	
	@Column(name = "porosity_input")
	@Convert(converter = ListToIntegerConverter.class)
	private List<Integer> porosityInput;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scalp_id", referencedColumnName = "id")
	private Scalp scalp;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "externalInfluences_id", referencedColumnName = "id")
	private ExternalInfluences externalInfluences;
	
	
	public UserInput() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HairShape getHairShape() {
		return hairShape;
	}

	public void setHairShape(HairShape hairShape) {
		this.hairShape = hairShape;
	}

	public HairTickness getHairTickness() {
		return hairTickness;
	}

	public void setHairTickness(HairTickness hairTickness) {
		this.hairTickness = hairTickness;
	}

	public boolean isHairElasticity() {
		return hairElasticity;
	}

	public void setHairElasticity(boolean hairElasticity) {
		this.hairElasticity = hairElasticity;
	}

	public HairDensity getHairDensity() {
		return hairDensity;
	}

	public void setHairDensity(HairDensity hairDensity) {
		this.hairDensity = hairDensity;
	}

	public List<Integer> getPorosityInput() {
		return porosityInput;
	}

	public void setPorosityInput(List<Integer> porosityInput) {
		this.porosityInput = porosityInput;
	}

	public Scalp getScalp() {
		return scalp;
	}

	public void setScalp(Scalp scalp) {
		this.scalp = scalp;
	}

	public ExternalInfluences getExternalInfluences() {
		return externalInfluences;
	}

	public void setExternalInfluences(ExternalInfluences externalInfluences) {
		this.externalInfluences = externalInfluences;
	}
	
}
