package com.carrey.HibernateTest.dao;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.carrey.HibernateTest.AbstractTest;
import com.carrey.HibernateTest.pojo.Gender;
import com.carrey.HibernateTest.pojo.Name;
import com.carrey.HibernateTest.pojo.Person;
import com.carrey.HibernateTest.pojo.PersonDetail;

public class PersonDetailDaoTest extends AbstractTest {

	private PersonDetailDao dao = new PersonDetailDao();
	private PersonDao personDao = new PersonDao();
	
	@Test
	public void testInsert(){
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
		
		PersonDetail personDetail = new PersonDetail("xiao rui",person);
		
		personDao.insert(person);
		dao.insert(personDetail);
		
		
	}
}
