package com.airbnb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="city")

public class CityModel {

	@Id
	@GeneratedValue
	@Column(name="city_id")
	private int cityid;

	
	@Column(name="city_name")
	private String cityname;
	
	@Column(name="last_modified")
	private String lastmodified;
	
	@Column(name="updated_by")
	private String updated_by;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private CountryModel countrymodel;

	public CountryModel getCountrymodel() {
		return countrymodel;
	}

	public void setCountrymodel(CountryModel countrymodel) {
		this.countrymodel = countrymodel;
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(String lastmodified) {
		this.lastmodified = lastmodified;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	
	
}
