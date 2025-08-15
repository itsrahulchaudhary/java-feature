package com.rahul.java8.questions;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeApp4 {
	 
	public static void main(String[] args) {
		List<Employee> allEmployeeDetails = EmployeeDatabase.getAllEmployeeDetails();
		
		// 10. How many male and female employees are there in the sales and marketing team?
		/*
		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = allEmployeeDetails.stream()
				.filter(emp -> emp.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countMaleFemaleEmployeesInSalesMarketing);
		*/
		
        //-------------------------------------------------------------------------------

		// 11. What is the average salary of male and female employees?
		/*
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = allEmployeeDetails.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryOfMaleAndFemaleEmployees);
		*/
        //-------------------------------------------------------------------------------
		
		// 12. List down the names of all employees in each department?
		Map<String, List<Employee>> employeeListByDepartment = allEmployeeDetails.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

		for (Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("--------------------------------------");
			System.out.println("Employees In " + entry.getKey() + " : ");
			System.out.println("--------------------------------------");
			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}
	}

}
