package com.inn.productodg.propuesta.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.inn.productodg.publicacion.dominio.Publicacion;




@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Propuesta {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String proponente, solucion;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publicacion")
	private Publicacion publicacion;

	
	public Propuesta(String proponente, String solucion, 
			Publicacion publicacion) {
		super();
		this.proponente = proponente;
		this.solucion = solucion;
		this.publicacion = publicacion;
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
	protected Publicacion getPublicacion() {
		return publicacion;
	}
	protected void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}
	
}
