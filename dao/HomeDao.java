package com.airbnb.dao;

import com.airbnb.model.HomeModel;
import java.util.List;

public interface HomeDao {
	
	public List<HomeModel> getAllHomeModel();
	public String addHome(HomeModel home);

}
