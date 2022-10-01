package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.verEmpresas;


public interface IverEmpresaService {
	
	public List<verEmpresas> findAll();
	
	public int findByName(String name);
	
}
