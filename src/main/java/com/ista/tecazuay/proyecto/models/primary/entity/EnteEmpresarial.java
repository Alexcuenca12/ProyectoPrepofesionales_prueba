package com.ista.tecazuay.proyecto.models.primary.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ente_empresarial")
public class EnteEmpresarial implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ente_empresa;
	private String rol;
	private Long id_empresa;
	private Long id_persona;
	private Long id_representante;

	public Long getId_ente_empresa() {
		return id_ente_empresa;
	}

	public void setId_ente_empresa(Long id_ente_empresa) {
		this.id_ente_empresa = id_ente_empresa;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}

	public Long getId_persona() {
		return id_persona;
	}

	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}

	public Long getId_representante() {
		return id_representante;
	}

	public void setId_representante(Long id_representante) {
		this.id_representante = id_representante;
	}
}
