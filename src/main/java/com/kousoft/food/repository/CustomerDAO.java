package com.kousoft.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kousoft.food.model.Customer;




@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
