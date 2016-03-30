package com.htrj.webservice.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.htrj.webservice.service.PRSWebService;
import com.htrj.webservice.service.PRSWebServiceI;

public class WebServiceServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaxWsServerFactoryBean bean=new JaxWsServerFactoryBean();
		//JettyHTTPServerEngineFactory serverEngineFactory = new JettyHTTPServerEngineFactory();
		bean.setAddress("https://localhost:8090/cxf/PRSWs.wsdl");
		bean.setServiceBean(PRSWebService.class);
		bean.setServiceClass(PRSWebServiceI.class);
		bean.create();
	}
	

}
