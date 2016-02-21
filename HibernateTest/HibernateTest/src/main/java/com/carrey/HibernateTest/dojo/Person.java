package com.carrey.HibernateTest.dojo;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import com.carrey.HibernateTest.converter.GenderConverter;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue
	@Column(name = "person_id")
	private Integer personId;

	@Column
	private String name;

	// @Enumerated(EnumType.STRING)
	@Basic
	@Convert(converter = GenderConverter.class)
	private Gender gender;

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date")
	private Date createDate;

	@Column(name = "create_time")
	@Temporal(TemporalType.TIME)
	private Date createTime;

	@Column(name = "create_datetime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDateTime;

	@Column(name = "create_db_datetime", insertable = false)
	@Generated(GenerationTime.INSERT)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDbDateTime;

	@Column(name = "update_db_datetime", updatable = false, insertable = false)
	@Generated(GenerationTime.ALWAYS)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDbDateTime;

	public Person() {
	}

	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	
	

	public Date getCreateDbDateTime() {
		return createDbDateTime;
	}

	public void setCreateDbDateTime(Date createDbDateTime) {
		this.createDbDateTime = createDbDateTime;
	}

	public Date getUpdateDbDateTime() {
		return updateDbDateTime;
	}

	public void setUpdateDbDateTime(Date updateDbDateTime) {
		this.updateDbDateTime = updateDbDateTime;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", gender=" + gender + ", createDate=" + createDate + ", createTime=" + createTime + ", createDateTime=" + createDateTime
				+ ", createDbDateTime=" + createDbDateTime + ", updateDbDateTime=" + updateDbDateTime + "]";
	}



}
