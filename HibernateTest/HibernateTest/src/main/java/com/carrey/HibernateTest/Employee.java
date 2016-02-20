package com.carrey.HibernateTest;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id @GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private int salary;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="employee")
	private Set<Certificate> certificates;

	public Employee() {
	}
	
	
	
	public Employee(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}



	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}

	@Override
	public boolean equals(Object o) {
		if ( this == o ) {
			return true;
		}
		if ( !( o instanceof Employee ) ) {
			return false;
		}

		if ( id == null ) {
			return false;
		}

		final Employee other = (Employee) o;
		return id.equals( other.id );
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Set<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(Set<Certificate> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", certificates=" + certificates.toString() + "]";
	}
	

}
