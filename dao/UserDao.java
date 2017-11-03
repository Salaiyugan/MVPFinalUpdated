package com.airbnb.dao;


import com.airbnb.model.User;

public interface UserDao {
	
	public User findUserByEmail(String email, String pwd);
	public String addUser(User user);
}
