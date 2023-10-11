package com.kousoft.food.service;

import com.kousoft.food.exceptions.BillException;
import com.kousoft.food.exceptions.CustomerException;
import com.kousoft.food.exceptions.ItemException;
import com.kousoft.food.model.Bill;

public interface BillService {
	
	public Bill addBill(Bill bill) throws BillException;
	
	public Bill updateBill(Bill bill)throws BillException;
	
	public Bill removeBill(Integer billId)throws BillException;
	
	public Bill viewBill(Integer billId)throws BillException;
	
	public String generateTotalBillById(Integer customerId)throws ItemException,CustomerException;
	

}
