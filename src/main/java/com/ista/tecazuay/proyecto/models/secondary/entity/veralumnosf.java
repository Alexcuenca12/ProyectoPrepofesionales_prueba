package com.ista.tecazuay.proyecto.models.secondary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class veralumnosf {
	
	@Id
	private String cedula;
	private String nombre_completo;
	private String car_descripcion;
	private String per_correo;
	

}
