package com.kousoft.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kousoft.food.model.OrderDetails;




@Repository
public interface OrderDAO extends JpaRepository<OrderDetails, Integer>{

}
