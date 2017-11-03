package com.airbnb.service;

import java.util.List;
import com.airbnb.model.ReviewModel;

public interface ReviewService {

	public List<ReviewModel> getAllReviews();
	public String addReview(ReviewModel review);
}
