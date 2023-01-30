package com.inn.productodg.postulacion.busqueda.aplicacion.puerto.salida;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.inn.productodg.postulacion.busqueda.dominio.Publicacion;



public interface PublicacionRep extends CrudRepository <Publicacion, Long> {

	List<Publicacion> findByProyecto(String proyecto);
	
}
