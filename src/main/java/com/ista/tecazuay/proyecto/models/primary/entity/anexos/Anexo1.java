package com.ista.tecazuay.proyecto.models.primary.entity.anexos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "anexo1")
public class Anexo1 {


	@Id
	private Long id_anexo1;
	//private Long id_practica_real;
	private String estado_firma;
	private String url_doc;
	private boolean estado;
	
	
	
	
	public Long getId_anexo1() {
		return id_anexo1;
	}
	public void setId_anexo1(Long id_anexo1) {
		this.id_anexo1 = id_anexo1;
	}
	public String getEstado_firma() {
		return estado_firma;
	}
	public void setEstado_firma(String estado_firma) {
		this.estado_firma = estado_firma;
	}
	public String getUrl_doc() {
		return url_doc;
	}
	public void setUrl_doc(String url_doc) {
		this.url_doc = url_doc;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

	
}
