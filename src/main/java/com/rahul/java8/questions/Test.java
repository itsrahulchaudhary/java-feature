package com.rahul.java8.questions;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		List<Employee> allEmployeeDetails = EmployeeDatabase.getAllEmployeeDetails();
		// 1. How many male and female employees are there in the organization?
		// 2. Print the name of all departments in the organization?
		// 3. What is the average age of male and female employees?
		// 4. Get the details of highest paid employee in the organization?
		// 5. Get the names of all employees who have joined after 2015?
		// 6. Count the number of employees in each department?
		// 7. What is the average salary of each department?
		// 8. Get the details of youngest male employee in the product development department?
		// 9. Who has the most working experience in the organization?
		// 10. How many male and female employees are there in the sales and marketing team?
		// 11. What is the average salary of male and female employees?
		// 12. List down the names of all employees in each department?
		// 13. Who is the oldest employee in the organization? What is his age and which department he belongs to?

//		Map<String, Long> collect = allEmployeeDetails.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		System.out.println(collect);

		//allEmployeeDetails.stream().map(e ->e.getDepartment()).distinct().forEach(System.out::println);

//		Map<String, Double> collect = allEmployeeDetails.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
//		System.out.println(collect);

//		String name = allEmployeeDetails.stream()
//				.max(Comparator.comparing(Employee::getSalary)).get().getName();
//		System.out.println(name);

//		allEmployeeDetails.stream().filter(e->e.getYearOfJoining()>2015).map(e->e.getName())
//				.forEach(System.out::println);

//		Map<String, Long> collect = allEmployeeDetails.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//		System.out.println(collect);
//
//		Map<String, Double> collect1 = allEmployeeDetails.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(collect1);

//		Optional<Employee> min = allEmployeeDetails.stream()
//				.filter(e -> e.getDepartment().equals("Product Development") && e.getGender().equals("Male")).min(Comparator.comparing(Employee::getSalary));
//		System.out.println(min.get().getName());


//		Optional<Employee> first = allEmployeeDetails.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
	//	System.out.println(first.get().getName());

//		Map<String, Long> salesAndMarketing = allEmployeeDetails.stream().filter(e -> e.getDepartment().equals("Sales And Marketing"))
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		System.out.println(salesAndMarketing);

//		Map<String, Double> collect = allEmployeeDetails.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(collect);

		allEmployeeDetails.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()))
				.forEach((d,e)->{
					System.out.println("Department : "+d);
					System.out.println("Employee Details");
					e.stream().forEach(System.out::println);
				});

		String name = allEmployeeDetails.stream().max(Comparator.comparing(Employee::getAge)).get().getName();
		System.out.println(name);
	}

}
