package com.carrey.HibernateTest.pojo.naturalid;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

@Entity
public class PostalCarrier {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	
//	@NaturalId -- naturalid cannot work on Embeded attribute, maybe hibernate bug.
//	@Embedded
//	private PostalCode postalCode;
	
	@NaturalId
	private String code1;
	
	@NaturalId
	private String code2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	@Override
	public String toString() {
		return "PostalCarrier [id=" + id + ", code1=" + code1 + ", code2=" + code2 + "]";
	}

	public PostalCarrier(String code1, String code2) {
		this.code1 = code1;
		this.code2 = code2;
	}

	public PostalCarrier() {
	}


	
	

}
