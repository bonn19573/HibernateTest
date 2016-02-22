package com.carrey.HibernateTest.pojo.assosiation;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=People.class)
	@JoinColumn(name="people_id")
	private People people;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	


	public People getPeople() {
		return people;
	}


	public void setPeople(People people) {
		this.people = people;
	}


	@Override
	public String toString() {
		return "Phone [id=" + id + "]";
	}


	
	
	
	

}
