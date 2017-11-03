package com.airbnb.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.codehaus.jettison.json.JSONObject;

import com.airbnb.model.User;
import com.airbnb.service.UserService;
import com.airbnb.service.UserServiceImpl;

import java.io.UnsupportedEncodingException;
import java.util.Base64; 

@Path("/user")
public class UserController {
	
	UserService userService = new UserServiceImpl();

	@Path("/auth")
	@GET
	@Produces("application/json")
	public String findUserByEmail(
			@QueryParam("email") String email,
			@QueryParam("pwd") String pwd	
			) throws Exception
	{
		User user = userService.findUserByEmail(email,pwd);
		
		String response="";
		JSONObject jsonObject = new JSONObject();
		
		
		if(email.equalsIgnoreCase(user.getEmail()) && pwd.equalsIgnoreCase(user.getPwd())) {
		
		
		
		jsonObject.put("Status", "Success");
		jsonObject.put("name", user.getName());
		jsonObject.put("email", user.getEmail());
		jsonObject.put("userid", user.getUserid());
		
		response = jsonObject.toString();
	
		}
		else{
			
			jsonObject.put("Status","Failure");			
			response = jsonObject.toString();
			
		}
		
		return response;
	}
	@POST
	@Path("/add")
	@Produces("application/json")
	public String addUser(User user) throws UnsupportedEncodingException {
		
		/*String password = user.getPwd();
		user.setPwd(password);*/
		return userService.addUser(user);
	}
}
	
	