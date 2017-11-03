package com.airbnb.service;

import java.util.List;
import com.airbnb.model.HomeModel;

public interface HomeService {

	public List<HomeModel> getAllHomes();
	public String addHome(HomeModel home);
}
