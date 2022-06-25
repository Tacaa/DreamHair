package sbnz.integracija.example.dto;

import java.util.List;

public class DiaryDTO {
	private Integer id;
	private List<String> hairWash;
	private List<String> hairGrowth;
	private List<String> hairState;
	private List<String> comments;
	
	
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
	
	public DiaryDTO(Integer id, List<String> hairWash, List<String> hairGrowth, List<String> hairState,
			List<String> comments) {
		super();
		this.id = id;
		this.hairWash = hairWash;
		this.hairGrowth = hairGrowth;
		this.hairState = hairState;
		this.comments = comments;
	}
	
	public DiaryDTO() {
		super();
	}
	
	
	
	
	
}
