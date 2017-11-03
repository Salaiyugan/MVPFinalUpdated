package com.airbnb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="homes")
public class HomeModel {
	
	@Id
	@GeneratedValue
	@Column(name="room_id")
	private int roomid;
	
	@Column(name="home_name")
	private String homename;
	
	@Column(name="home_type")
	private String home_type;
	
	@Column(name="is_active")
	private boolean isactive;
	

	@ManyToOne
	@JoinColumn(name = "city_id")
	private CityModel citymodel;
	
	

	public CityModel getCitymodel() {
		return citymodel;
	}

	public void setCitymodel(CityModel citymodel) {
		this.citymodel = citymodel;
	}

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public String getHomename() {
		return homename;
	}

	public void setHomename(String homename) {
		this.homename = homename;
	}

	public String getHome_type() {
		return home_type;
	}

	public void setHome_type(String home_type) {
		this.home_type = home_type;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	
}
