package com.carrey.HibernateTest;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.junit.Test;

import com.carrey.HibernateTest.dojo.Person;
import com.carrey.HibernateTest.util.HibernateUtil;

public class EqualsHashCodeTest extends AbstractTest {
	
	@Test
	public void testEquals(){
		Person person = session.get(Person.class,42);
		Person person2 = session.get(Person.class,42);
		
		System.out.println(person == person2);
		
		
		Set<Person> set = new HashSet<Person>();
		set.add(person);
		set.add(person2);
		
		System.out.println(set.size());
		
	}
	
	@Test
	public void testDiffSession(){
		
		Session s1 = HibernateUtil.getSessionFactory().openSession();
		Session s2 = HibernateUtil.getSessionFactory().openSession();
		s1.beginTransaction();
		s2.beginTransaction();
		
		Person person = s1.get(Person.class, 42);
		Person person2 = s2.get(Person.class, 42);
		
		System.out.println(person == person2);
		
		Set<Person> set = new HashSet<Person>();
		set.add(person);
		set.add(person2);
		
		System.out.println(set.size());		
		
		s1.getTransaction().commit();
		s2.getTransaction().commit();
		s1.close();
		s2.close();
		
	}

}
