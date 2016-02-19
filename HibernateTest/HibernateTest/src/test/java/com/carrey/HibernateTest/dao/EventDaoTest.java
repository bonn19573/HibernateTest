package com.carrey.HibernateTest.dao;

import java.util.Date;

import org.hibernate.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.carrey.HibernateTest.dojo.Event;
import com.carrey.HibernateTest.util.HibernateUtil;

public class EventDaoTest {
	
	private static Session session;
	private static EventDao dao;
	
	@BeforeClass
	public static void beforeClass(){
		session = HibernateUtil.openSession();
		dao = new EventDao();
	}
	
	@AfterClass
	public static void afterClass(){
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}
	
	@Before
	public void before(){
		session.beginTransaction();
	}
	
	@After
	public void after(){
		session.getTransaction().commit();
	}

	@Test
	public void testInsert() {
		Event e = new Event(new Date(),"Type1","first event");
		dao.insert(e, session);
		
		Event e2 = dao.get(e.getEvent_id(), session);
		
		System.out.println(e2);
		
		Assert.assertEquals(e, e2);
	}

	@Test
	public void testDelete() {
		Event e = new Event(new Date(),"Type1","first event");
		dao.insert(e, session);
		
		dao.delete(e, session);
		
		Event e2 = dao.get(e.getEvent_id(), session);
		
		Assert.assertEquals(null, e2);
	}

	@Test
	public void testUpdate() {
		Event e = new Event(new Date(),"Type1","first event");
		dao.insert(e, session);
		
		e.setEvent_type("Type 2");
		
		dao.update(e, session);
		
		Event e2 = dao.get(e.getEvent_id(), session);
		
		Assert.assertEquals("Type 2", e2.getEvent_type());
		
	}

	@Test
	public void testGet() {
		
		Event e = new Event(new Date(),"Type1","first event");
		dao.insert(e, session);
		
		Event e2 = dao.get(e.getEvent_id(), session);	
		
		Assert.assertEquals(e, e2);
	}

}
