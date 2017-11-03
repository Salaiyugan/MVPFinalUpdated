package com.airbnb.dao;

import com.airbnb.model.User;
import com.airbnb.util.HibernateUtil;

public class UserDaoImpl implements UserDao{
	
	HibernateUtil hibernateUtil = new HibernateUtil();

	@Override
	public User findUserByEmail(String email,String pwd) {
		hibernateUtil.openCurrentSession();
		
		User user =(User) hibernateUtil.getCurrentSession().createQuery("from User where email='"+email+"' and pwd='"+pwd+"'").uniqueResult();
		
		hibernateUtil.closeCurrentSession();
		
		return user;
	}

	@Override
	public String addUser(User user) {
		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().save(user);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "saved";
		/*hibernateUtil.openCurrentSessionwithTransaction();
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(user);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "User record saved successfully with id:"+id;*/
	}
}
