package com.carrey.HibernateTest.pojo.inheritance;

import javax.persistence.Entity;

@Entity
public class DebitAccount extends Account {
	
	private String debit;
	
	

	public DebitAccount() {
	}

	public DebitAccount(String common1, String common2, String debit) {
		super(common1, common2);
		this.debit = debit;
	}

	public String getDebit() {
		return debit;
	}

	public void setDebit(String debit) {
		this.debit = debit;
	}

	@Override
	public String toString() {
		return "DebitAccount [debit=" + debit + "]";
	}
	

}
