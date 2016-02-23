package com.carrey.HibernateTest.pojo.naturalid;

import org.junit.Test;

import com.carrey.HibernateTest.AbstractTest;

public class NaturalIdTest extends AbstractTest {
	
	@Test
	public void testSave(){
		Company company = new Company("aaa");
		session.save(company);
		
	}
	
	@Test
	public void testEmbeded(){
		PostalCarrier postalCarrier = new PostalCarrier("aaa","bbb");
		session.save(postalCarrier);
	}
	
	@Test
	public void testQueryByNaturalId(){
		Company company = session.byNaturalId(Company.class).using("taxIdentifier", "aaa").load();
		System.out.println(company);
		
		PostalCarrier postalCarrier = session.byNaturalId(PostalCarrier.class).using("code1", "aaa").using("code2", "bbb").load();
		System.out.println(postalCarrier);
	}
	
	@Test
	public void testQueryBySimpleNaturalId(){
		Company company = session.bySimpleNaturalId(Company.class).getReference("bbb");
		System.out.println(company);
	}
	
	@Test
	public void testUpdateNaturalId(){
		Company company = session.bySimpleNaturalId(Company.class).load("bbb");
		company.setTaxIdentifier("aaa");
		
		Company company2 = session.bySimpleNaturalId(Company.class).setSynchronizationEnabled(false).load("aaa");
		
		System.out.println(company2);
		
		Company company3 = session.bySimpleNaturalId(Company.class).setSynchronizationEnabled(true).load("aaa");
		System.out.println(company3);
	}

}
