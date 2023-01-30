package com.inn.productodg.propuesta.adaptador.entrada.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inn.productodg.propuesta.aplicacion.puerto.salida.persistencia.PropuestaRep;
import com.inn.productodg.propuesta.dominio.Propuesta;
import com.inn.productodg.publicacion.dominio.Publicacion;



@RestController
public class PropuestaControl {

	@Autowired
	private PropuestaRep repositorio;

	
	// punto de exposición (endpoint)
	@RequestMapping("/propuesta")
	public Iterable<Propuesta> getPropuestas() {
		return repositorio.findAll();
	}
}
