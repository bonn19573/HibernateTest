package com.carrey.HibernateTest.pojo.assosiation;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class House {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="house_name")
	private String name;

	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE},fetch=FetchType.LAZY)
	private Set<People> peoples = new HashSet<People>();

	public House(String name) {
		this.name = name;
	}


	public House() {
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<People> getPeoples() {
		return peoples;
	}


	public void setPeoples(Set<People> peoples) {
		this.peoples = peoples;
	}
	
	public void addPeople(People people){
		this.peoples.add(people);
		people.getHouses().add(this);
	}
	
	public void removePeople(People people){
		this.peoples.remove(people);
		people.getHouses().remove(this);
	}


	@Override
	public String toString() {
		return "House [id=" + id + ", name=" + name + ", peoples=" + peoples + "]";
	}



	
	

}
