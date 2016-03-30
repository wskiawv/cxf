package com.htrj.dao;

import java.util.List;

public interface BaseDaoI {
	public Object save(Object o);
	public void delete(Object o);
	public void update(Object o);
	public List find(String hql);	
}
