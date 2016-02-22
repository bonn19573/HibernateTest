package com.carrey.HibernateTest;

import java.util.List;

import org.hibernate.Query;
import org.junit.Test;

import com.carrey.HibernateTest.pojo.assosiation.People;
import com.carrey.HibernateTest.pojo.assosiation.Phone;

public class BidirectionOneToManyTest extends AbstractTest {
	
	@Test
	public void testSave(){
		People people = new People();
		Phone phone = new Phone();
		Phone phone2 = new Phone();
		people.addPhone(phone);
		people.addPhone(phone2);
		
		session.save(people);
		session.flush();
		
		people.removePhone(phone);
		
	}
	
	@Test
	public void testList(){
		Query createQuery = session.createQuery("from People");
		List<People> list = createQuery.list();
		for (People people : list) {
			System.out.println(people);
		}
	}

}
