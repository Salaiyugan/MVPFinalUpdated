package com.airbnb.service;

import java.util.List;

import com.airbnb.model.ImageModel;
import com.airbnb.dao.ImageDao;
import com.airbnb.dao.ImageDaoImpl;

public class ImageServiceImpl implements ImageService{
	
	ImageDao imageDao = new ImageDaoImpl();
	

	@Override
	public List<ImageModel> getAllImages() {
		
		return imageDao.getAllImageModel();
	}


	@Override
	public String addImage(ImageModel image) {
		
		return imageDao.addImage(image);
	}

}
