package com.carrey.HibernateTest.dojo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class LoginPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String system;
	private String username;
	
	
	public LoginPK(String system, String username) {
		this.system = system;
		this.username = username;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "PK [system=" + system + ", username=" + username + "]";
	}
	
	
}