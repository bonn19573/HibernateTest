package com.carrey.HibernateTest.dao;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.carrey.HibernateTest.AbstractTest;
import com.carrey.HibernateTest.dojo.Gender;
import com.carrey.HibernateTest.dojo.Name;
import com.carrey.HibernateTest.dojo.Person;

public class PersonDaoTest extends AbstractTest {
	
	private PersonDao dao = new PersonDao();

	@Test
	public void testInsert() {
		Date today = new Date();
		Calendar c = Calendar.getInstance();
		c.set(1983, 4, 2);
		Date birth = c.getTime();
		Person person = new Person("guorui",Gender.MALE);
		person.setCreateDate(today);
		person.setCreateTime(today);
		person.setCreateDateTime(today);
		person.setBornDate(birth);
		person.setFullName(new Name("guo","rui"));
		Person person2 = new Person("zhijia",Gender.FEMALE);
		person2.setCreateDate(today);
		person2.setCreateTime(today);
		person2.setCreateDateTime(today);
		person2.setBornDate(birth);
		person2.setFullName(new Name("chen","zhi"));
		dao.insert(person);
		dao.insert(person2);
	}
	
	@Test
	public void testGet(){
		Person person = dao.get(42);
		System.out.println(person);
	}
	
	@Test
	public void testUpdate(){
		Person person = dao.get(36);
		person.setName("CCC");
		dao.update(person);
		
		System.out.println(person);
	}

}
