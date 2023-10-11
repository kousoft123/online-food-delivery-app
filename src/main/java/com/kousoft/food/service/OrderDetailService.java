package com.kousoft.food.service;

import java.util.List;

import com.kousoft.food.exceptions.CustomerException;
import com.kousoft.food.exceptions.OrderException;
import com.kousoft.food.model.Item;
import com.kousoft.food.model.OrderDetails;


public interface OrderDetailService {
	
	public OrderDetails addOrder(OrderDetails order)throws OrderException;
	
	public OrderDetails updateOrder(OrderDetails order)throws OrderException;
	
	public OrderDetails removeOrder(Integer orderId)throws OrderException;
	
	public OrderDetails viewOrder(Integer orderId)throws OrderException;
	
	public List<Item> viewAllOrdersByCustomer(Integer customerId)throws OrderException,CustomerException;

}
