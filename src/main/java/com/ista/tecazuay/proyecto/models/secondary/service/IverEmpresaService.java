package com.ista.tecazuay.proyecto.models.secondary.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.secondary.entity.verEmpresas;

public interface IverEmpresaService {
	
	public List<verEmpresas> findAll();
	
	public int findByName(String name);
	
}
