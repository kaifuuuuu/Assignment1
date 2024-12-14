package com.mohamedkaif.assg.utilities;

import com.mohamedkaif.assg.employee.Employee;
import com.mohamedkaif.assg.employee.Devoleper;
import com.mohamedkaif.assg.employee.Manager;

public class EmployeeUtilitie {
	
	public static void displayDetails(Employee employee){
		 
		System.out.println("name:" + employee.getName());
		System.out.println("employes ID:" + employee.getEmployeeId());
		System.out.println("salary:" + employee.getSalary()); 
		
		if (employee instanceof Manager) {
			System.out.println("department:" + ((Manager) employee).getDepartment());
		}
		
	}

}







