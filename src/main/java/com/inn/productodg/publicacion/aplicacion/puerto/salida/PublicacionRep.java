package com.inn.productodg.publicacion.aplicacion.puerto.salida;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.inn.productodg.publicacion.dominio.Publicacion;



public interface PublicacionRep extends CrudRepository <Publicacion, Long> {
		
}
