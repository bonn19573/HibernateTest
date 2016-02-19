package com.carrey.HibernateTest.dao;

import java.io.Serializable;

import org.hibernate.Session;

public abstract class AbstractDao<T, I extends Serializable> {
	
	protected Class<T> entityClass;
	
	
	
	protected AbstractDao(Class<T> t){
		entityClass = t;
	}
	
	
	
	public boolean insert(T t, Session session){
		session.save(t);
		return true;
	}
	
	public boolean delete(T t, Session session){
		session.delete(t);
		return true;
	}
	
	public boolean update(T t, Session session){
		session.update(t);
		return true;
	}
	
	public T get(I primaryKey, Session session){
		return session.get(entityClass,primaryKey);
	}

}
