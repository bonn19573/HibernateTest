package com.carrey.HibernateTest;

import org.junit.Test;

import com.carrey.HibernateTest.pojo.assosiation.People;
import com.carrey.HibernateTest.pojo.assosiation.Phone;

public class UnidirectionOneToManyTest extends AbstractTest {
	
	@Test
	public void testSave(){
		
		People people = new People();
		Phone phone = new Phone();
		Phone phone2 = new Phone();
		people.getPhones().add(phone);
		people.getPhones().add(phone2);
		
		session.save(people);
		session.flush();
		
		people.getPhones().remove(phone);
		
	}

}
