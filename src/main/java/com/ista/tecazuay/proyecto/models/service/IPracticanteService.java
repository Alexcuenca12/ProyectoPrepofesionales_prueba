package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.Practicante;

public interface IPracticanteService {

	public List<Practicante> findAll();
	
	public Practicante save(Practicante practicante);

	public Practicante findById(Long id);

	public void delete(Long id);
}
