package com.carrey.HibernateTest;

import org.junit.Test;

import com.carrey.HibernateTest.pojo.Stock;
import com.carrey.HibernateTest.pojo.StockDetail;

public class BidirectionalOneToOneTest extends AbstractTest {
	
	@Test
	public void testSave(){
		Stock stock = new Stock();
		StockDetail stockDetail = new StockDetail();
		stock.addDetail(stockDetail);
		
		session.save(stock);
		
	}
	
	@Test
	public void testFromChildEntity(){
		Stock stock = new Stock();
		StockDetail stockDetail = new StockDetail();		
		stock.addDetail(stockDetail);
		
		session.save(stock);
		
		StockDetail stockDetail2 = new StockDetail();
		
		stockDetail2.setStock(stock);
		
		session.save(stockDetail2);
	}
	
	@Test
	public void testQuery(){
		Stock stock = session.get(Stock.class, 80);
		
		System.out.println(stock);
	}
	
	@Test
	public void testDelete(){
		Stock stock = session.get(Stock.class, 73);
		session.flush();
		stock.removeDetail();
	}

}
