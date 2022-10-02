package com.ista.tecazuay.proyecto.models.primary.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "convocatorias")
public class Convocatoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_convocatoria;
	private Long id_practicas;
	@Column(name = "fecha_recepcion")
	@Temporal(TemporalType.DATE)
	private Date fecha_recepcion;
	@Column(name = "fecha_envio")
	@Temporal(TemporalType.DATE)
	private Date fecha_envio;
	private String listadoMaterias;
	private int ciclo;
	private String nombreResponsable;
	
	
}
