package com.ista.tecazuay.proyecto.models.primary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "representante_empresa")

public class RepresentanteEmpresa {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_representante;
	private String nombrerep;
	private String apellidorep;
	private String correorep;
	private String direccionrep;
	private String telefonorep;
	private Long idempre;
	
	public Long getId_representante() {
		return id_representante;
	}
	public void setId_representante(Long id_representante) {
		this.id_representante = id_representante;
	}
	public String getNombrerep() {
		return nombrerep;
	}
	public void setNombrerep(String nombrerep) {
		this.nombrerep = nombrerep;
	}
	public String getApellidorep() {
		return apellidorep;
	}
	public void setApellidorep(String apellidorep) {
		this.apellidorep = apellidorep;
	}
	public String getCorreorep() {
		return correorep;
	}
	public void setCorreorep(String correorep) {
		this.correorep = correorep;
	}
	public String getDireccionrep() {
		return direccionrep;
	}
	public void setDireccionrep(String direccionrep) {
		this.direccionrep = direccionrep;
	}
	public String getTelefonorep() {
		return telefonorep;
	}
	public void setTelefonorep(String telefonorep) {
		this.telefonorep = telefonorep;
	}
	public Long getIdempre() {
		return idempre;
	}
	public void setIdempre(Long idempre) {
		this.idempre = idempre;
	}	
	
}
