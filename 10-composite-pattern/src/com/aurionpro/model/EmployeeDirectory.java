package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee {
    private String name;
    private String position;
    private List<IEmployee> employees = new ArrayList<>();

    public EmployeeDirectory(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }

    public void removeEmployee(IEmployee employee) {
        employees.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Employees:");
        for (IEmployee employee : employees) {
            employee.showEmployeeDetails();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }
}

