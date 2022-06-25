package sbnz.integracija.example.dto;

import java.util.ArrayList;
import java.util.List;

public class ReviewDTO {
	int id;
	List<String>comments;
	double rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public ReviewDTO(int id, List<String> comments, double rating) {
		super();
		this.id = id;
		this.comments = comments;
		this.rating = rating;
	}
	public ReviewDTO() {
		super();
	}
	
	
}
