package com.carrey.HibernateTest.pojo.naturalid;

import javax.persistence.Embeddable;

@Embeddable
public class PostalCode {
	
	private String code1;
	private String code2;
	
	
	public PostalCode() {
	}
	public PostalCode(String code1, String code2) {
		this.code1 = code1;
		this.code2 = code2;
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
		return "PostalCode [code1=" + code1 + ", code2=" + code2 + "]";
	}

	
}
