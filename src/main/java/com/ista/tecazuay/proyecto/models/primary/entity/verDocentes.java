package com.ista.tecazuay.proyecto.models.primary.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="verdocentei")
@NoArgsConstructor
@AllArgsConstructor
public class verDocentes {
	
	@Id
	private Long id_persona;
	private Long id_docente;
	private String persona_identificacion;
	private String persona_primer_nombre;
	private String persona_primer_apellido;
	private String docente_abreviatura;
	private String docente_titulo;
	
}
