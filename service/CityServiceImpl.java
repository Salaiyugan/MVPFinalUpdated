package com.airbnb.service;

import java.util.List;

import com.airbnb.model.CityModel;
import com.airbnb.dao.CityDao;
import com.airbnb.dao.CityDaoImpl;

public class CityServiceImpl implements CityService{
	
	CityDao cityDao = new CityDaoImpl();
	

	@Override
	public List<CityModel> getAllCities() {
		
		return cityDao.getAllCityModel();
	}


	@Override
	public String addCity(CityModel city) {
		
		return cityDao.addCity(city);
	}

}
