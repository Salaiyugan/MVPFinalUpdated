package com.airbnb.dao;

import java.util.List;

import com.airbnb.model.HomeModel;
import com.airbnb.util.HibernateUtil;

public class HomeDaoImpl implements HomeDao{
	
	HibernateUtil hibernateUtil = new HibernateUtil();
	
	
	@Override
	public String addHome(HomeModel home) {
		hibernateUtil.openCurrentSessionwithTransaction();
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(home);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "User record saved successfully with id:"+id;
	}

	@Override
	public List<HomeModel> getAllHomeModel() {
		hibernateUtil.openCurrentSession();
		
		List<HomeModel> home_records =(List<HomeModel>)hibernateUtil.getCurrentSession().createQuery("from HomeModel").list();
		
		hibernateUtil.closeCurrentSession();
		return home_records;
	}
	
	
	
	
	public static void main(String aaa[])
	{
		HomeDaoImpl homeDaoImpl = new HomeDaoImpl();
		List<HomeModel> home_records = homeDaoImpl.getAllHomeModel();
		for(HomeModel um:home_records)
		System.out.println(um.getHomename()+"   "+um.getHome_type()+"    "+um.isIsactive());
	}




	

}
