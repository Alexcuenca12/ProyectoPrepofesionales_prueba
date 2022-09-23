package com.ista.tecazuay.proyecto.models.primary.entity.anexos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anexo1")
public class Anexo1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_anexo1;
	private String descripcion_doc;
	private String estado_firma;
	private Long id_ente_empresa;
	private Long id_tutor_academico;

	public Long getId_anexo1() {
		return id_anexo1;
	}

	public void setId_anexo1(Long id_anexo1) {
		this.id_anexo1 = id_anexo1;
	}

	public String getDescripcion_doc() {
		return descripcion_doc;
	}

	public void setDescripcion_doc(String descripcion_doc) {
		this.descripcion_doc = descripcion_doc;
	}

	public String getEstado_firma() {
		return estado_firma;
	}

	public void setEstado_firma(String estado_firma) {
		this.estado_firma = estado_firma;
	}

	public Long getId_ente_empresa() {
		return id_ente_empresa;
	}

	public void setId_ente_empresa(Long id_ente_empresa) {
		this.id_ente_empresa = id_ente_empresa;
	}

	public Long getId_tutor_academico() {
		return id_tutor_academico;
	}

	public void setId_tutor_academico(Long id_tutor_academico) {
		this.id_tutor_academico = id_tutor_academico;
	}
}
