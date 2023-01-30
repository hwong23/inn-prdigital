package com.inn.productodg.propuesta.aplicacion.puerto.salida;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.inn.productodg.propuesta.dominio.Propuesta;



public interface PropuestaRep extends CrudRepository <Propuesta, Long> {


	List<Propuesta> findByProponente(String proponente);
	
	List<Propuesta> findAll();
	
}
