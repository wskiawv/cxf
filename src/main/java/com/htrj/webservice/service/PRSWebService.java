package com.htrj.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.htrj.service.BaseServiceI;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class PRSWebService implements PRSWebServiceI {
	@Autowired
	private BaseServiceI baseService;
	@Override
	public String wsSave(String entity, String clazz) {
		try{
			JSONObject js=JSONObject.fromObject(entity);
			Object o=JSONObject.toBean(js, Class.forName(clazz));
			Long id=(Long)baseService.save(o);
			return id+"";
		}catch(Exception e){
			
		}finally{
			
		}
		
		return null;
	}

	@Override
	public String wsUpdate(String entity, String clazz) {
		// TODO Auto-generated method stub
		try{
			JSONObject js=JSONObject.fromObject(entity);
			Object o=JSONObject.toBean(js, Class.forName(clazz));
			baseService.update(o);
			return "success";
		}catch(Exception e){
			
		}finally{
			
		}
		return "success";
	}

	@Override
	public String wsDelete(String entity, String clazz) {
		// TODO Auto-generated method stub
		try{
			JSONObject js=JSONObject.fromObject(entity);
			Object o=JSONObject.toBean(js, Class.forName(clazz));
			baseService.delete(o);
			return "success";
		}catch(Exception e){
			
		}finally{
			
		}
		return "success";
	}

	@Override
	public String wsFind(String hql, String clazz) {
		// TODO Auto-generated method stub
		List list=baseService.find(hql);
		JSONArray o =JSONArray.fromObject(list);
		return o.toString();
	}

}
