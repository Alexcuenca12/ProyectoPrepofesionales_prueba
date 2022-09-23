package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.Discapacidad;

public interface IDiscapacidadService {

	public List<Discapacidad> findAll();

	public Discapacidad save(Discapacidad discapacidad);

	public Discapacidad findById(Long id);

	public void delete(Long id);
}
