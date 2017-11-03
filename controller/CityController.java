package com.airbnb.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import java.util.List;
import com.airbnb.model.CityModel;
import com.airbnb.service.CityService;
import com.airbnb.service.CityServiceImpl;

@Path("/city")
public class CityController {
	
	CityService cityService = new CityServiceImpl();

	@Path("/getAllCity")
	@GET
	@Produces("application/json")
	public List<CityModel> getAllCities()
	{
		return cityService.getAllCities();
	}
	
	
	@Path("/add")
	@GET
	@Consumes("text/html")
	@Produces("text/html")
	public String addUser(
			@QueryParam("countryid") int countryid,
			@QueryParam("cityname") String cityname,
			@QueryParam("lastmodified") String lastmodified,
			@QueryParam("updated_by") String  updated_by
			)
	{
		CityModel cityModel = new CityModel();
		cityModel.setCityname(cityname);
		cityModel.setLastmodified(lastmodified);
		cityModel.setUpdated_by(updated_by);
		
		return cityService.addCity(cityModel);
	}
	
}
