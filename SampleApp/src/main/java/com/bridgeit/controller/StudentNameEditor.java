package com.bridgeit.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	public void setAsText(String studentname){
		
		if(studentname.contains("mr.") || studentname.contains("mrs.")){
			
			setValue(studentname);
		}
		else {
			studentname = "mr."+studentname;
			setValue(studentname);
		}
	}

	
}
