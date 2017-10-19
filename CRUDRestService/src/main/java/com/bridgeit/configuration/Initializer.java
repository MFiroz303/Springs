package com.bridgeit.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[] { Configuration.class };
	    }
	   
	    protected Class<?>[] getServletConfigClasses() {
	        return null;
	    }
	   
	 
	    protected String[] getServletMappings() {
	        return new String[] { "/" };
	    }
}
