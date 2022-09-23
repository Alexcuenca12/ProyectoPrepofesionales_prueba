package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.Representante;

public interface IRepresentanteService {

	public List<Representante> findAll();

	public Representante save(Representante representante);

	public Representante findById(Long id);

	public void delete(Long id);
}
