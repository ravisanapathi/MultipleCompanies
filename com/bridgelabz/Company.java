package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
	
	ArrayList <EmployeeDetails> arraylist = new ArrayList<>();
	public void addEmployees() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		String name = scanner.next();
		System.out.println("Enter Employee Age : ");
		int age = scanner.nextInt();
		System.out.println("Enter Employee Number : ");
		long phoneNumber = scanner.nextLong();
		System.out.println("Enter Employee city : ");
		String city = scanner.next();
		System.out.println("Enter Employee State : ");
		String state = scanner.next();
		System.out.println("Enter Employee Department : ");
		String department = scanner.next();
		
		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.setName(name);
		empDetails.setAge(age);
		empDetails.setPhoneNumber(phoneNumber);
		empDetails.setCity(city);
		empDetails.setState(state);
		empDetails.setDepartment(department);
		
		arraylist.add(empDetails);
	}

}
