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
public class viewDocentes {
	@Id
	private String cedula;
	private String primernombre ;
	private String primerapellido;
	private String abreviatura;
	private String titulo;
	private int categoria;
}
