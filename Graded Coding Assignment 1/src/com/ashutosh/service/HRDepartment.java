package com.ashutosh.service;

////import superclass
import com.ashutosh.model.SuperDepartment;

public class HRDepartment extends SuperDepartment { //inherits class SuperDepartment
	
	//class method to get department name
	public String departmentName() {
		
		return "HR Department";
		
	}
	
	//class method to get daily work assignment
	public String getTodaysWork() {
		
		return "Fill today's worksheet and mark your attendance";
		
	}
	
	//class method to get assignment deadline
	public String getWorkDeadline() {
		
		return "Complete by EOD";
		
	}
	
	//class method to get activity
	public String doActivity() {
		
		return "team Lunch";
		
	}

}
