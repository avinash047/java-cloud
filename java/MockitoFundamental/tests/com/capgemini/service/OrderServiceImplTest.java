package com.capgemini.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.capgemini.dao.OrderDao;
import com.capgemini.dto.Order;
import com.capgemini.exception.OrderException;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceImplTest {

	private OrderServiceImpl target;
	private Order order;
	@Mock
	private OrderDao orderDao;	
	private int orderId;

	@Before
	public void setUp() throws Exception {
		target = new OrderServiceImpl();
		order = new Order();
		//MockitoAnnotations.initMocks(this);
		target.setOrderDao(orderDao);
	}

	@After
	public void tearDown() throws Exception {
		target = null;
	}
//place Order
	@Test
	public void testPlaceOrderShouldPlaceOrderSucessfully() throws OrderException,SQLException{
		//target.setOrderDao(orderDao);
		when(orderDao.create(order)).thenReturn(1);
		boolean result = target.placeOrder(order);
		assertTrue(result);
		verify(orderDao,times(1)).create(order);
	}

	@Test
	public void testPlaceOrderShouldNotPlaceOrder() throws OrderException,SQLException {
		when(orderDao.create(order)).thenReturn(0);
		boolean result = target.placeOrder(order);
		assertFalse(result);		
	}
	
	@Test(expected=OrderException.class)
	public void testPlaceOrderShouldThrowOrderException()throws OrderException, SQLException{
		when(orderDao.create(order)).thenThrow(SQLException.class);
		target.placeOrder(order);
	}
//Delete Order	
	@Test
	public void testDeleteOrderShouldDeleteOrderSucessfully() throws SQLException, OrderException {
	
		when(orderDao.delete(orderId)).thenReturn(1);
		boolean result = target.deleteOrder(orderId);
		assertTrue(result);
	}
	
	@Test
	public void testDeleteOrderShouldNotDeleteOrder() throws OrderException,SQLException {
		when(orderDao.delete(orderId)).thenReturn(0);
		boolean result = target.deleteOrder(orderId);
		assertFalse(result);		
	}
	
	@Test(expected=OrderException.class)
	public void testDeleteOrderShouldThrowOrderException()throws OrderException, SQLException{
		when(orderDao.delete(orderId)).thenThrow(SQLException.class);
		target.deleteOrder(orderId);
	}
//Cancle Order	
	@Test
	public void testcancleOrderShouldcancleOrderSucessfully() throws SQLException, OrderException {
	
		
		when(orderDao.read(orderId)).thenReturn(order);
		when(orderDao.update(order)).thenReturn(1);
		boolean result = target.cancelOrder(orderId);
		assertTrue(result);
	}
	@Test
	public void testCancleOrderShouldNotCancleOrder() throws OrderException,SQLException {
		when(orderDao.read(orderId)).thenReturn(order);
		when(orderDao.update(order)).thenReturn(0);
		boolean result = target.cancelOrder(orderId);
		assertFalse(result);		
	}
	@Test(expected=OrderException.class)
	public void testCancleOrderShouldThrowOrderException()throws OrderException, SQLException{
		when(orderDao.read(orderId)).thenThrow(SQLException.class);
		when(orderDao.update(order)).thenThrow(SQLException.class);
		target.cancelOrder(orderId);
	}
	
	
}


