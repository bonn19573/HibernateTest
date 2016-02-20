package com.carrey.HibernateTest.dao;

import org.junit.Test;

import com.carrey.HibernateTest.dojo.Gender;
import com.carrey.HibernateTest.dojo.Person;

public class PersonDaoTest extends AbstractTest {
	
	private PersonDao dao = new PersonDao();

	@Test
	public void testInsert() {
		Person person = new Person("GR",Gender.MAN);
		Person person2 = new Person("czj",Gender.WOMEN);
		Person person3 = new Person("xiaoyao",Gender.NOT_SURE);
		dao.insert(person);
		dao.insert(person2);
		dao.insert(person3);
	}

}
