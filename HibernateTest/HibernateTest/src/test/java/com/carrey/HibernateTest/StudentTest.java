package com.carrey.HibernateTest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.carrey.HibernateTest.dojo.Address;
import com.carrey.HibernateTest.dojo.Student;

public class StudentTest {
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	@Before
	public void init(){
		factory  = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		transaction = session.getTransaction();
		transaction.begin();
	}
	
	@After
	public void destroy(){
		transaction.commit();
		session.close();
		factory.close();
	}
	
	@Test
	public void testSaveStudent(){
		Address address = new Address("134","333","吉林市");
		Student s = new Student(2, "哈哈", "男", new Date(), address);
		session.save(s);
	}

}
