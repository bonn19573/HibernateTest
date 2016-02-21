package com.carrey.HibernateTest.dojo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Login {
	
	@EmbeddedId
	private LoginPK pk;
	
	private String password;
	
	
	
	
	public Login(LoginPK pk, String password) {
		this.pk = pk;
		this.password = password;
	}




	public LoginPK getPk() {
		return pk;
	}




	public void setPk(LoginPK pk) {
		this.pk = pk;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "Login [pk=" + pk + ", password=" + password + "]";
	}






}
