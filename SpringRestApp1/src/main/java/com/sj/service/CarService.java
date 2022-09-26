package com.sj.service;

import java.util.List;


import com.sj.model.Car;

public interface CarService {
	
	 public Car findById(int id);

	public List<Car> getAllCars();

	public Car insertCar(Car car);

	public void removeCarById(int id);

	public Car updateCarById(Car car, int id);	

}
