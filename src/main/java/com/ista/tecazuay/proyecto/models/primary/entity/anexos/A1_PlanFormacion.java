package com.ista.tecazuay.proyecto.models.primary.entity.anexos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "A1PlanFormacion", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_anexo1"})})
public class A1_PlanFormacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_A1PlanFormacion;
	private String ResultadosEsp;
	private String DescActividad;
	private String periodoEq;
	private String AsignaturaRel;
	private long Horas;
	private long id_anexo;
	public Long getId_A1PlanFormacion() {
		return id_A1PlanFormacion;
	}
	public void setId_A1PlanFormacion(Long id_A1PlanFormacion) {
		this.id_A1PlanFormacion = id_A1PlanFormacion;
	}
	public String getResultadosEsp() {
		return ResultadosEsp;
	}
	public void setResultadosEsp(String resultadosEsp) {
		ResultadosEsp = resultadosEsp;
	}
	public String getDescActividad() {
		return DescActividad;
	}
	public void setDescActividad(String descActividad) {
		DescActividad = descActividad;
	}
	public String getPeriodoEq() {
		return periodoEq;
	}
	public void setPeriodoEq(String periodoEq) {
		this.periodoEq = periodoEq;
	}
	public String getAsignaturaRel() {
		return AsignaturaRel;
	}
	public void setAsignaturaRel(String asignaturaRel) {
		AsignaturaRel = asignaturaRel;
	}
	public long getHoras() {
		return Horas;
	}
	public void setHoras(long horas) {
		Horas = horas;
	}
	public long getId_anexo() {
		return id_anexo;
	}
	public void setId_anexo(long id_anexo) {
		this.id_anexo = id_anexo;
	}
	
	
}
