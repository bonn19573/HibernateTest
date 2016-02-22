package com.carrey.HibernateTest;

import org.junit.Test;

import com.carrey.HibernateTest.pojo.assosiation.People;
import com.carrey.HibernateTest.pojo.assosiation.Phone;

public class ManyToOneTest extends AbstractTest{
	
	@Test
	public void testSave(){
		People people = new People();
		Phone phone = new Phone();
		Phone phone2 = new Phone();
		
//		phone.setPeople(people);
//		phone2.setPeople(people);
		
		session.save(people);
		session.save(phone);
		session.save(phone2);
	}
	
	@Test
	public void testLifeCycle(){
		People people = new People();
		session.save(people);
		
		Phone phone = new Phone();
//		phone.setPeople(people);
		
		session.save(phone);
		
		session.flush();
		
//		phone.setPeople(null);
	}

}
