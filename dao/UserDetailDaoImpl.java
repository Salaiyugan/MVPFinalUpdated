package com.airbnb.dao;

import java.util.List;

import com.airbnb.model.UserDetailModel;
import com.airbnb.util.HibernateUtil;

public class UserDetailDaoImpl implements UserDetailDao{
	
	HibernateUtil hibernateUtil = new HibernateUtil();
	
	
	@Override
	public String addUserDetail(UserDetailModel userdetail) {
		hibernateUtil.openCurrentSessionwithTransaction();
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(userdetail);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "User record saved successfully with id:"+id;
	}

	@Override
	public UserDetailModel getAllUserDetailModel(int user_id) {
		hibernateUtil.openCurrentSession();
		
		UserDetailModel model =(UserDetailModel) hibernateUtil.getCurrentSession().createQuery("from UserDetailModel where user_id="+user_id+"").uniqueResult();
		
		hibernateUtil.closeCurrentSession();
		return model;
	}
	
	
	
	
/*	public static void main(String aaa[])
	{
		UserDetailDaoImpl userdetailDaoImpl = new UserDetailDaoImpl();
		UserDetailModel model = userdetailDaoImpl.getAllUserDetailModel();
		for(UserDetailModel um:userdetail_records)
		System.out.println(um.getUserid()+"    "+um.getPhone()+"   "+um.getCountry());
	}

*/


	

}
