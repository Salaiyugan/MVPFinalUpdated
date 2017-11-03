package com.airbnb.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import java.util.List;
import com.airbnb.model.ImageModel;
import com.airbnb.service.ImageService;
import com.airbnb.service.ImageServiceImpl;

@Path("/image")
public class ImageController {
	
	ImageService imageService = new ImageServiceImpl();

	@Path("/getAllImages")
	@GET
	@Produces("application/json")
	public List<ImageModel> getAllImages()
	{
		return imageService.getAllImages();
	}
	
	
	@Path("/add")
	@GET
	@Consumes("text/html")
	@Produces("text/html")
	public String addImage(
			@QueryParam("roomid") int roomid,
			@QueryParam("image")String image,
			@QueryParam("pwd") String pwd
			)
	{
		ImageModel imageModel = new ImageModel();
		imageModel.setImage(image);
		return imageService.addImage(imageModel);
	}
	
}
