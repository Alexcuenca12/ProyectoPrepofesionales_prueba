package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.MateriaAprobada;

public interface IMateriaAprobadaService {

	public List<MateriaAprobada> findAll();

	public MateriaAprobada save(MateriaAprobada materia);

	public MateriaAprobada findById(Long id);

	public void delete(Long id);
}
