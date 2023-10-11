package com.kousoft.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kousoft.food.model.Bill;



@Repository
public interface BillDAO extends JpaRepository<Bill, Integer>{

}