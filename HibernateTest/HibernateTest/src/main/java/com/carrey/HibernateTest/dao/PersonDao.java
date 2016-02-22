package com.carrey.HibernateTest.dao;

import com.carrey.HibernateTest.pojo.Person;

public class PersonDao extends AbstractDao<Person, Integer> {

	protected PersonDao() {
		super(Person.class);
	}

}
