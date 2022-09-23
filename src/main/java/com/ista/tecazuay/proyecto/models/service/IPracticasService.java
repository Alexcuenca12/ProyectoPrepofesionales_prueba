package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.Practicas;

public interface IPracticasService {

	public List<Practicas> findAll();

	public Practicas save(Practicas practicas);

	public Practicas findById(Long id);

	public void delete(Long id);
}
