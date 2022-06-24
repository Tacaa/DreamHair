package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.time.*;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import sbnz.integracija.example.converter.ListToHairStateConverter;
import sbnz.integracija.example.converter.ListToIntegerConverter;
import sbnz.integracija.example.converter.ListToLocalDateTimeConverter;
import sbnz.integracija.example.converter.ListToStringConverter;
import sbnz.integracija.example.enums.HairState;

@Entity
@Table(name = "diary")
public class Diary implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "hair_wash")
	@Convert(converter = ListToStringConverter.class)
	private List<String> hairWash;
	
	@Column(name = "hair_growth")
	@Convert(converter = ListToStringConverter.class)
	private List<String> hairGrowth;
	
	
	@Column(name = "hair_state")
	@Convert(converter = ListToStringConverter.class)
	private List<String> hairState;
	
	
	@Column(name = "comments")
	@Convert(converter = ListToStringConverter.class)
	private List<String> comments;
	

	public Diary() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<String> getHairWash() {
		return hairWash;
	}

	public void setHairWash(List<String> hairWash) {
		this.hairWash = hairWash;
	}

	public List<String> getHairGrowth() {
		return hairGrowth;
	}

	public void setHairGrowth(List<String> hairGrowth) {
		this.hairGrowth = hairGrowth;
	}

	public List<String> getHairState() {
		return hairState;
	}

	public void setHairState(List<String> hairState) {
		this.hairState = hairState;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Diary [id=" + id + ", hairWash=" + hairWash + ", hairGrowth=" + hairGrowth + ", hairState=" + hairState
				+ ", comments=" + comments + "]";
	}

	
	
}
