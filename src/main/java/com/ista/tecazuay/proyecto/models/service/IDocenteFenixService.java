package com.ista.tecazuay.proyecto.models.service;

import com.ista.tecazuay.proyecto.models.secondary.entity.verpersonaf;

import java.util.List;

public interface IDocenteFenixService {
	
	public List<verpersonaf> findAll();

	public verpersonaf findById(String cedula);

}
