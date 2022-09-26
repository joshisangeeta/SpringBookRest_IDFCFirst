package com.sj.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sj.model.Car;
import com.sj.service.CarService;

@RestController
@RequestMapping("/api")
public class WebController {
	
	    @Autowired
	    CarService carService;
	
	    @RequestMapping(path="/hello",method=RequestMethod.GET)
	    public String sayHello() {
	    	return ("Hello world from Rest");
	    }
	
	    @GetMapping(path="/cars/{id}")
         public Car getCarById(@PathVariable int id) {
	    	 
	    	return carService.findById(id);	    	
	    }
	    @GetMapping(path="/cars")
         public List<Car> getAllCars(){
	    	   return carService.getAllCars();
	    }
	    
	    @PostMapping(path="/cars")
	    public Car insertCar (@RequestBody Car car) {
	    	return   carService.insertCar(car);
	    }
	    
	    @DeleteMapping("/cars/{id}")
	   public void removeCarById(@PathVariable int id) {
		   
	    	carService.removeCarById(id);
	   }
	    @PutMapping("/cars/{id}")
	    public Car updateCar (@RequestBody Car car,@PathVariable int id) {
	    	return carService.updateCarById(car,id);
	    }
	    

}
