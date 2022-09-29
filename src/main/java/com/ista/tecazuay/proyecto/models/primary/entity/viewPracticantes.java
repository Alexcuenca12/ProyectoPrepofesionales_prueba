package com.ista.tecazuay.proyecto.models.primary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "list_practicantes_view_m")
@NoArgsConstructor
@AllArgsConstructor
public class viewPracticantes {

	@Id
	private int idrealizando;
	private int idpractica;
	private int idpracticante;
	private int idpersona;
	private String nombre;
	private String identificacion;
	private String empresas;

}
