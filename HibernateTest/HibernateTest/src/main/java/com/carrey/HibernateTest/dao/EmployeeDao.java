package com.carrey.HibernateTest.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.carrey.HibernateTest.dojo.Certificate;
import com.carrey.HibernateTest.dojo.Employee;

public class EmployeeDao extends AbstractDao<Employee, Long> {

	protected EmployeeDao() {
		super(Employee.class);
	}
	
	public void saveEmployee(Employee employee){
		Session session = getSession();
		
		session.save(employee);
		
		for(Certificate certificate : employee.getCertificates()){
			certificate.setEmployee(employee);
			session.save(certificate);
		}
				
	}

}
