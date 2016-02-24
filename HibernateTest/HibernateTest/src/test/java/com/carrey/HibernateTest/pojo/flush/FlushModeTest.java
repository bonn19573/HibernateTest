package com.carrey.HibernateTest.pojo.flush;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.carrey.HibernateTest.AbstractTest;
import com.carrey.HibernateTest.pojo.Gender;
import com.carrey.HibernateTest.pojo.Name;
import com.carrey.HibernateTest.pojo.Person;

public class FlushModeTest extends AbstractTest{
	
	@Test
	public void testFlushBeforeQuery(){
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
		
		System.out.println(session.getFlushMode());
		
		session.save(person);
		session.createQuery("from Person").list();
	}

}
