package com.carrey.HibernateTest;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLTest {
	private static SessionFactory factory;

	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		try {
			Session session = factory.openSession();

			String hql = "select E.firstName,C.name FROM Employee E, Certificate C";
			Query query = session.createQuery(hql);
			List<Object[]> results = query.list();

			for (Object[] e : results) {
				System.out.println(e[0]+","+e[1]);
			}

		} finally {

			factory.close();
		}
	}
}
