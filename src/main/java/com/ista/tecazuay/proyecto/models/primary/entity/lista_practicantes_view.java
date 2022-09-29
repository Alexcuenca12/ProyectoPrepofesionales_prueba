package com.ista.tecazuay.proyecto.models.primary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class lista_practicantes_view {
	
	@Id
	private int idrealizando;
	private int idpractica;
	private int idpracticante;
	@Nullable
	private int idanexo;
	private int idpersona;
	private String apellidouno;
	private String apellidodos;
	private String nombreuno;
	private String nombredos;
	private String identicacion;
	private String empresas;

}
