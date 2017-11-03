package com.airbnb.service;

import java.util.List;
import com.airbnb.model.UserDetailModel;

public interface UserDetailService {

	public UserDetailModel getAllUserDetails(int user_id);
	public String addUserDetail(UserDetailModel userdetail);
}
