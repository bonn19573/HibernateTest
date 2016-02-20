package com.carrey.HibernateTest.dojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name="person_id")
	private Integer personId;
	
	@Column
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	

	public Person() {
	}

	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	

}




