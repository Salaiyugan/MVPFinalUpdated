package com.airbnb.service;

import java.util.List;

import com.airbnb.model.BookModel;
import com.airbnb.dao.BookDao;
import com.airbnb.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{
	
	BookDao bookDao = new BookDaoImpl();
	

	@Override
	public List<BookModel> getAllBooks() {
		
		return bookDao.getAllBookModel();
	}


	@Override
	public String addBook(BookModel book) {
		
		return bookDao.addBook(book);
	}

}
