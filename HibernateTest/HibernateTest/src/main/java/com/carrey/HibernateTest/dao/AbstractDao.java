package com.carrey.HibernateTest.dao;

import java.io.Serializable;

import org.hibernate.Session;

import com.carrey.HibernateTest.util.HibernateUtil;

public abstract class AbstractDao<T, I extends Serializable> {

	protected Class<T> entityClass;
	private Session session = null;

	protected Session getSession() {
		return session == null ?HibernateUtil.getSession():session;
	}

	protected AbstractDao(Class<T> t) {
		entityClass = t;
	}

	public boolean insert(T t) {
		getSession().save(t);
		return true;
	}

	public boolean delete(T t) {
		getSession().delete(t);
		return true;
	}

	public boolean update(T t) {
		getSession().update(t);
		return true;
	}

	public T get(I primaryKey) {
		return getSession().get(entityClass, primaryKey);
	}

}
