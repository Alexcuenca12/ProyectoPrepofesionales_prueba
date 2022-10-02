package com.ista.tecazuay.proyecto.models.primary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class vNombreEmpresaRepre {
	@Id
	private String NombreEmpresa;
	private String NombreRepresentante;
	private String ApellidoRepresentante;
	

}
