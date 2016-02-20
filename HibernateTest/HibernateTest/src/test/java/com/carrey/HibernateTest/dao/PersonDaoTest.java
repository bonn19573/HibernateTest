package com.carrey.HibernateTest.dao;

import org.junit.Test;

import com.carrey.HibernateTest.dojo.Gender;
import com.carrey.HibernateTest.dojo.Person;

public class PersonDaoTest extends AbstractTest {
	
	private PersonDao dao = new PersonDao();

	@Test
	public void testInsert() {
		Person person = new Person("GR",Gender.MALE);
		Person person2 = new Person("czj",Gender.FEMALE);
		dao.insert(person);
		dao.insert(person2);
	}
	
	@Test
	public void testGet(){
		Person person = dao.get(24);
		System.out.println(person);
	}

}
