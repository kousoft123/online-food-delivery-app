package com.kousoft.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kousoft.food.model.Item;




@Repository
public interface ItemDAO extends JpaRepository<Item, Integer>{

}
