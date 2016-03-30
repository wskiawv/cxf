package com.htrj.webservice.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.htrj.webservice.service.PRSWebServiceI;

public class WebServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(PRSWebServiceI.class);
		factory.setAddress("http://localhost:8090/cxf/PRSWs?wsdl");
		PRSWebServiceI prs=(PRSWebServiceI) factory.create();
		String s=prs.wsFind("from User", "com.htrj.model.User");
	}

}
