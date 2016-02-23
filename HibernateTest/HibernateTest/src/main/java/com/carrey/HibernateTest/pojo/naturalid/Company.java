package com.carrey.HibernateTest.pojo.naturalid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NaturalIdCache;

@Entity
//@NaturalIdCache -- this is secondary cache
public class Company {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@NaturalId(mutable=true)
	private String taxIdentifier;
	
	

	public Company() {
	}
	

	public Company(String taxIdentifier) {
		this.taxIdentifier = taxIdentifier;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaxIdentifier() {
		return taxIdentifier;
	}

	public void setTaxIdentifier(String taxIdentifier) {
		this.taxIdentifier = taxIdentifier;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", taxIdentifier=" + taxIdentifier + "]";
	}
	
	

}
