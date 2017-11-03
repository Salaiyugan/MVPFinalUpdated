package com.airbnb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class BookModel {
	
	@Id
	@GeneratedValue
	@Column(name="book_id")
	private int bookid;
	
	@Column(name="booking_date")
	private java.sql.Date  bookingdate;
	
	@Column(name="booked_from")
	private  java.sql.Date bookedfrom;
	
	@Column(name="booked_to")
	private  java.sql.Date bookedto;
	
	@Column(name="cancel")
	private java.sql.Date cancel;
	
	@Column(name="reason")
	private String reason;

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

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public java.sql.Date getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(java.sql.Date bookingdate) {
		this.bookingdate = bookingdate;
	}

	public java.sql.Date getBookedfrom() {
		return bookedfrom;
	}

	public void setBookedfrom(java.sql.Date bookedfrom) {
		this.bookedfrom = bookedfrom;
	}

	public java.sql.Date getBookedto() {
		return bookedto;
	}

	public void setBookedto(java.sql.Date bookedto) {
		this.bookedto = bookedto;
	}

	public java.sql.Date getCancel() {
		return cancel;
	}

	public void setCancel(java.sql.Date cancel) {
		this.cancel = cancel;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	
}
