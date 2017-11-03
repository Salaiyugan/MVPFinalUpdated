package com.airbnb.service;

import com.airbnb.model.User;

public interface UserService {
	
	public User findUserByEmail(String email,String pwd);
	public String addUser(User user);
}
