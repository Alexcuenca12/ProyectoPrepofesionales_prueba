package com.ista.tecazuay.proyecto.models.primary.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "convenios")
public class Convenio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_convenio;
	private int numero_convenio;
	private String descripcion;
	private Long id_empresa;
	private Long id_coordinador;

	public Long getId_convenio() {
		return id_convenio;
	}

	public void setId_convenio(Long id_convenio) {
		this.id_convenio = id_convenio;
	}

	public int getNumero_convenio() {
		return numero_convenio;
	}

	public void setNumero_convenio(int numero_convenio) {
		this.numero_convenio = numero_convenio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}

	public Long getId_coordinador() {
		return id_coordinador;
	}

	public void setId_coordinador(Long id_coordinador) {
		this.id_coordinador = id_coordinador;
	}
}
