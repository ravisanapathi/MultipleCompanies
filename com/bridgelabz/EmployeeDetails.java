package com.bridgelabz;

public class EmployeeDetails {
	String name;
	int age;
	long phoneNumber;
	String city;
	String state;
	String department;
	
	public EmployeeDetails(String name, int age, long phoneNumber, String city, String state) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
	}
	enum department {
		Admin,
		IT,
		Devops,
		SDE,
		Testing;
	}

}
