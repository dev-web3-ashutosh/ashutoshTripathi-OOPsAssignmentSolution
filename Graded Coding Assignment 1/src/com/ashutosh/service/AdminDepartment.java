package com.ashutosh.service;

//import superclass
import com.ashutosh.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment { //inherits class SuperDepartment
	
	//class method to get department name
	public String departmentName() {
		
		return "Admin Department";
		
	}
	
	//class method to get daily work assignment
	public String getTodaysWork() {
		
		return "Complete your documents submission";
		
	}
	
	//class method to get assignment deadline
	public String getWorkDeadline() {
		
		return "Complete by EOD";
		
	}

}
