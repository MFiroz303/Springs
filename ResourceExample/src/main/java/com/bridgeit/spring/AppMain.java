package com.bridgeit.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.bridgeit.DIExample.Application;
import com.bridgeit.config.AppConfig;

public class AppMain {
	public static void main(String[] args){
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
		
		//ByName autowiring
		Application application = (Application) context.getBean("application");
		System.out.println("Application details :" +application);
		
	}

}
