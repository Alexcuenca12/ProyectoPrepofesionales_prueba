package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.Coordinador;

public interface ICoordinadorService {

	public List<Coordinador> findAll();

	public Coordinador save(Coordinador coordinador);

	public Coordinador findById(Long id);

	public void delete(Long id);
}
