package com.airbnb.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import java.util.List;
import com.airbnb.model.BookModel;
import com.airbnb.service.BookService;
import com.airbnb.service.BookServiceImpl;

@Path("/book")
public class BookController {
	
	BookService bookService = new BookServiceImpl();

	@Path("/getAllBooks")
	@GET
	@Produces("application/json")
	public List<BookModel> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	
	@Path("/add")
	@GET
	@Consumes("text/html")
	@Produces("text/html")
	public String addBook(
			@QueryParam("user_id") int user_id,
			@QueryParam("roomid") int roomid,
			@QueryParam("bookingdate") java.sql.Date bookingdate,
			@QueryParam("bookedfrom") java.sql.Date bookedfrom,
			@QueryParam("bookedto") java.sql.Date bookedto,
			@QueryParam("cancel") java.sql.Date cancel,
			@QueryParam("reason")String reason
			)
	{
		BookModel bookModel = new BookModel();
		bookModel.setBookingdate(bookingdate);
		bookModel.setBookedfrom(bookedfrom);
		bookModel.setBookedto(bookedto);
		bookModel.setCancel(cancel);
		bookModel.setReason(reason);
		return bookService.addBook(bookModel);
	}
	
}
