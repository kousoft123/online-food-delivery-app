package com.kousoft.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kousoft.food.model.Restaurant;


@Repository
public interface RestaurantDAO extends JpaRepository<Restaurant, Integer>{

}
