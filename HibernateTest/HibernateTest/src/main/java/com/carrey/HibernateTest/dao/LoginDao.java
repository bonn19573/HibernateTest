package com.carrey.HibernateTest.dao;

import com.carrey.HibernateTest.dojo.Login;
import com.carrey.HibernateTest.dojo.LoginPK;

public class LoginDao extends AbstractDao<Login, LoginPK> {

	protected LoginDao() {
		super(Login.class);
	}

}
