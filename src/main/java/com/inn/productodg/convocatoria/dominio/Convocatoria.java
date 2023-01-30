package com.inn.productodg.convocatoria.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.inn.productodg.publicacion.dominio.Publicacion;




@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Convocatoria {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String proponente, solucion;
	
	//@OneToMany(fetch = FetchType.LAZY)
	//@JoinColumn(name = "publicacion")
	// private Publicacion publicacion;

	
	public Convocatoria(String proponente, String solucion, Publicacion publicacion) {
		super();
		this.proponente = proponente;
		this.solucion = solucion;
//		this.publicacion = publicacion;
	}


	protected String getProponente() {
		return proponente;
	}


	protected void setProponente(String proponente) {
		this.proponente = proponente;
	}


	protected String getSolucion() {
		return solucion;
	}


	protected void setSolucion(String solucion) {
		this.solucion = solucion;
	}


//	protected Publicacion getPublicacion() {
//		return publicacion;
//	}
//
//
//	protected void setPublicacion(Publicacion publicacion) {
//		this.publicacion = publicacion;
//	}

	
}
