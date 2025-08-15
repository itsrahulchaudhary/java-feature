package com.rahul.java8.questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeApp1 {

	public static void main(String[] args) {
		List<Employee> allEmployeeDetails = EmployeeDatabase.getAllEmployeeDetails();

		// 1. How many male and female employees are there in the organization?
		/*
		   Map<String, Long> noOfMaleAndFemaleEmployees = allEmployeeDetails.stream()
		               .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		   System.out.println("No Of Male And Female Employees : " + noOfMaleAndFemaleEmployees);
         */
		
        //-------------------------------------------------------------------------------
		/*
		// 2. Print the name of all departments in the organization?
		
		   allEmployeeDetails.stream()
		                     .map(Employee::getDepartment).distinct()
		                     .forEach(System.out::println);
		 */
		
		//-------------------------------------------------------------------------------
		
		// 3. What is the average age of male and female employees?
		
		  Map<String, Double> avgAgeOfMaleAndFemaleEmployees = allEmployeeDetails.stream()
				  .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		  System.out.println("Avg Age Of Male And Female Employees : "+avgAgeOfMaleAndFemaleEmployees);
        
	}

}
