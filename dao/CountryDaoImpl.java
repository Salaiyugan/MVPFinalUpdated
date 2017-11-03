package com.airbnb.dao;

import java.util.List;

import com.airbnb.model.CountryModel;
import com.airbnb.util.HibernateUtil;

public class CountryDaoImpl implements CountryDao{
	
	HibernateUtil hibernateUtil = new HibernateUtil();
	
	
	@Override
	public String addCountry(CountryModel country) {
		hibernateUtil.openCurrentSessionwithTransaction();
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(country);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "User record saved successfully with id:"+id;
	}

	@Override
	public List<CountryModel> getAllCountryModel() {
		hibernateUtil.openCurrentSession();
		
		List<CountryModel> country =(List<CountryModel>)hibernateUtil.getCurrentSession().createQuery("from CountryModel").list();
		
		hibernateUtil.closeCurrentSession();
		return country;
	}
	
	
	
	
	public static void main(String aaa[])
	{
		CountryDaoImpl countryDaoImpl = new CountryDaoImpl();
		List<CountryModel> country = countryDaoImpl.getAllCountryModel();
		for(CountryModel um:country)
		System.out.println(um.getCountryid()+"    "+um.getCountryname());
	}




	

}
