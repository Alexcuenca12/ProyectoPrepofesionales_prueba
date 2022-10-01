package com.ista.tecazuay.proyecto.models.primary.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "docentetutor")
@NoArgsConstructor
@AllArgsConstructor
public class DocenteTutor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tutor_academico;
	@Column(name = "cedula", nullable = false, updatable = false)
	private String cedula;
	private String categoria;
	private String titulo;
	private String carrera;
	private String nivel_academico;
	private Long id_persona;

}
