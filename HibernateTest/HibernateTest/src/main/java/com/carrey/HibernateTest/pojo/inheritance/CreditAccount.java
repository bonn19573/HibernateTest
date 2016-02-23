package com.carrey.HibernateTest.pojo.inheritance;

import javax.persistence.Entity;

@Entity
public class CreditAccount extends Account {
	
	private String credit;
	
	

	public CreditAccount() {
	}

	public CreditAccount(String common1, String common2, String credit) {
		super(common1, common2);
		this.credit = credit;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "CreditAccount [credit=" + credit + "]";
	}
	
	

}
