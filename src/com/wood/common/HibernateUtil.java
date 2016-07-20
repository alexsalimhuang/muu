package com.wood.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	static {
//		AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
		Configuration cfg = new Configuration().configure();
		sessionFactory = cfg.buildSessionFactory();
	}

	public static Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
}
