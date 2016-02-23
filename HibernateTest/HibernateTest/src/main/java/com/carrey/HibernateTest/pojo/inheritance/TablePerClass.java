package com.carrey.HibernateTest.pojo.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.InheritanceType;

public class TablePerClass {
	
	@Entity(name = "Account")
	@javax.persistence.Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
	public static class Account{
		
		@Id
		@GeneratedValue
		protected Integer id;
		
		protected String common;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCommon() {
			return common;
		}

		public void setCommon(String common) {
			this.common = common;
		}

		@Override
		public String toString() {
			return "Account [id=" + id + ", common=" + common + "]";
		}

		public Account(String common) {
			this.common = common;
		}

		public Account() {
		}
		
		
		
	}
	
	@Entity(name="DebitAccount")
	public static class DebitAccount extends Account{
		
		private String debit;
		private String debitKey;
		

		public String getDebitKey() {
			return debitKey;
		}

		public void setDebitKey(String debitKey) {
			this.debitKey = debitKey;
		}

		public String getDebit() {
			return debit;
		}

		public void setDebit(String debit) {
			this.debit = debit;
		}




		@Override
		public String toString() {
			return "DebitAccount [debit=" + debit + ", debitKey=" + debitKey + ", id=" + id + ", common=" + common + "]";
		}

		public DebitAccount(String common, String debit, String debitKey) {
			super(common);
			this.debit = debit;
			this.debitKey = debitKey;
		}

		public DebitAccount() {
		}
		
		
		
	}
	
	@Entity(name="CreditAccount")
	public static class CreditAccount extends Account{
		private String credit;
		private String creditKey;

		public String getCreditKey() {
			return creditKey;
		}

		public void setCreditKey(String creditKey) {
			this.creditKey = creditKey;
		}

		public String getCredit() {
			return credit;
		}

		public void setCredit(String credit) {
			this.credit = credit;
		}



		@Override
		public String toString() {
			return "CreditAccount [credit=" + credit + ", creditKey=" + creditKey + ", id=" + id + ", common=" + common + "]";
		}

		public CreditAccount(String common, String credit, String creditKey) {
			super(common);
			this.credit = credit;
			this.creditKey = creditKey;
		}

		public CreditAccount() {
		}
		
	}

}
