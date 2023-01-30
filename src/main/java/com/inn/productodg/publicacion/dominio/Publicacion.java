package com.inn.productodg.publicacion.dominio;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Publicacion {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String proyecto, entidad;
	
	public Publicacion() {}
	
	public Publicacion(String proyecto, String entidad) {
		super();
		this.proyecto = proyecto;
		this.entidad = entidad;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	
}
