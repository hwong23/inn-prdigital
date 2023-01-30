package com.inn.productodg.postulacion.publicacion.adaptador.entrada.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inn.productodg.postulacion.publicacion.aplicacion.puerto.salida.PublicacionRep;
import com.inn.productodg.postulacion.publicacion.dominio.Publicacion;


@RestController
public class PublicacionControl {
	@Autowired
	private PublicacionRep repositorio;

	
	// punto de exposición (endpoint)
	@RequestMapping("/busqueda")
	public Iterable<Publicacion> getPublicaciones() {
		return repositorio.findAll();
	}
	

}
