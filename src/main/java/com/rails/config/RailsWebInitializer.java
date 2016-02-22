package com.rails.config;

import org.springframework.web.servlet.support.
	AbstractAnnotationConfigDispatcherServletInitializer;
	
/*
    Initialization of the application. This is the class that is 
    instantiated in place of using an xml file setup. 
    Chapter 7 shows how use an xml based set up.
*/
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
