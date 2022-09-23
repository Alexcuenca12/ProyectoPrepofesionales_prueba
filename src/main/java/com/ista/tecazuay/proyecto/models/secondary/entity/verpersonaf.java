package com.ista.tecazuay.proyecto.models.secondary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Data
@Table(name = "personas_ista")
@NoArgsConstructor
@AllArgsConstructor
public class verpersonaf {

	@Id
	@Column(name = "cedula", nullable = false, updatable = false)
	private String cedula;
	private String correo_institucional;
	private String nombres;
	private String apellidos;
}