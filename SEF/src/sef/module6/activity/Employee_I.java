package sef.module6.activity;

import sef.module6.sample.Person_I;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I {
	
	//Attributes
	private double salary;
	private String title;
	
	
	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	public Employee_I() {
		super();
		this.salary = salary;
		this.title = title;
		System.out.println("I'm Employee_I constructor");
	}

	// write getter for double salary
	public double getSalary() {
		return salary;
	}

	// write setter for double salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	// write getter for String title
	public String getTitle() {
		return title;
	}
	// write setter for String title
	public void setTitle(String title) {
		this.title = title;
	}
	
}
