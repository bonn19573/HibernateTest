package com.carrey.HibernateTest;

public class FirstNameGroupBy {
private String firstName;
private long count;
public FirstNameGroupBy(String firstName, long count) {
	super();
	this.firstName = firstName;
	this.count = count;
}
@Override
public String toString() {
	return "FirstNameGroupBy [firstName=" + firstName + ", count=" + count + "]";
}


}
