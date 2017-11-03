package com.airbnb.service;

import java.util.List;

import com.airbnb.model.CountryModel;
import com.airbnb.dao.CountryDao;
import com.airbnb.dao.CountryDaoImpl;

public class CountryServiceImpl implements CountryService{
	
	CountryDao countryDao = new CountryDaoImpl();
	

	@Override
	public List<CountryModel> getAllCountries() {
		
		return countryDao.getAllCountryModel();
	}


	@Override
	public String addCountry(CountryModel country) {
		
		return countryDao.addCountry(country);
	}

}
