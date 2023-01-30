package com.inn.productodg.convocatoria.aplicacion.puerto.salida;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.inn.productodg.convocatoria.dominio.Convocatoria;



public interface ConvocatoriaRep extends CrudRepository <Convocatoria, Long> {


	List<Convocatoria> findByProponente(String proponente);
	
	List<Convocatoria> findAll();
	
}
