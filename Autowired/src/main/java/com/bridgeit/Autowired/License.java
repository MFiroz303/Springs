package com.bridgeit.Autowired;

import org.springframework.stereotype.Component;

@Component
public class License 
{
  private String number="ABGPF8424L";

@Override
public String toString() {
	return "License [number=" + number + "]";
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}
  
}
