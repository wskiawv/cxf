package com.htrj.service;

import java.util.List;

public interface BaseServiceI {

	public Object save(Object o);
	public void delete(Object o);
	public void update(Object o);
	public List find(String hql);
}
