package com.ista.tecazuay.proyecto.models.primary.entity;


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
public class verDocentes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_persona;
	private Long id_docente;
	private String cedula;
	private String doc_nombres;
	private String doc_abreviatura;
	private String doc_titulo;
	
}
