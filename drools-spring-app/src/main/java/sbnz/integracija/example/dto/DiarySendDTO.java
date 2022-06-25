package sbnz.integracija.example.dto;

public class DiarySendDTO {
	String hairWash;
	String hairGrowth;
	String hairState;
	String comment;
	public String getHairWash() {
		return hairWash;
	}
	public void setHairWash(String hairWash) {
		this.hairWash = hairWash;
	}
	public String getHairGrowth() {
		return hairGrowth;
	}
	public void setHairGrowth(String hairGrowth) {
		this.hairGrowth = hairGrowth;
	}
	public String getHairState() {
		return hairState;
	}
	public void setHairState(String hairState) {
		this.hairState = hairState;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public DiarySendDTO(String hairWash, String hairGrowth, String hairState, String comment) {
		super();
		this.hairWash = hairWash;
		this.hairGrowth = hairGrowth;
		this.hairState = hairState;
		this.comment = comment;
	}
	public DiarySendDTO() {
		super();
	}
	
	
}
