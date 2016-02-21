package com.carrey.HibernateTest.dao;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.carrey.HibernateTest.dojo.Certificate;
import com.carrey.HibernateTest.dojo.Employee;

public class EmployeeDaoTest extends AbstractTest {

	private EmployeeDao dao = new EmployeeDao();
	@Test
	public void testInsert() {
//		Employee employee= new Employee("Guo", "Rui", 30);
//		Certificate certificate = new Certificate("java");
//		
//		Set<Certificate> set = new HashSet<Certificate>();
//		set.add(certificate);
//		employee.setCertificates(set);
//		
//		dao.insert(employee);
//		
//		System.out.println(employee);
	}
	
	@Test
	public void testSaveEmployee(){
		Employee employee= new Employee("Guo", "Rui", 30);
		Certificate certificate = new Certificate("java");
		
		Set<Certificate> set = new HashSet<Certificate>();
		set.add(certificate);
		employee.setCertificates(set);
		
		dao.saveEmployee(employee);
		
		System.out.println(employee);
	}

	@Test
	public void testDelete() {
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testGet() {
	}

}
