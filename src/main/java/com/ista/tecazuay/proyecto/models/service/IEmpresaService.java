package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.Empresa;

public interface IEmpresaService {

	public List<Empresa> findAll();

	public Empresa save(Empresa empresa);

	public Empresa findById(Long id);

	public void delete(Long id);
	
}
