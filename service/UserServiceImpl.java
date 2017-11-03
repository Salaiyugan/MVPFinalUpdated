package com.airbnb.service;

import java.util.List;

import com.airbnb.dao.UserDao;
import com.airbnb.dao.UserDaoImpl;
import com.airbnb.dao.UserDetailDao;
import com.airbnb.dao.UserDetailDaoImpl;
import com.airbnb.model.User;
import com.airbnb.model.UserDetailModel;

public class UserServiceImpl implements UserService{
	
	UserDao userDao = new UserDaoImpl();

	@Override
	public User findUserByEmail(String email,String pwd) {
	
		return userDao.findUserByEmail(email,pwd);
	}

	@Override
	public String addUser(User user) {
		
		return userDao.addUser(user);
	}
}



