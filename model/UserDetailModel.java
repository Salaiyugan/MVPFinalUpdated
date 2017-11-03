package com.airbnb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserDetailModel {
	
	@Id
	@GeneratedValue
	@Column(name="userdetail_id")
	private int userdetailid;
	
	
	@Column(name="user_id")
	public int user_id;
	
	@Column(name="phone")
	private int phone;
	
	@Column(name="country")
	private String country;

	public int getUserdetailid() {
		return userdetailid;
	}

	public void setUserdetailid(int userdetailid) {
		this.userdetailid = userdetailid;
	}

	public int getUserid() {
		return user_id;
	}

	public void setUserid(int user_id) {
		this.user_id = user_id;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
}
