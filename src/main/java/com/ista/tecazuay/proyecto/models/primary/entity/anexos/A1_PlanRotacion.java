package com.ista.tecazuay.proyecto.models.primary.entity.anexos;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "A1PlanRotacion")
public class A1_PlanRotacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_A1PlanRotacion;
	private String objetivoEspeci;
	private String objetivoOperat;
	private String funcion;
	private String horas;
	private String semanas;
	
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="id_anexo1")
	private Anexo1 anexo1;
	
	public Long getId_A1PlanRotacion() {
		return id_A1PlanRotacion;
	}
	public void setId_A1PlanRotacion(Long id_A1PlanRotacion) {
		this.id_A1PlanRotacion = id_A1PlanRotacion;
	}
	public String getObjetivoEspeci() {
		return objetivoEspeci;
	}
	public void setObjetivoEspeci(String objetivoEspeci) {
		this.objetivoEspeci = objetivoEspeci;
	}
	public String getObjetivoOperat() {
		return objetivoOperat;
	}
	public void setObjetivoOperat(String objetivoOperat) {
		this.objetivoOperat = objetivoOperat;
	}
	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	public String getHoras() {
		return horas;
	}
	public void setHoras(String horas) {
		this.horas = horas;
	}
	public String getSemanas() {
		return semanas;
	}
	public void setSemanas(String semanas) {
		this.semanas = semanas;
	}
	public Anexo1 getAnexo1() {
		return anexo1;
	}
	public void setAnexo1(Anexo1 anexo1) {
		this.anexo1 = anexo1;
	}
	
	
	
}
