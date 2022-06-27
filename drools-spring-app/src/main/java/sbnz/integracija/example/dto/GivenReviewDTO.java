package sbnz.integracija.example.dto;

public class GivenReviewDTO {
	private int id;
	private int rate;
	private String comment;
	private int prepId;
	
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
	public int getPrepId() {
		return prepId;
	}
	public void setPrepId(int prepId) {
		this.prepId = prepId;
	}
	
	public GivenReviewDTO(int id, int rate, String comment, int prepId) {
		super();
		this.id = id;
		this.rate = rate;
		this.comment = comment;
		this.prepId = prepId;
	}
	
	
	public GivenReviewDTO() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "GivenReviewDTO [id=" + id + ", rate=" + rate + ", comment=" + comment + ", prepId=" + prepId + "]";
	}
	
	
	
	
	
	
}
