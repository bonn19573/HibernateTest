package com.carrey.HibernateTest.dojo;

public class Address {
	
	private String phone;
	private String postCode;
	private String address;
	
	
	public Address() {
	}


	public Address(String phone, String postCode, String address) {
		super();
		this.phone = phone;
		this.postCode = postCode;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Address [phone=" + phone + ", postCode=" + postCode + ", address=" + address + "]";
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPostCode() {
		return postCode;
	}


	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	

}
