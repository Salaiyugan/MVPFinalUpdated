package com.airbnb.service;

import java.util.List;

import com.airbnb.model.ReviewModel;
import com.airbnb.dao.ReviewDao;
import com.airbnb.dao.ReviewDaoImpl;

public class ReviewServiceImpl implements ReviewService{
	
	ReviewDao reviewDao = new ReviewDaoImpl();
	

	@Override
	public List<ReviewModel> getAllReviews() {
		
		return reviewDao.getAllReviewModel();
	}


	@Override
	public String addReview(ReviewModel review) {
		
		return reviewDao.addReview(review);
	}

}
