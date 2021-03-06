package com.carrey.HibernateTest.dao;

import org.junit.Test;

import com.carrey.HibernateTest.AbstractTest;
import com.carrey.HibernateTest.pojo.Login;
import com.carrey.HibernateTest.pojo.LoginPK;

public class LoginDaoTest extends AbstractTest {
	
	private LoginDao dao = new LoginDao();

	@Test
	public void testInsert(){
		Login login = new Login(new LoginPK("matrix", "guorui"), "111");
		
		dao.insert(login);
		
		
	}
	
	@Test
	public void testGet(){
		Login login = dao.get(new LoginPK("matrix", "guorui"));
		System.out.println(login);
	}
}
