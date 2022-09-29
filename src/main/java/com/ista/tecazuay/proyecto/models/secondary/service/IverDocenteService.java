package com.ista.tecazuay.proyecto.models.secondary.service;

import java.util.List;
import com.ista.tecazuay.proyecto.models.secondary.entity.verDocentes;

public interface IverDocenteService {
	
	public List<verDocentes> findAll();
	public verDocentes findById(Long id_persona);
}
