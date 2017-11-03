package com.airbnb.dao;

import com.airbnb.model.BookModel;
import java.util.List;

public interface BookDao {
	
	public List<BookModel> getAllBookModel();
	public String addBook(BookModel book);

}
