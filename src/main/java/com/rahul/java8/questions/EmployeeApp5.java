package com.rahul.java8.questions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeApp5 {
	public static void main(String[] args) {
		List<Employee> allEmployeeDetails = EmployeeDatabase.getAllEmployeeDetails();

		// 13. What is the average salary and total salary of the whole organization?
		/*
		DoubleSummaryStatistics employeeSalaryStatistics = allEmployeeDetails.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage());
		System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());
		*/
        //-------------------------------------------------------------------------------

		// 14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		/*
		Map<Boolean, List<Employee>> partitionEmployeesByAge = allEmployeeDetails.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
		Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();

		for (Entry<Boolean, List<Employee>> entry : entrySet) {
			System.out.println("----------------------------");
			if (entry.getKey()) {
				System.out.println("Employees older than 25 years :");
			} else {
				System.out.println("Employees younger than or equal to 25 years :");
			}

			System.out.println("----------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}
		*/
        //-------------------------------------------------------------------------------

		// 15. Who is the oldest employee in the organization? What is his age and which department he belongs to?
		Optional<Employee> oldestEmployeeWrapper = allEmployeeDetails.stream().max(Comparator.comparing(Employee::getAge));
		Employee oldestEmployee = oldestEmployeeWrapper.get();
        
		System.out.println("Name : "+oldestEmployee.getName());         
		System.out.println("Age : "+oldestEmployee.getAge());      
		System.out.println("Department : "+oldestEmployee.getDepartment());
	}

}
