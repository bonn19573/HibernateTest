package com.carrey.HibernateTest.dojo;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.NaturalId;

import com.carrey.HibernateTest.converter.GenderConverter;

@Entity
@Table(name = "person")
@Access(AccessType.FIELD)
public class Person {
	
	@NaturalId
	@Transient
	private String ssn;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "person_id")
	private Integer personId;

	@Column
	@ColumnTransformer(read = "lower(name)", write = "upper(?)")
	private String name;

	@Embedded
	private Name fullName;

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

	@Column(name = "born_date")
	@Temporal(TemporalType.DATE)
	private Date bornDate;

	@Formula(value = "YEAR(CURDATE()) - YEAR(born_date)")
	private Integer age;
	
	@Version
	private Integer version;

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

	public Name getFullName() {
		return fullName;
	}

	public void setFullName(Name fullName) {
		this.fullName = fullName;
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

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", fullName=" + fullName + ", gender=" + gender + ", createDate=" + createDate + ", createTime=" + createTime + ", createDateTime="
				+ createDateTime + ", createDbDateTime=" + createDbDateTime + ", updateDbDateTime=" + updateDbDateTime + ", bornDate=" + bornDate + ", age=" + age + ", version=" + version + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}

	
}
