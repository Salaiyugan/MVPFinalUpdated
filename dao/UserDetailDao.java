package com.airbnb.dao;

import com.airbnb.model.UserDetailModel;
import java.util.List;

public interface UserDetailDao {
	
	public UserDetailModel getAllUserDetailModel(int user_id);
	public String addUserDetail(UserDetailModel userdetail);

}
