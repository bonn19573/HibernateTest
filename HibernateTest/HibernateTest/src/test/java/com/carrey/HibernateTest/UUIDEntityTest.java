package com.carrey.HibernateTest;

import java.util.List;

import org.junit.Test;

import com.carrey.HibernateTest.pojo.UUIDEntity;

public class UUIDEntityTest extends AbstractTest{

	@Test
	public void testSave(){
		UUIDEntity uuidEntity = new UUIDEntity();
		session.save(uuidEntity);
	}
	
	@Test
	public void testList(){
		List<UUIDEntity> list = session.createQuery("from UUIDEntity").list();
		
		for (UUIDEntity uuidEntity : list) {
			System.out.println(uuidEntity);
		}
	}
}
