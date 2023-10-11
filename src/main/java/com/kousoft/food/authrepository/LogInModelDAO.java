package com.kousoft.food.authrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kousoft.food.authmodel.LogInModel;



@Repository
public interface LogInModelDAO extends JpaRepository<LogInModel, Integer>{

}
