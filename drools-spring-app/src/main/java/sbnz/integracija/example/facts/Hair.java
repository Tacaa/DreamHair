package sbnz.integracija.example.facts;

import java.io.Serializable;

import javax.persistence.*;

import sbnz.integracija.example.enums.Porosity;


@Entity
@Table(name = "hair")
public class Hair implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_input_id", referencedColumnName = "id")
	private UserInput userInput;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hair_property_id", referencedColumnName = "id")
	private HairProperty hairProperty;
	
	@Column(name = "hair_porosity")
	private Porosity hairPorosity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "peh_values_id", referencedColumnName = "id")
	private PehValues pehValues;
	
	public Hair() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserInput getUserInput() {
		return userInput;
	}

	public void setUserInput(UserInput userInput) {
		this.userInput = userInput;
	}

	public HairProperty getHairProperty() {
		return hairProperty;
	}

	public void setHairProperty(HairProperty hairProperty) {
		this.hairProperty = hairProperty;
	}

	public Porosity getHairPorosity() {
		return hairPorosity;
	}

	public void setHairPorosity(Porosity hairPorosity) {
		this.hairPorosity = hairPorosity;
	}

	public PehValues getPehValues() {
		return pehValues;
	}

	public void setPehValues(PehValues pehValues) {
		this.pehValues = pehValues;
	}
	

}
