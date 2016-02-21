package com.carrey.HibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.carrey.HibernateTest.dojo.Person;
import com.carrey.HibernateTest.util.HibernateUtil;

public class OptimisticLockingTest {

	
	@Test
	public void optimisticLockingTest(){
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		Person person = session.get(Person.class, 44);
		
		person.setName("Guo Rui7");
		session.save(person);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		session.getTransaction().commit();
		session.close();
		
		HibernateUtil.closeSessionFactory();
	}
	
	@Test
	public void optimisticLockingTest2(){
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session2 = factory.openSession();
		session2.beginTransaction();
		Person person2 = session2.get(Person.class, 44);
		
		person2.setName("Guo Rui8");
		session2.save(person2);

		session2.getTransaction().commit();
		session2.close();
		
		HibernateUtil.closeSessionFactory();		
	}
}

