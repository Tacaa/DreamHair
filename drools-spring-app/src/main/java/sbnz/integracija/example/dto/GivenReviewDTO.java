package sbnz.integracija.example.dto;

public class GivenReviewDTO {
	private int id;
	private int rate;
	private String comment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public GivenReviewDTO(int id, int rate, String comment) {
		super();
		this.id = id;
		this.rate = rate;
		this.comment = comment;
	}
	public GivenReviewDTO() {
		super();
	}
	
	
	
	
}
