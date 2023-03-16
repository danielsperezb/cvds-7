package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String role;
	private Double salary;
	
	
	public Employee(String firstName, String lastName, String role, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.salary = salary;
	}


	public Long getEmployeeId() {
		// TODO Auto-generated method stub
		return employeeId;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
}
