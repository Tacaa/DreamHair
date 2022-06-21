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
@Table(name = "preparations_daily_shampoo")
public class PreparationsDailyShampoo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "preparations_id")
	private Preparations preparations;
	
	@ManyToOne
	@JoinColumn(name = "daily_shampoo_id")
	private Preparation preparation;
	
	@Column(name = "deleted")
	private Boolean deleted;
	
	
}
