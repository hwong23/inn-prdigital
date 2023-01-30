package com.inn.productodg.postulacion.busqueda.dominio;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;



@Entity
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
