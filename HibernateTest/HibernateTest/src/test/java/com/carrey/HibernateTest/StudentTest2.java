package com.carrey.HibernateTest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.carrey.HibernateTest.dojo.Address;
import com.carrey.HibernateTest.dojo.Student;

public class StudentTest2 {

	
	@Test
	public void testSaveStudent(){
		SessionFactory factory  = new Configuration().configure().buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.getTransaction().begin();
		
		Address address = new Address("134","333","吉林市");
		Student s = new Student(2, "哈哈", "男", new Date(), address);
		session.save(s);
		
		session.getTransaction().commit();
		
		factory.close();
	}
}
