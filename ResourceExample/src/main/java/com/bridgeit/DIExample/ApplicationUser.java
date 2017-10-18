package com.bridgeit.DIExample;

import org.springframework.stereotype.Component;

@Component("applicationUser")
public class ApplicationUser {
	
	private String name="Firoz";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ApplicationUser [name=" + name + "]";
	}
}
