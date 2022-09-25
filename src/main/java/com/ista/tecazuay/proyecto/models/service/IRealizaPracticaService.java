package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.RealizaPractica;

public interface IRealizaPracticaService {

	public List<RealizaPractica> findAll();
	public List<RealizaPractica> findbyconv(Long idconv);

	public RealizaPractica save(RealizaPractica realiza);

	public RealizaPractica findById(Long id);

	public void delete(Long id);
}
