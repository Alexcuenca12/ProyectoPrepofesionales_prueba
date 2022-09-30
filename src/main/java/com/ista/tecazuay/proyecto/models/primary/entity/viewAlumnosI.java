package com.ista.tecazuay.proyecto.models.primary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "viewAlumnosI")
@NoArgsConstructor
@AllArgsConstructor
public class viewAlumnosI {

	@Id
	private String per_primerapellido;
	private String per_segundoapellido;
	private String per_primernombre;
	private String per_segundonombre;
	private String car_descripcion;
	private String per_correo;
}
