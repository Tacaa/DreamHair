package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sbnz.integracija.example.converter.ListToIntegerConverter;
import sbnz.integracija.example.converter.ListToStringConverter;

@Entity
@Table(name = "review")
public class Review implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "rating")
	private double rating;
	
	@Column(name = "coments")
	@Convert(converter = ListToStringConverter.class)
	private List<String> comments;
	
	@Column(name = "list_of_ratings")
	@Convert(converter = ListToStringConverter.class)
	private List<String> listOfRatings;
	
	@OneToOne(mappedBy = "review")
    private Preparation preparation;
	
	

	public Review() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	
	public List<String> getListOfRatings() {
		return listOfRatings;
	}

	public void setListOfRatings(List<String> listOfRatings) {
		this.listOfRatings = listOfRatings;
	}

	public Preparation getPreparation() {
		return preparation;
	}

	public void setPreparation(Preparation preparation) {
		this.preparation = preparation;
	}
	
	
}
