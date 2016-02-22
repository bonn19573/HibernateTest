package com.carrey.HibernateTest.pojo;

import java.util.Date;

public class Event {

	private int event_id;
	private Date event_date;
	private String event_type;
	private String event_desc;
	
	
	
	public Event() {
	}


	public Event(Date event_date, String event_type, String desc) {
		super();
		this.event_date = event_date;
		this.event_type = event_type;
		this.event_desc = desc;
	}


	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public Date getEvent_date() {
		return event_date;
	}

	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}

	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}




	public String getEvent_desc() {
		return event_desc;
	}


	public void setEvent_desc(String event_desc) {
		this.event_desc = event_desc;
	}


	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", event_date=" + event_date + ", event_type=" + event_type + ", desc=" + event_desc + "]";
	}

}
