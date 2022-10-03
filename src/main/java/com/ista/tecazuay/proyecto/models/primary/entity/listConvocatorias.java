package com.ista.tecazuay.proyecto.models.primary.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "listconvocatoriaest")
@NoArgsConstructor
@AllArgsConstructor
public class listConvocatorias {

	@Id
	private Long idconvocatoria;
	private int ciclo;
	@Column(name = "fechaenvio")
	@Temporal(TemporalType.DATE)
	private Date fechaenvio;
	@Column(name = "fecharecepcion")
	@Temporal(TemporalType.DATE)
	private Date fecharecepcion;
	private int idpracticas;
	private int idrepresentante;
	private String materias;
	private String responsable;
	private String empresa;
	private String actividades;

}
