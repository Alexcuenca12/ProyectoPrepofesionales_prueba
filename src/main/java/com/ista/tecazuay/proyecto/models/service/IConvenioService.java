package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.Convenio;

public interface IConvenioService {

	public List<Convenio> findAll();

	public Convenio save(Convenio convenio);

	public Convenio findById(Long id);

	public void delete(Long id);
}
