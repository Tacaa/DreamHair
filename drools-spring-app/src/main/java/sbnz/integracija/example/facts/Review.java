package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.List;

public class Review implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private int rating;
	private List<String> comments;
	
	public Review(User user, int rating, List<String> comments) {
		super();
		this.user = user;
		this.rating = rating;
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
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
