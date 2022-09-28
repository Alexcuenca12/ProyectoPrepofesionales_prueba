package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.RepresentanteEmpresa;

public interface IRepresentanteEmpresaService {

	public List<RepresentanteEmpresa> findAll();

	public RepresentanteEmpresa save(RepresentanteEmpresa representanteempresa);

	public RepresentanteEmpresa findById(Long id);

	public void delete(Long id);
}
