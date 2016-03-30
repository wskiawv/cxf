package com.htrj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htrj.dao.BaseDaoI;
@Service
public class BaseService implements BaseServiceI {

	@Autowired
	private BaseDaoI baseDao;
	@Override
	public Object save(Object o) {
		// TODO Auto-generated method stub
		return this.baseDao.save(o);
	}

	@Override
	public void delete(Object o) {
		// TODO Auto-generated method stub
		this.baseDao.delete(o);
	}

	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		this.baseDao.update(o);
	}

	@Override
	public List find(String hql) {
		// TODO Auto-generated method stub
		return this.baseDao.find(hql);
	}

}
