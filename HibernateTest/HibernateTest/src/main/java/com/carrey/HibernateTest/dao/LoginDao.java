package com.carrey.HibernateTest.dao;

import com.carrey.HibernateTest.pojo.Login;
import com.carrey.HibernateTest.pojo.LoginPK;

public class LoginDao extends AbstractDao<Login, LoginPK> {

	protected LoginDao() {
		super(Login.class);
	}

}
