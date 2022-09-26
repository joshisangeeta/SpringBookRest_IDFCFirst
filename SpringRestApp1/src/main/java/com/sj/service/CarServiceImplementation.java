package com.sj.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.dao.CarRepository;
import com.sj.model.Car;

@Service
public class CarServiceImplementation implements CarService {
 
	@Autowired
	CarRepository carRepo;
	
	@Override
	public Car findById(int id) {
		// TODO Auto-generated method stub
		return    carRepo.findById(id).get();
	}

	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return  carRepo.findAll();
	}

	@Override
	public Car insertCar(Car car) {
		// TODO Auto-generated method stub
		return   carRepo.save(car);
	}

	@Override
	public void removeCarById(int id) {
		// TODO Auto-generated method stub
		carRepo.deleteById(id);
	}

	@Override
	public Car updateCarById(Car car, int id) {
		// TODO Auto-generated method stub
		Car toUpdate = carRepo.findById(id).get();
		toUpdate.setColour(car.getColour());
		toUpdate.setPrice(car.getPrice());
		toUpdate.setYearsOfUse(car.getYearsOfUse());
		toUpdate.setModel(car.getModel());
	
		return carRepo.save(toUpdate);
	}
	
	
	
	
	
	

}
