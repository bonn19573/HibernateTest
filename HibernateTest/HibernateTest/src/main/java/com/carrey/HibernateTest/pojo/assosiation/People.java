package com.carrey.HibernateTest.pojo.assosiation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class People {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy="people",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Phone> phones = new ArrayList<Phone>();
	
	@ManyToMany(mappedBy="peoples",fetch=FetchType.LAZY,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private Set<House> houses = new HashSet<House>();
	
	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void addPhone(Phone phone){
		this.phones.add(phone);
		phone.setPeople(this);
	}
	
	public void removePhone(Phone phone){
		this.phones.remove(phone);
		phone.setPeople(null);
	}
	
	

	public Set<House> getHouses() {
		return houses;
	}

	public void setHouses(Set<House> houses) {
		this.houses = houses;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", phones=" + phones + "]";
	}


	
	

}
