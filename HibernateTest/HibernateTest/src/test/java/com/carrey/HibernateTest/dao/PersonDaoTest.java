package com.carrey.HibernateTest.dao;

import java.util.Date;

import org.junit.Test;

import com.carrey.HibernateTest.dojo.Gender;
import com.carrey.HibernateTest.dojo.Person;

public class PersonDaoTest extends AbstractTest {
	
	private PersonDao dao = new PersonDao();

	@Test
	public void testInsert() {
		Date today = new Date();
		Person person = new Person("GR",Gender.MALE);
		person.setCreateDate(today);
		person.setCreateTime(today);
		person.setCreateDateTime(today);
		Person person2 = new Person("czj",Gender.FEMALE);
		person2.setCreateDate(today);
		person2.setCreateTime(today);
		person2.setCreateDateTime(today);
		dao.insert(person);
		dao.insert(person2);
	}
	
	@Test
	public void testGet(){
		Person person = dao.get(24);
		System.out.println(person);
	}

}
