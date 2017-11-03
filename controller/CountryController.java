package com.airbnb.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import java.util.List;
import com.airbnb.model.CountryModel;
import com.airbnb.service.CountryService;
import com.airbnb.service.CountryServiceImpl;

@Path("/country")
public class CountryController {
	
	CountryService countryService = new CountryServiceImpl();

	@Path("/getAllCountry")
	@GET
	@Produces("application/json")
	public List<CountryModel> getAllCountries()
	{
		return countryService.getAllCountries();
	}
	
	
	@Path("/add")
	@GET
	@Consumes("text/html")
	@Produces("text/html")
	public String addCountry(
			@QueryParam("countryname") String countryname
			
			)
	{
		CountryModel countryModel = new CountryModel();
		countryModel.setCountryname(countryname);
		return countryService.addCountry(countryModel);
	}
	
}
