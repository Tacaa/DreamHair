package sbnz.integracija.example.facts;

import javax.persistence.*;

@Entity
@Table(name = "preparations_mask")
public class PreparationsMask {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "preparations_id")
	private Preparations preparations;
	
	@ManyToOne
	@JoinColumn(name = "mask_id")
	private Mask mask;
	
	@Column(name = "deleted")
	private Boolean deleted;

	public PreparationsMask() {
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

	public Mask getMask() {
		return mask;
	}

	public void setMask(Mask mask) {
		this.mask = mask;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
	
}
