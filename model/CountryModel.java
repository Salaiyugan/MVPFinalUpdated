package com.airbnb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class CountryModel {
	


		@Id
		@GeneratedValue
		@Column(name="country_id")
		private int countryid;
		
		@Column(name="country_name")
		private String countryname;
		
		

		public int getCountryid() {
			return countryid;
		}

		public void setCountryid(int countryid) {
			this.countryid = countryid;
		}

		public String getCountryname() {
			return countryname;
		}

		public void setCountryname(String countryname) {
			this.countryname = countryname;
		}
		
		
		
	
}