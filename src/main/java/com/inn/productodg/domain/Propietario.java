package com.inn.productodg.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Propietario {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private long propietid;
	private String nombre, apellido;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="propietario")
	private List<Car> cars;

	


	public Propietario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	protected List<Car> getCars() {
		return cars;
	}
	protected void setCars(List<Car> cars) {
		this.cars = cars;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
		
	
	
}
