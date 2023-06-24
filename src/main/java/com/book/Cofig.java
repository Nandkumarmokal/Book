package com.book;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Cofig {
	
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure().addAnnotatedClass(BookEntity.class);
		
		SessionFactory sessionFactory	 = configuration.buildSessionFactory();
		return sessionFactory;
		
	}

}
