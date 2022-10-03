package com.ista.tecazuay.proyecto.models.primary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "viewalumnos")
@NoArgsConstructor
@AllArgsConstructor
public class viewAlumnosI {

	@Id
	@Column(name = "cedula", nullable = false, updatable = false)
	private String cedula;
	private String primerapellido;
	private String segundoapellido;
	private String primernombre;
	private String segundonombre;
	private String descripcion;
	private String correo;
}
