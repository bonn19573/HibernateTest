package com.carrey.HibernateTest.dao;

import com.carrey.HibernateTest.pojo.Event;

public class EventDao extends AbstractDao<Event, Integer> {

	protected EventDao() {
		super(Event.class);
	}



}
