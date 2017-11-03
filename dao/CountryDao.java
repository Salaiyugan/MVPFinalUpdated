package com.airbnb.dao;

import com.airbnb.model.CountryModel;
import java.util.List;

public interface CountryDao {
	
	public List<CountryModel> getAllCountryModel();
	public String addCountry(CountryModel country);

}
