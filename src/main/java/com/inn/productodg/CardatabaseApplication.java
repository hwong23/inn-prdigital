package com.inn.productodg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.inn.productodg.domain.Car;
import com.inn.productodg.domain.CarRepositorio;
import com.inn.productodg.domain.PropietRepositorio;
import com.inn.productodg.domain.Propietario;



@SpringBootApplication
public class CardatabaseApplication {

	@Autowired
	private CarRepositorio repository;
	@Autowired
	private PropietRepositorio prepositorio;

	
	public static void main(String[] args) {
		
		final Logger milog = LoggerFactory.getLogger(CardatabaseApplication.class);
			
			
		// appl innpulsa version 0.1
		SpringApplication.run(CardatabaseApplication.class, args);
		
		milog.info("Producto digital Innpulsa, version 0.1");
	}
	

	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Propietario p1 = new Propietario("John" , "Johnson");
			Propietario p2 = new Propietario("Mary" , "Robinson");
			prepositorio.save(p1);
			prepositorio.save(p2);

			repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, p1));
			repository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, p1));
			repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, p2));
		};
	}	

}
