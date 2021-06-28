package com.niit.RestDemo.config;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
	//	return null;
		return new Class[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addCorsMappings(CorsRegistry registry) {
        

		registry.addMapping("/**");
		    }

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		//return null;
		return new String[] {"/"};
	}

	
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration)
	{
		registration.setInitParameter("dispatchOptionsRequest","true");
		registration.setAsyncSupported(true);
	}


}
