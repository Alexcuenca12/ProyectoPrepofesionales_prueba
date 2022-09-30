package com.ista.tecazuay.proyecto.models.primary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "verdocente")
@NoArgsConstructor
@AllArgsConstructor
public class viewCoordinadoresI {

	@Id
	private String persona_identificacion;
	private String per_primerapellido;
	private String per_segundoapellido;
	private String per_primernombre;
	private String per_segundonombre;
	private String carrera_codigo;
}
