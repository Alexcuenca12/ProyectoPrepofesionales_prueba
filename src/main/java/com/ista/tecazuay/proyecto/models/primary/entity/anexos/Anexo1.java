package com.ista.tecazuay.proyecto.models.primary.entity.anexos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "anexo1")
public class Anexo1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_anexo1;
	private String estado_firma;
	private String url_doc;
	private boolean estado;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="id_anexo1")
	private List<A1_PlanFormacion> DetFormaciones;
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="id_anexo1")
	private List<A1_PlanRotacion> DetRotaciones;
	
	public Long getId_anexo1() {
		return id_anexo1;
	}
	public void setId_anexo1(Long id_anexo1) {
		this.id_anexo1 = id_anexo1;
	}
	public String getEstado_firma() {
		return estado_firma;
	}
	public void setEstado_firma(String estado_firma) {
		this.estado_firma = estado_firma;
	}
	public String getUrl_doc() {
		return url_doc;
	}
	public void setUrl_doc(String url_doc) {
		this.url_doc = url_doc;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public List<A1_PlanFormacion> getDetFormaciones() {
		return DetFormaciones;
	}
	public void setDetFormaciones(List<A1_PlanFormacion> detFormaciones) {
		DetFormaciones = detFormaciones;
	}
	public List<A1_PlanRotacion> getDetRotaciones() {
		return DetRotaciones;
	}
	public void setDetRotaciones(List<A1_PlanRotacion> detRotaciones) {
		DetRotaciones = detRotaciones;
	}
	

	
}
