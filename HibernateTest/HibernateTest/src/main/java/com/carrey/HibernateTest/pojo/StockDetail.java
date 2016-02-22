package com.carrey.HibernateTest.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class StockDetail {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Stock stock;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "StockDetail [id=" + id + ", stock=" + stock + "]";
	}
	
	

}
