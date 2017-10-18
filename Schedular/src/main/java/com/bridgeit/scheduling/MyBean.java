package com.bridgeit.scheduling;

import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean {
	public void printMessage() {
		System.out.println("i am calling by scheduler");

	}

}
