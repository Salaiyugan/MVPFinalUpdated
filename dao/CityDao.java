package com.airbnb.dao;

import com.airbnb.model.CityModel;
import java.util.List;

public interface CityDao {
	
	public List<CityModel> getAllCityModel();
	public String addCity(CityModel city);

}
