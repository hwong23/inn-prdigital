package com.inn.productodg.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String brand, model, color, registerNumber;
	private int year, price;
	
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "propietario")
	private Propietario propietario;
	



	public Car(String brand, String model, String color, 
			String registerNumber, int year, int price,
			Propietario propietario) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registerNumber = registerNumber;
		this.year = year;
		this.price = price;
		this.propietario = propietario;
	}



	protected Propietario getPropietario() {
		return propietario;
	}
	protected void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	protected String getBrand() {
		return brand;
	}
	protected void setBrand(String brand) {
		this.brand = brand;
	}
	protected String getModel() {
		return model;
	}
	protected void setModel(String model) {
		this.model = model;
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	protected String getRegisterNumber() {
		return registerNumber;
	}
	protected void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	protected int getYear() {
		return year;
	}
	protected void setYear(int year) {
		this.year = year;
	}
	protected int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
}
