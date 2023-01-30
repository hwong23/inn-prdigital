package com.inn.productodg.publicacion.adaptador.entrada.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inn.productodg.propuesta.aplicacion.puerto.salida.persistencia.PropuestaRep;
import com.inn.productodg.publicacion.aplicacion.puerto.salida.PublicacionRep;
import com.inn.productodg.publicacion.dominio.Publicacion;


@RestController
public class PublicacionControl {
	@Autowired
	private PublicacionRep repositorio;

	
	// punto de exposición (endpoint)
	@RequestMapping("/publicacion")
	public Iterable<Publicacion> getPublicaciones() {
		return repositorio.findAll();
	}

	// punto de exposición (endpoint)
	@RequestMapping("/agrpublicacion")
	public void setPublicacion() {
		Publicacion pu1 = new Publicacion ("Domicilios automáticos" , "Embajada EEUU");
		Publicacion pu2 = new Publicacion ("Cafeterías Inteligentes" , "Alcaldía");
		
		repositorio.save(pu1);
		repositorio.save(pu2);

	}

}
