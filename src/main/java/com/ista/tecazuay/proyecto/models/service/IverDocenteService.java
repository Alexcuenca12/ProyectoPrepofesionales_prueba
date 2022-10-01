package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.verDocentes;

public interface IverDocenteService {
	
	public List<verDocentes> findAll();
	public verDocentes findById(Long id_persona);
}
