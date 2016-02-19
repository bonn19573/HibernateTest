package com.carrey.HibernateTest;

import org.hibernate.annotations.NaturalId;

public class Certificate {
	private Integer id;
	private String name;
	
	@NaturalId
	private String ssn = "default";

	public Certificate() {
	}
	
	public Certificate(String ssn) {
		// ctor for app
		this.ssn = ssn;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		assert ssn != null;
		return ssn.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if ( this == o ) {
			return true;
		}
		if ( !( o instanceof Certificate ) ) {
			return false;
		}

		final Certificate other = (Certificate) o;
		assert ssn != null;
		assert other.ssn != null;

		return ssn.equals( other.ssn );
	}
}
