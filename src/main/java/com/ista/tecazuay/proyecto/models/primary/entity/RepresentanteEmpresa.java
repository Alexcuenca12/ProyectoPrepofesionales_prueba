package com.ista.tecazuay.proyecto.models.primary.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "representante_empresa")
@Setter
@Getter
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

	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date createat;

	@PrePersist
	public void prePersist() {
		createat = new Date();
	}
}
