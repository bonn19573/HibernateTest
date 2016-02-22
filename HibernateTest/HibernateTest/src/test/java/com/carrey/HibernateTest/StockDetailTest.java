package com.carrey.HibernateTest;

import org.junit.Test;

import com.carrey.HibernateTest.pojo.Stock;
import com.carrey.HibernateTest.pojo.StockDetail;

public class StockDetailTest extends AbstractTest{
	
	@Test
	public void testSave(){
		Stock stock = new Stock();
		
		StockDetail stockDetail = new StockDetail();
		
		stockDetail.setStock(stock);
		
		session.save(stock);
		
		session.save(stockDetail);
	}

}
