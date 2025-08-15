package com.rahul.java8.questions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeApp3 {
	public static void main(String[] args) {
		List<Employee> allEmployeeDetails = EmployeeDatabase.getAllEmployeeDetails();

		// 7. What is the average salary of each department?
		/*
		Map<String, Double> avgSalaryOfDepartments = allEmployeeDetails.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();
        
		for (Entry<String, Double> entry : entrySet) 
		{
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		*/
		
        //-------------------------------------------------------------------------------

		// 8.  Get the details of youngest male employee in the product development department?
		/*
		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = allEmployeeDetails.stream()
				.filter(emp -> emp.getGender().equals("Male") && emp.getDepartment().equals("Product Development"))
				.min(Comparator.comparing(Employee::getSalary));

		Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

		System.out.println("Details Of Youngest Male Employee In Product Development");
		System.out.println("----------------------------------------------");
		System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());
		System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());
		System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());
		System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());
		System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());
        */
        //-------------------------------------------------------------------------------

		// 9. Who has the most working experience in the organization?
		Optional<Employee> seniorMostEmployeeWrapper = allEmployeeDetails.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
		Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
        
		System.out.println("Senior Most Employee Details :");
		System.out.println("----------------------------");
		System.out.println("ID : "+seniorMostEmployee.getId());
		System.out.println("Name : "+seniorMostEmployee.getName());
		System.out.println("Age : "+seniorMostEmployee.getAge());
		System.out.println("Gender : "+seniorMostEmployee.getGender());
		System.out.println("Age : "+seniorMostEmployee.getDepartment());
		System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());
		System.out.println("Salary : "+seniorMostEmployee.getSalary());

	}

}
