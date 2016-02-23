package com.carrey.HibernateTest.pojo.inheritance;

import java.util.List;

import org.junit.Test;

import com.carrey.HibernateTest.AbstractTest;

public class InheritanceTest extends AbstractTest {
	
	@Test
	public void testMappedSuperClass(){
		CreditAccount creditAccount = new CreditAccount("aaa", "bbb", "ccc");
		DebitAccount debitAccount = new DebitAccount("aa", "bb", "cc");
		session.save(creditAccount);
		session.save(debitAccount);
	}
	
	@Test
	public void testSingleTable(){
		Inheritance.CreditAccount creditAccount = new Inheritance.CreditAccount("aa", "bb","credit");
		Inheritance.DebitAccount debitAccount = new Inheritance.DebitAccount("cc", "dd","debit");
		session.save(creditAccount);
		session.save(debitAccount);
		
	}
	
	@Test
	public void testSingleTableQuery(){
		List<Inheritance.Account> list = session.createQuery("select a from Account a").list();
		
		list.stream().forEach(item->{System.out.println(item);});
	}
	
	@Test
	public void testJoinTable(){
		JoinTable.CreditAccount creditAccount = new JoinTable.CreditAccount("aa", "bb","credit");
		JoinTable.DebitAccount debitAccount = new JoinTable.DebitAccount("cc", "dd","debit");
		session.save(creditAccount);
		session.save(debitAccount);
	}
	
	@Test
	public void testJoinTableQuery(){
		List<JoinTable.Account> list = session.createQuery("select a from Account a").list();
		list.stream().forEach(item->{System.out.println(item);});
	}
	
	@Test
	public void testTablePerClass(){
		TablePerClass.CreditAccount creditAccount = new TablePerClass.CreditAccount("aa", "bb","credit");
		TablePerClass.DebitAccount debitAccount = new TablePerClass.DebitAccount("cc", "dd","debit");
		session.save(creditAccount);
		session.save(debitAccount);		
	}
	
	@Test
	public void testTablePerClassQuery(){
		List<TablePerClass.Account> list = session.createQuery("from Account").list();
		
		list.stream().forEach(item->{System.out.println(item);});
	}

}
