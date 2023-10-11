package com.kousoft.food.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kousoft.food.exceptions.RestaurantException;
import com.kousoft.food.model.Restaurant;
import com.kousoft.food.repository.RestaurantDAO;


@Service
public class RestaurantServiceImpl implements RestaurantService{
	
	@Autowired
	RestaurantDAO restDAO;

	
	
	
	@Override
	public Restaurant addRestaurant(Restaurant restaurant) throws RestaurantException {
		Optional<Restaurant> opt = restDAO.findById(restaurant.getRestaurantId());
		if(opt.isPresent()) {
			throw new RestaurantException("Restaurant already exists..");
		}else {
			return restDAO.save(restaurant);
		}
	}




	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) throws RestaurantException {
		Optional<Restaurant> opt = restDAO.findById(restaurant.getRestaurantId());
		if(opt.isPresent()) {
			return restDAO.save(restaurant);
		}else {
			throw new RestaurantException("No such Restaurant exists..");
		}
	}




	@Override
	public Restaurant removeRestaurant(Integer restaurantId) throws RestaurantException {
		Optional<Restaurant> opt = restDAO.findById(restaurantId);
		if(opt.isPresent()) {
			Restaurant restaurant = opt.get();
			restDAO.delete(restaurant);
			return restaurant;
		}else {
			throw new RestaurantException("No Restaurant found with ID: "+restaurantId);
		}
	}




	@Override
	public Restaurant viewRestaurant(Integer restaurantId) throws RestaurantException {
		Optional<Restaurant> opt = restDAO.findById(restaurantId);
		if(opt.isPresent()) {
			Restaurant restaurant = opt.get();
			return restaurant;
		}else {
			throw new RestaurantException("No Restaurant found with ID: "+restaurantId);
		}
	}

}
