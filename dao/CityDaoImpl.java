package com.airbnb.dao;

import java.util.List;

import com.airbnb.model.CityModel;
import com.airbnb.util.HibernateUtil;

public class CityDaoImpl implements CityDao{
	
	HibernateUtil hibernateUtil = new HibernateUtil();
	
	
	@Override
	public String addCity(CityModel city) {
		hibernateUtil.openCurrentSessionwithTransaction();
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(city);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "User record saved successfully with id:"+id;
	}

	@Override
	public List<CityModel> getAllCityModel() {
		hibernateUtil.openCurrentSession();
		
		List<CityModel> city_records =(List<CityModel>)hibernateUtil.getCurrentSession().createQuery("from CityModel").list();
		
		hibernateUtil.closeCurrentSession();
		return city_records;
	}
	
	
	
	
	public static void main(String aaa[])
	{
		CityDaoImpl cityDaoImpl = new CityDaoImpl();
		List<CityModel> city_records = cityDaoImpl.getAllCityModel();
		for(CityModel um:city_records)
		System.out.println(um.getCityid()+"   "+um.getCityname()+"    "+um.getLastmodified()+"    "+um.getUpdated_by());
	}




	

}
