package com.aurionpro.test;

import com.aurionpro.model.Consultant;
import com.aurionpro.model.Employee;
import com.aurionpro.model.IRole;
import com.aurionpro.model.SeniorConsultant;

public class EmployeeTest {

	public static void main(String[] args) {
		IRole initialRole = new Consultant(); 
		Employee employee = new Employee(1, "Amisha Yadav", initialRole);

		System.out.println("Employee Description: " + employee.getDescription());
		System.out.println("Employee Responsibility: " + employee.getResponsibility());

		IRole newRole = new SeniorConsultant(); 
		employee.promote(newRole);

		System.out.println("Employee Description (After Promotion): " + employee.getDescription());
		System.out.println("Employee Responsibility (After Promotion): " + employee.getResponsibility());

	}

}
