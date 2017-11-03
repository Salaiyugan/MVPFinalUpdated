package com.airbnb.service;

import java.util.List;
import com.airbnb.model.BookModel;

public interface BookService {

	public List<BookModel> getAllBooks();
	public String addBook(BookModel book);
}
