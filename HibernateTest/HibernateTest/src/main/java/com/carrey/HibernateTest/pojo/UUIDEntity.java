package com.carrey.HibernateTest.pojo;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UUIDEntity {

    @Id
    @GeneratedValue
    public UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UUIDEntity [id=" + id + "]";
	}
	

}
