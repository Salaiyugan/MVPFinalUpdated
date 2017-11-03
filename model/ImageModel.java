package com.airbnb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class ImageModel {
	
	@Id
	@GeneratedValue
	@Column(name="image_id")
	private int imageid;
	
	@Column(name="img")
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private HomeModel homemodel;
	
	
	public HomeModel getHomemodel() {
		return homemodel;
	}

	public void setHomemodel(HomeModel homemodel) {
		this.homemodel = homemodel;
	}

	public int getImageid() {
		return imageid;
	}

	public void setImageid(int imageid) {
		this.imageid = imageid;
	}


	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	

}
