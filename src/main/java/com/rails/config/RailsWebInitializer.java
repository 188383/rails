package com.rails.config;

import org.springframework.web.servlet.support.
	AbstractAnnotationConfigDispatcherServletInitializer;
	

public class RailsWebInitializer extends
	AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected String[] getServletMappings(){
		return new String[]{"/"};	
	}
	@Override
	protected Class<?>[] getRootConfigClasses(){
		return new Class<?>[]{RootConfig.class};	
	}
	@Override
	protected Class<?>[] getServletConfigClasses(){
		return new Class<?>[] {WebConfig.class};	
	}
}
