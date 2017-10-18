package com.bridgeit.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.bridgeit.Autowired.Driver;
import com.bridgeit.config.AppConfig;

public class AppMain {
	  public static void main( String[] args )
	    {
	   AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	   Driver driver = (Driver) context.getBean("driver");
	   System.out.println("Driver detaiils  is "+driver);
	    }

}
