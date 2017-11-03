package com.airbnb.dao;

import java.util.List;

import com.airbnb.model.ReviewModel;
import com.airbnb.util.HibernateUtil;

public class ReviewDaoImpl implements ReviewDao{
	
	HibernateUtil hibernateUtil = new HibernateUtil();
	
	
	@Override
	public String addReview(ReviewModel review) {
		hibernateUtil.openCurrentSessionwithTransaction();
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(review);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "User record saved successfully with id:"+id;
	}

	@Override
	public List<ReviewModel> getAllReviewModel() {
		hibernateUtil.openCurrentSession();
		
		List<ReviewModel> review_records =(List<ReviewModel>)hibernateUtil.getCurrentSession().createQuery("from ReviewModel").list();
		
		hibernateUtil.closeCurrentSession();
		return review_records;
	}
	
	
	
	
	public static void main(String aaa[])
	{
		ReviewDaoImpl reviewDaoImpl = new ReviewDaoImpl();
		List<ReviewModel> review_records = reviewDaoImpl.getAllReviewModel();
		for(ReviewModel um:review_records)
		System.out.println(um.getId()+"    "+um.getRating()+""+um.getFeedback());
	}




	

}
