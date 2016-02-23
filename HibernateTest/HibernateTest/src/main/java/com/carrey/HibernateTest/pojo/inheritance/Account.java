package com.carrey.HibernateTest.pojo.inheritance;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Account {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String common1;
	private String common2;
	
	
	
	public Account() {
	}
	public Account(String common1, String common2) {
		this.common1 = common1;
		this.common2 = common2;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCommon1() {
		return common1;
	}
	public void setCommon1(String common1) {
		this.common1 = common1;
	}
	public String getCommon2() {
		return common2;
	}
	public void setCommon2(String common2) {
		this.common2 = common2;
	}
	
	

}
