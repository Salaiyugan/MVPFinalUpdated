package com.airbnb.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import java.util.List;
import com.airbnb.model.HomeModel;
import com.airbnb.service.HomeService;
import com.airbnb.service.HomeServiceImpl;

@Path("/home")
public class HomeController {
	
	HomeService homeService = new HomeServiceImpl();

	@Path("/getAllHomes")
	@GET
	@Produces("application/json")
	public List<HomeModel> getAllHomes()
	{
		return homeService.getAllHomes();
	}
	
	
	@Path("/add")
	@GET
	@Consumes("text/html")
	@Produces("text/html")
	public String addHome(
			@QueryParam("cityid") int cityid,
			@QueryParam("homename") String homename,
			@QueryParam("home_type") String home_type,
			@QueryParam("isactive") boolean isactive
			)
	{
		HomeModel homeModel = new HomeModel();
		homeModel.setHomename(homename);
		homeModel.setHome_type(home_type);
		homeModel.setIsactive( isactive);
		return homeService.addHome(homeModel);
	}
	
}
