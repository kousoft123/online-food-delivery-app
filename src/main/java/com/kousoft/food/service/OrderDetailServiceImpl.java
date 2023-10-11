package com.kousoft.food.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kousoft.food.exceptions.CustomerException;
import com.kousoft.food.exceptions.OrderException;
import com.kousoft.food.model.Customer;
import com.kousoft.food.model.Item;
import com.kousoft.food.model.OrderDetails;
import com.kousoft.food.repository.CustomerDAO;
import com.kousoft.food.repository.OrderDAO;



@Service
public class OrderDetailServiceImpl implements OrderDetailService{
	
	
	@Autowired
	OrderDAO orderDAO;
	
	@Autowired
	CustomerDAO cusDAO;

	
	
	@Override
	public OrderDetails addOrder(OrderDetails order) throws OrderException {
		Optional<OrderDetails> opt = orderDAO.findById(order.getOrderId());
		if(opt.isPresent()) {
			throw new OrderException("Order already exists..");
		}else {
			return orderDAO.save(order);
		}
	}



	@Override
	public OrderDetails updateOrder(OrderDetails order) throws OrderException {
		Optional<OrderDetails> opt = orderDAO.findById(order.getOrderId());
		if(opt.isPresent()) {
			return orderDAO.save(order);
		}else {
			throw new OrderException("Order such Order exists..");
		}
	}



	@Override
	public OrderDetails removeOrder(Integer orderId) throws OrderException {
		Optional<OrderDetails> opt = orderDAO.findById(orderId);
		if(opt.isPresent()) {
			OrderDetails order = opt.get();
			orderDAO.delete(order);
			return order;
		}else {
			throw new OrderException("No Order found with ID: "+orderId);
		}
	}



	@Override
	public OrderDetails viewOrder(Integer orderId) throws OrderException {
		Optional<OrderDetails> opt = orderDAO.findById(orderId);
		if(opt.isPresent()) {
			OrderDetails order = opt.get();
			return order;
		}else {
			throw new OrderException("No Order found with ID: "+orderId);
		}
	}



	@Override
	public List<Item> viewAllOrdersByCustomer(Integer customerId) throws OrderException, CustomerException {
		Optional<Customer> cOpt =cusDAO.findById(customerId);
		if(cOpt.isPresent()) {
			Customer customer = cOpt.get();
			 List<Item> itemList = customer.getFoodCart().getItemList();
			 if(itemList.size() > 0) {
				 return itemList;
			 }else {
				 throw new OrderException("No Orders found..");
			 }
		}else {
			throw new CustomerException("No Customer found with ID: "+customerId);
		}
	}

}
