package com.kousoft.food.service;

import com.kousoft.food.exceptions.CustomerException;
import com.kousoft.food.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer)throws CustomerException;
	
	public Customer updateCustomer(Customer customer)throws CustomerException;
	
	public Customer removeCustomerById(Integer customerId)throws CustomerException;
	
	public Customer viewCustomer(Integer customerId)throws CustomerException;

}
