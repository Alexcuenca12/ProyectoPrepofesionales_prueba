package com.ista.tecazuay.proyecto.models.secondary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class verDocentes {
	
	@Id
	private String cedula;
	private String doc_nombres;
	private String doc_abreviatura;
	private String doc_titulo;
	private String doc_categoria;
	private String doc_carrera_cod;
	private String doc_carrera;
	
}
