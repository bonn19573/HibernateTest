package com.carrey.HibernateTest.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "person_detail")
public class PersonDetail {

	@Id
	private Long id;

	@Column(name = "nick_name")
	private String nickName;

	@ManyToOne
	@MapsId("personId")
	private Person person;
	
	

	public PersonDetail() {
	}

	public PersonDetail(String nickName, Person person) {
		this.nickName = nickName;
		this.person = person;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PersonDetail [id=" + id + ", nickName=" + nickName + ", person=" + person + "]";
	}
	

}
