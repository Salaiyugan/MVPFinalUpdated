package com.airbnb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class ReviewModel {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="rating")
	private int rating;
	
	@Column(name="feedback")
	private String feedback;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private HomeModel homemodel;
	
	
	public HomeModel getHomemodel() {
		return homemodel;
	}

	public void setHomemodel(HomeModel homemodel) {
		this.homemodel = homemodel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	
}
