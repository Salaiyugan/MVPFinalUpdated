package com.airbnb.service;

import java.util.List;
import com.airbnb.model.CountryModel;

public interface CountryService {

	public List<CountryModel> getAllCountries();
	public String addCountry(CountryModel country);
}
