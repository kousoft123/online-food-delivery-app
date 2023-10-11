package com.kousoft.food.service;

import com.kousoft.food.exceptions.CartException;
import com.kousoft.food.exceptions.ItemException;
import com.kousoft.food.model.FoodCart;

public interface FoodCartService {
	
	public FoodCart saveCart(FoodCart cart)throws CartException;
	
	public FoodCart addItem(Integer cartId, Integer itemId)throws CartException,ItemException;
	
	public FoodCart clearCart(Integer cartId)throws CartException;
	
	public FoodCart viewCart(Integer cartId)throws CartException;

}
