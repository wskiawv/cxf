package com.htrj.webservice.service;

public interface PRSWebServiceI {

	public String wsSave(String entity,String clazz);
	public String wsUpdate(String entity,String clazz);
	public String wsDelete(String entity,String clazz);
	public String wsFind(String hql,String clazz);
}
