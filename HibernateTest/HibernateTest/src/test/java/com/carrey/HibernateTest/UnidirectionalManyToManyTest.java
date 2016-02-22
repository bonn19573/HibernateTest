package com.carrey.HibernateTest;

import java.util.List;

import org.junit.Test;

import com.carrey.HibernateTest.pojo.assosiation.House;
import com.carrey.HibernateTest.pojo.assosiation.People;

public class UnidirectionalManyToManyTest extends AbstractTest {
	
	@Test
	public void testSave(){
		House house = new House("malan");
		People people = new People();
		People people2 = new People();
		
		house.addPeople(people);
		house.addPeople(people2);
		
		session.save(people);
		session.save(people2);
		session.save(house);
	}
	
	@Test
	public void testQuery(){
		List<House> houses = session.createQuery("from House").list();
		
		houses.stream().forEach(item->{System.out.println(item);});
	}

}
