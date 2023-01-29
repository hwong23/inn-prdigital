package com.packt.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication {

	public static void main(String[] args) {
		final Logger milog = LoggerFactory.getLogger(CardatabaseApplication.class);
			
			
		// appl innpulsa version 0.1
		SpringApplication.run(CardatabaseApplication.class, args);
		
		milog.info("Producto digital Innpulsa, version 0.1");
	}
}
