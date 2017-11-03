package com.airbnb.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.codehaus.jettison.json.JSONObject;

import com.airbnb.model.UserDetailModel;
import com.airbnb.service.UserDetailService;
import com.airbnb.service.UserDetailServiceImpl;

@Path("/userdetail")
public class UserDetailController {
	
	UserDetailService userDetailService = new UserDetailServiceImpl();

	@Path("/getAllUserDetails")
	@GET
	@Produces("application/json")
	public String getAllUserDetails(
			@QueryParam("user_id") int user_id	) throws Exception
	{
		UserDetailModel model = userDetailService.getAllUserDetails(user_id);
		
		String response="";
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("user_id", model.getUserid());
		jsonObject.put("country", model.getCountry()); 
		
		response = jsonObject.toString();
		
		return response;
	}
	
	
	@POST
	@Path("/add")
	@Produces("application/json")
	public String addUserDetail(UserDetailModel userdetail) throws UnsupportedEncodingException {
	
		return userDetailService.addUserDetail(userdetail);
	}
	
}
