package com.ista.tecazuay.proyecto.models.secondary.entity;

import java.io.Serializable;

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
@NoArgsConstructor
@AllArgsConstructor
public class verDocentes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_persona;
	private String cedula;
	private String doc_nombres;
	private String doc_abreviatura;
	private String doc_titulo;
	private String doc_categoria;
	private String doc_carrera_cod;
	private String doc_carrera;
	
}
