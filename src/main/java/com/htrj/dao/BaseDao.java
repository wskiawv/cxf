package com.htrj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseDao implements BaseDaoI {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	@Override
	public Object save(Object o) {
		// TODO Auto-generated method stub
		return this.getSession().save(o);
	}

	@Override
	public void delete(Object o) {
		// TODO Auto-generated method stub
		this.getSession().delete(o);
	}

	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		this.getSession().update(o);
	}

	@Override
	public List find(String hql) {
		// TODO Auto-generated method stub
		return this.getSession().createQuery(hql).list();		
	}

}
