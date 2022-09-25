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

@Entity
@Table(name = "practicas")
public class Practicas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_practicas;
	private String lugar;
	private Double calificacion;
	@Column(name = "horas_totales")
	@Temporal(TemporalType.TIME)
	private Date horas_totales;
	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.DATE)
	private Date fecha_inicio;
	@Column(name = "fecha_fin")
	@Temporal(TemporalType.DATE)
	private Date fecha_fin;
	private Long id_empresa;
	private Long id_docente_tutor;
	private Long id_representante_empresa;
	private Long id_convenio;

	public Long getId_practicas() {
		return id_practicas;
	}

	public void setId_practicas(Long id_practicas) {
		this.id_practicas = id_practicas;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	public Date getHoras_totales() {
		return horas_totales;
	}

	public void setHoras_totales(Date horas_totales) {
		this.horas_totales = horas_totales;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}

	public Long getId_docente_tutor() {
		return id_docente_tutor;
	}

	public void setId_docente_tutor(Long id_docente_tutor) {
		this.id_docente_tutor = id_docente_tutor;
	}

	public Long getId_representante_empresa() {
		return id_representante_empresa;
	}

	public void setId_representante_empresa(Long id_representante_empresa) {
		this.id_representante_empresa = id_representante_empresa;
	}

	public Long getId_convenio() {
		return id_convenio;
	}

	public void setId_convenio(Long id_convenio) {
		this.id_convenio = id_convenio;
	}
	
}
