package com.ista.tecazuay.proyecto.models.primary.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "representante_empresa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepresentanteEmpresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_representante;
	@Column(name = "cedula", nullable = false, updatable = false)
	private String cedula;
	private String nombrerep;
	private String apellidorep;
	private String correorep;
	private String direccionrep;
	private String telefonorep;
	private Long idempre;

}
