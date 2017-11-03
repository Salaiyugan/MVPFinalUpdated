package com.airbnb.service;

import java.util.List;

import com.airbnb.model.HomeModel;
import com.airbnb.dao.HomeDao;
import com.airbnb.dao.HomeDaoImpl;

public class HomeServiceImpl implements HomeService{
	
	HomeDao homeDao = new HomeDaoImpl();
	

	@Override
	public List<HomeModel> getAllHomes() {
		
		return homeDao.getAllHomeModel();
	}


	@Override
	public String addHome(HomeModel home) {
		
		return homeDao.addHome(home);
	}

}
