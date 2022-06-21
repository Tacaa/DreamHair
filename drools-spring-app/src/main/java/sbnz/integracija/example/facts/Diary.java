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
	@Convert(converter = ListToLocalDateTimeConverter.class)
	private List<LocalDateTime> hairWash;
	
	@Column(name = "hair_growth")
	@Convert(converter = ListToIntegerConverter.class)
	private List<Integer> hairGrowth;
	
	@Column(name = "hair_growth_consistency")
	@Convert(converter = ListToLocalDateTimeConverter.class)
	private List<LocalDateTime> hairGrowthConsistency;
	
	@Column(name = "hair_state")
	@Convert(converter = ListToHairStateConverter.class)
	private List<HairState> hairState;
	
	@Column(name = "hair_state_consistency")
	@Convert(converter = ListToLocalDateTimeConverter.class)
	private List<LocalDateTime> hairStateConsistency;
	
	@Column(name = "comments")
	@Convert(converter = ListToStringConverter.class)
	private List<String> comments;
	
	@Column(name = "comments_consistency")
	@Convert(converter = ListToLocalDateTimeConverter.class)
	private List<LocalDateTime> commentsConsistency;

	public Diary() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<LocalDateTime> getHairWash() {
		return hairWash;
	}

	public void setHairWash(List<LocalDateTime> hairWash) {
		this.hairWash = hairWash;
	}

	public List<Integer> getHairGrowth() {
		return hairGrowth;
	}

	public void setHairGrowth(List<Integer> hairGrowth) {
		this.hairGrowth = hairGrowth;
	}

	public List<LocalDateTime> getHairGrowthConsistency() {
		return hairGrowthConsistency;
	}

	public void setHairGrowthConsistency(List<LocalDateTime> hairGrowthConsistency) {
		this.hairGrowthConsistency = hairGrowthConsistency;
	}

	public List<HairState> getHairState() {
		return hairState;
	}

	public void setHairState(List<HairState> hairState) {
		this.hairState = hairState;
	}

	public List<LocalDateTime> getHairStateConsistency() {
		return hairStateConsistency;
	}

	public void setHairStateConsistency(List<LocalDateTime> hairStateConsistency) {
		this.hairStateConsistency = hairStateConsistency;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public List<LocalDateTime> getCommentsConsistency() {
		return commentsConsistency;
	}

	public void setCommentsConsistency(List<LocalDateTime> commentsConsistency) {
		this.commentsConsistency = commentsConsistency;
	}
	
	
}
