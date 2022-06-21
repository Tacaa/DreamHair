package sbnz.integracija.example.facts;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "advice")
public class Advice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "score")
	private Integer score;
	
	@Column(name = "first_advice")
	private String firstAdvice;
	
	@Column(name = "second_advice")
	private String secondAdvice;
	
	@Column(name = "third_advice")
	private String thirdAdvice;

	public Advice() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getFirstAdvice() {
		return firstAdvice;
	}

	public void setFirstAdvice(String firstAdvice) {
		this.firstAdvice = firstAdvice;
	}

	public String getSecondAdvice() {
		return secondAdvice;
	}

	public void setSecondAdvice(String secondAdvice) {
		this.secondAdvice = secondAdvice;
	}

	public String getThirdAdvice() {
		return thirdAdvice;
	}

	public void setThirdAdvice(String thirdAdvice) {
		this.thirdAdvice = thirdAdvice;
	}
	
	
	
}
