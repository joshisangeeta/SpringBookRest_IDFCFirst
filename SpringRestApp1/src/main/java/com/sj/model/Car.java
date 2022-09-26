package com.sj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;	
	private String colour;
	private String model;
	private int yearsOfUse;
	private double price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car( String colour, String model, int yearsOfUse, double price) {
		super();		
		this.colour = colour;
		this.model = model;
		this.yearsOfUse = yearsOfUse;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearsOfUse() {
		return yearsOfUse;
	}
	public void setYearsOfUse(int yearsOfUse) {
		this.yearsOfUse = yearsOfUse;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", colour=" + colour + ", model=" + model + ", yearsOfUse=" + yearsOfUse + ", price="
				+ price + "]";
	}
	
	

}
