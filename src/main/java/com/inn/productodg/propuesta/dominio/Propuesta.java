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

	public Propuesta() {}
	
	public Propuesta(String proponente, String solucion, 
			Publicacion publicacion) {
		super();
		this.proponente = proponente;
		this.solucion = solucion;
		this.publicacion = publicacion;
	}


	public String getProponente() {
		return proponente;
	}
	public void setProponente(String proponente) {
		this.proponente = proponente;
	}
	public String getSolucion() {
		return solucion;
	}
	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}
	public Publicacion getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}
	
}
