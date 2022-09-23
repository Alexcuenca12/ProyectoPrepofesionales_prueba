package com.ista.tecazuay.proyecto.models.primary.entity.anexos;

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
@Table(name = "anexo6_detallePractica")
public class Anexo6_DetallePractica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_reporte;
	private String observaciones;
	@Column(name = "hora_ingreso")
	@Temporal(TemporalType.TIME)
	private Date hora_ingreso;
	@Column(name = "hora_salida")
	@Temporal(TemporalType.TIME)
	private Date hora_salida;
	@Column(name = "horas_totales")
	@Temporal(TemporalType.TIME)
	private Date horas_totales;

	public Long getId_reporte() {
		return id_reporte;
	}

	public void setId_reporte(Long id_reporte) {
		this.id_reporte = id_reporte;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Date getHora_ingreso() {
		return hora_ingreso;
	}

	public void setHora_ingreso(Date hora_ingreso) {
		this.hora_ingreso = hora_ingreso;
	}

	public Date getHora_salida() {
		return hora_salida;
	}

	public void setHora_salida(Date hora_salida) {
		this.hora_salida = hora_salida;
	}

	public Date getHoras_totales() {
		return horas_totales;
	}

	public void setHoras_totales(Date horas_totales) {
		this.horas_totales = horas_totales;
	}
}
