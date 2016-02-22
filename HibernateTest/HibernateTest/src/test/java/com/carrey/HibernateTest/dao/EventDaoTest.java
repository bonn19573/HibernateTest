package com.carrey.HibernateTest.dao;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.carrey.HibernateTest.AbstractTest;
import com.carrey.HibernateTest.pojo.Event;

public class EventDaoTest extends AbstractTest {
	
	private EventDao dao = new EventDao();

	@Test
	public void testInsert() {
		
		System.out.println("start");
		Event e = new Event(new Date(), "Type1", "first event");
		dao.insert(e);

		System.out.println(e);
		Event e2 = dao.get(e.getEvent_id());

		System.out.println(e2);

		Assert.assertEquals(e, e2);
	}

	@Test
	public void testDelete() {
		Event e = new Event(new Date(), "Type1", "first event");
		dao.insert(e);

		dao.delete(e);

		Event e2 = dao.get(e.getEvent_id());

		Assert.assertEquals(null, e2);
	}

	@Test
	public void testUpdate() {
		Event e = new Event(new Date(), "Type1", "first event");
		dao.insert(e);

		e.setEvent_type("Type 2");

		dao.update(e);

		Event e2 = dao.get(e.getEvent_id());

		Assert.assertEquals("Type 2", e2.getEvent_type());

	}

	@Test
	public void testGet() {

		Event e = new Event(new Date(), "Type1", "first event");
		dao.insert(e);

		System.out.println(e);
		Event e2 = dao.get(e.getEvent_id());

		Assert.assertEquals(e, e2);
	}

}
