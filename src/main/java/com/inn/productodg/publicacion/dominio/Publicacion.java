package com.inn.productodg.publicacion.dominio;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Publicacion {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String proyecto, entidad;
	

	
	public Publicacion(String proyecto, String entidad) {
		super();
		this.proyecto = proyecto;
		this.entidad = entidad;
	}
	protected String getProyecto() {
		return proyecto;
	}
	protected void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	protected String getEntidad() {
		return entidad;
	}
	protected void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	
}
