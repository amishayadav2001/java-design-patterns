package com.aurionpro.test;

import com.aurionpro.model.Developer;
import com.aurionpro.model.EmployeeDirectory;
import com.aurionpro.model.IEmployee;
import com.aurionpro.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		IEmployee dev1 = new Developer("Amisha", "Junior Developer");
		IEmployee dev2 = new Developer("Suraj", "Senior Developer");

		EmployeeDirectory devDirectory = new EmployeeDirectory("Technical Department", "Developer");
		devDirectory.addEmployee(dev1);
		devDirectory.addEmployee(dev2);

		IEmployee man1 = new Manager("Ankit", "DotNet Manager");
		IEmployee man2 = new Manager("Ganesh", "AWS Manager");

		EmployeeDirectory manDirectory = new EmployeeDirectory("Technical Department", "Developer");
		manDirectory.addEmployee(man1);
		manDirectory.addEmployee(man2);

		EmployeeDirectory companyDirectory = new EmployeeDirectory("Aurionpro Company", "CEO");
		companyDirectory.addEmployee(devDirectory);
		companyDirectory.addEmployee(manDirectory);

		companyDirectory.showEmployeeDetails();
	}
}
