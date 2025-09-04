package com.example.SpringBootMDCDemo.model;

// import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
// @AllArgsConstructor
@ToString
public class Employee {

	private int id;
	
	private String name;
	
	private int salary;

	public Employee() {
		// No-args constructor for Jackson
	}

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}
