package com.mohamedkaif.assg.employee;

import com.mohamedkaif.assg.utilities.EmployeeUtilitie;

public class AssignmentMain {

	public static void main(String[] args) {
		
		
		Manager manager = new Manager();
		
		manager.setName("alice");
		manager.setEmployeeId("132321");
		manager.setSalary(20000);
		manager.setDepartment("project managment");
		
		
		EmployeeUtilitie.displayDetails(manager);
		
		
		

	}

}
