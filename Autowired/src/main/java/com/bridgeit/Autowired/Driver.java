package com.bridgeit.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("driver")
public class Driver {
	
	//autowired on filed
	@Autowired (required=false)
	private License license;


	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

   /* autowired with constructor
    ----------------------------- 
	@Autowired
	public Driver(License license) {
		this.license = license;
	}  */


	
	public String toString() {
		return "Driver [license=" + license + "]";
	}
}
