package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.RepresentanteEmpresa;

public interface IRepresentanteEmpresaService {

	public List<RepresentanteEmpresa> findAll();

	RepresentanteEmpresa findByIdentificaion(String identificacion);

	public RepresentanteEmpresa save(RepresentanteEmpresa representanteempresa);

	public RepresentanteEmpresa findById(String id);

	public void delete(String id);
}
