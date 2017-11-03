package com.airbnb.service;

import java.util.List;
import com.airbnb.model.CityModel;

public interface CityService {

	public List<CityModel> getAllCities();
	public String addCity(CityModel city);
}
