package com.sj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {

}
