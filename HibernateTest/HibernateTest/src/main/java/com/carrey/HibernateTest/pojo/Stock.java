package com.carrey.HibernateTest.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Stock {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@OneToOne(mappedBy = "stock", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private StockDetail stockDetail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

	public StockDetail getStockDetail() {
		return stockDetail;
	}

	public void addDetail(StockDetail stockDetail){
		this.stockDetail = stockDetail;
		stockDetail.setStock(this);
	}
	
	public void removeDetail(){
		if(stockDetail!=null){
			stockDetail.setStock(null);
			stockDetail = null;
		}
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", stockDetail=" + stockDetail + "]";
	}


	

}
