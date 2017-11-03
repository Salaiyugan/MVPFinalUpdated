package com.airbnb.dao;

import java.util.List;

import com.airbnb.model.ImageModel;
import com.airbnb.util.HibernateUtil;

public class ImageDaoImpl implements ImageDao{
	
	HibernateUtil hibernateUtil = new HibernateUtil();
	
	
	@Override
	public String addImage(ImageModel image) {
		hibernateUtil.openCurrentSessionwithTransaction();
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(image);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "User record saved successfully with id:"+id;
	}

	@Override
	public List<ImageModel> getAllImageModel() {
		hibernateUtil.openCurrentSession();
		
		List<ImageModel> image_records =(List<ImageModel>)hibernateUtil.getCurrentSession().createQuery("from ImageModel").list();
		
		hibernateUtil.closeCurrentSession();
		return image_records;
	}
	
	
	
	
	public static void main(String aaa[])
	{
		ImageDaoImpl imageDaoImpl = new ImageDaoImpl();
		List<ImageModel> image_records = imageDaoImpl.getAllImageModel();
		for(ImageModel um:image_records)
		System.out.println(um.getImage());
	}




	

}
