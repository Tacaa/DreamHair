package sbnz.integracija.example.dto;



public class OnePreparationDTO {
	Integer id;
	String name;
	ReviewDTO review;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ReviewDTO getReview() {
		return review;
	}
	public void setReview(ReviewDTO review) {
		this.review = review;
	}
	public OnePreparationDTO(Integer id, String name, ReviewDTO review) {
		super();
		this.id = id;
		this.name = name;
		this.review = review;
	}
	public OnePreparationDTO() {
		super();
	}
	
	
	
	
}
