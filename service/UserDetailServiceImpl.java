package com.airbnb.service;

import java.util.List;

import com.airbnb.model.UserDetailModel;
import com.airbnb.dao.UserDetailDao;
import com.airbnb.dao.UserDetailDaoImpl;

public class UserDetailServiceImpl implements UserDetailService{
	
	UserDetailDao userdetailDao = new UserDetailDaoImpl();
	

	@Override
	public UserDetailModel getAllUserDetails(int user_id) {
		
		return userdetailDao.getAllUserDetailModel(user_id);
	}


	@Override
	public String addUserDetail(UserDetailModel userdetail) {
		
		return userdetailDao.addUserDetail(userdetail);
	}

}
