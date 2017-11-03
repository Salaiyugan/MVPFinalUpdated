package com.airbnb.service;

import java.util.List;
import com.airbnb.model.ImageModel;

public interface ImageService {

	public List<ImageModel> getAllImages();
	public String addImage(ImageModel image);
}
