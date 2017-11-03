package com.airbnb.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import java.util.List;
import com.airbnb.model.ReviewModel;
import com.airbnb.service.ReviewService;
import com.airbnb.service.ReviewServiceImpl;

@Path("/review")
public class ReviewController {
	
	ReviewService reviewService = new ReviewServiceImpl();

	@Path("/getAllReviews")
	@GET
	@Produces("application/json")
	public List<ReviewModel> getAllReviews()
	{
		return reviewService.getAllReviews();
	}
	
	
	@Path("/add")
	@GET
	@Consumes("text/html")
	@Produces("text/html")
	public String addReview(
			@QueryParam("userid") int userid,
			@QueryParam("roomid") int roomid,
			@QueryParam("rating") int rating,
			@QueryParam("feedback") String feedback
			)
	{
		ReviewModel reviewModel = new ReviewModel();
		reviewModel.setRating(rating);
		reviewModel.setFeedback(feedback);
		return reviewService.addReview(reviewModel);
	}
	
}
