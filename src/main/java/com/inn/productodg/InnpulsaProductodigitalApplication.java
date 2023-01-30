package com.inn.productodg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class InnpulsaProductodigitalApplication {

	
	public static void main(String[] args) {
		
		final Logger milog = LoggerFactory.getLogger(InnpulsaProductodigitalApplication.class);
			
			
		// appl innpulsa version 0.1
		SpringApplication.run(InnpulsaProductodigitalApplication.class, args);
		
		milog.info("Producto digital Innpulsa, version 0.5");
	}
	

	
	@Bean
	CommandLineRunner runner() {
		return args -> {
		};
	}	

}
