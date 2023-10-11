package com.kousoft.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kousoft.food.model.FoodCart;




@Repository
public interface FoodCartDAO extends JpaRepository<FoodCart, Integer>{

}
