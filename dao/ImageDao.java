package com.airbnb.dao;

import com.airbnb.model.ImageModel;
import java.util.List;

public interface ImageDao {
	
	public List<ImageModel> getAllImageModel();
	public String addImage(ImageModel image);

}
