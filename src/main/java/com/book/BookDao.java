package com.book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookDao {
	private SessionFactory sessionFactory = Cofig.getSessionFactory();
	
	public boolean saveBook(BookEntity bookEntity ) {
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(bookEntity);
		transaction.commit();
		
		
		
		
	return true;	
	}
}
