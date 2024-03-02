package com.hibernate.practice;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
private static SessionFactory sessionFactory =null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		
		return sessionFactory;
	}

	public static void main(String[] args) {
		getSessionFactory();
	}

}
