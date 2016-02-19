package com.carrey.HibernateTest;

public class MyEmployee {
	
	public MyEmployee(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	private String firstName;
	private String lastName;
	private int salary;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "MyEmployee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
	

}
