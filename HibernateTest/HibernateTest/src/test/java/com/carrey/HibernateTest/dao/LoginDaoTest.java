package com.carrey.HibernateTest.dao;

import org.junit.Test;

import com.carrey.HibernateTest.AbstractTest;
import com.carrey.HibernateTest.dojo.Login;
import com.carrey.HibernateTest.dojo.LoginPK;

public class LoginDaoTest extends AbstractTest {
	
	private LoginDao dao = new LoginDao();

	@Test
	public void testInsert(){
		Login login = new Login(new LoginPK("matrix", "guorui"), "111");
		
		dao.insert(login);
		
		
	}
}
