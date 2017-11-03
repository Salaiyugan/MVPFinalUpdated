package com.airbnb.dao;

import com.airbnb.model.ReviewModel;
import java.util.List;

public interface ReviewDao {
	
	public List<ReviewModel> getAllReviewModel();
	public String addReview(ReviewModel review);

}
