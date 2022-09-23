package com.ista.tecazuay.proyecto.models.primary.entity.anexos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anexo8")
public class Anexo8_InformeF implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_anexo8;
	private String conclusiones;
	private Long id_practica_real;

	public Long getId_anexo8() {
		return id_anexo8;
	}

	public void setId_anexo8(Long id_anexo8) {
		this.id_anexo8 = id_anexo8;
	}

	public String getConclusiones() {
		return conclusiones;
	}

	public void setConclusiones(String conclusiones) {
		this.conclusiones = conclusiones;
	}

	public Long getId_practica_real() {
		return id_practica_real;
	}

	public void setId_practica_real(Long id_practica_real) {
		this.id_practica_real = id_practica_real;
	}
}
