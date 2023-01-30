package com.inn.productodg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.inn.productodg.propuesta.aplicacion.puerto.salida.PropuestaRep;
import com.inn.productodg.propuesta.dominio.Propuesta;
import com.inn.productodg.publicacion.aplicacion.puerto.salida.PublicacionRep;
import com.inn.productodg.publicacion.dominio.Publicacion;



@SpringBootApplication
public class InnpulsaProductodigitalApplication {
	@Autowired
	private PublicacionRep purepo;	
	@Autowired
	private PropuestaRep prorepo;
	
	public static void main(String[] args) {
		
		final Logger milog = LoggerFactory.getLogger(InnpulsaProductodigitalApplication.class);
			
			
		// appl innpulsa version 0.1
		SpringApplication.run(InnpulsaProductodigitalApplication.class, args);
		
		milog.info("Producto digital Innpulsa, version 0.5");
	}
	

	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Publicacion pu1 = new Publicacion ("Caracterizacion étnica" , "FUPAD");
			Publicacion pu2 = new Publicacion ("BiblioRed" , "Distrito");
			purepo.save(pu1);
			purepo.save(pu2);
			
			prorepo.save(new Propuesta ("ASESW.com", "Caracterizador", pu1));
			prorepo.save(new Propuesta ("ColombiaDigital.com", "Libro-e", pu2));
			
		};
	}	

}
