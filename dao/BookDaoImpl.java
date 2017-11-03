package com.airbnb.dao;

import java.util.List;

import com.airbnb.model.BookModel;
import com.airbnb.util.HibernateUtil;

public class BookDaoImpl implements BookDao{
	
	HibernateUtil hibernateUtil = new HibernateUtil();
	
	
	@Override
	public String addBook(BookModel book) {
		hibernateUtil.openCurrentSessionwithTransaction();
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(book);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "User record saved successfully with id:"+id;
	}

	@Override
	public List<BookModel> getAllBookModel() {
		hibernateUtil.openCurrentSession();
		
		List<BookModel> book_records =(List<BookModel>)hibernateUtil.getCurrentSession().createQuery("from BookModel").list();
		
		hibernateUtil.closeCurrentSession();
		return book_records;
	}
	
	
	
	
	public static void main(String aaa[])
	{
		BookDaoImpl bookDaoImpl = new BookDaoImpl();
		List<BookModel> book_records = bookDaoImpl.getAllBookModel();
		for(BookModel um:book_records)
		System.out.println(um.getBookingdate()+"    "+um.getBookedfrom()+"    "+um.getBookedto()+"    "+um.getCancel()+"    "+um.getReason());
	}




	

}
