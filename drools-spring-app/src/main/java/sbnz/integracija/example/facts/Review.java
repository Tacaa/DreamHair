package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;

public class Review implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private double rating;
	private List<String> comments;
	private List<Integer> listOfRatings;
	
	public List<Integer> getListOfRatings() {
		return listOfRatings;
	}

	public void setListOfRatings(List<Integer> listOfRatings) {
		this.listOfRatings = listOfRatings;
	}

	public Review(User user, double rating, List<String> comments, List<Integer> listOfRatings) {
		super();
		this.user = user;
		this.rating = rating;
		this.listOfRatings = listOfRatings;
		this.comments = comments;
	}

	public Review() {
		
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "Review [user=" + user + ", rating=" + rating + ", comments=" + comments + "]";
	}
	
	
	
	
}
