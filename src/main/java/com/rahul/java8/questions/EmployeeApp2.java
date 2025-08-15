package com.rahul.java8.questions;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeApp2 {
	public static void main(String[] args) {
		List<Employee> allEmployeeDetails = EmployeeDatabase.getAllEmployeeDetails();

		// 4. Get the details of highest paid employee in the organization?
		/*
		Optional<Employee> highestPaidEmployeeWrapper = allEmployeeDetails.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
        
		System.out.println("Details Of Highest Paid Employee : ");  
		System.out.println("==================================");
		System.out.println("ID : "+highestPaidEmployee.getId());
		System.out.println("Name : "+highestPaidEmployee.getName());
		System.out.println("Age : "+highestPaidEmployee.getAge());
		System.out.println("Gender : "+highestPaidEmployee.getGender());
		System.out.println("Department : "+highestPaidEmployee.getDepartment());
		System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());
		System.out.println("Salary : "+highestPaidEmployee.getSalary());
		*/
		
        //-------------------------------------------------------------------------------

		// 5. Get the names of all employees who have joined after 2015?
		/*
		allEmployeeDetails.stream().filter(emp -> emp.getYearOfJoining() > 2015)
		                .map(Employee::getName).forEach(System.out::println);	
		*/
		
        //-------------------------------------------------------------------------------

		// 6. Count the number of employees in each department?
		Map<String, Long> employeeCountByDepartment = allEmployeeDetails.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		// option-1
		/*
		employeeCountByDepartment.forEach((i, j) -> {
			System.out.println(i + " :: " + j);
		});
		*/
		// option-2
		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
