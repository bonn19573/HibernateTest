package com.carrey.HibernateTest.dao;

import com.carrey.HibernateTest.dojo.Person;

public class PersonDao extends AbstractDao<Person, Integer> {

	protected PersonDao() {
		super(Person.class);
	}

}
