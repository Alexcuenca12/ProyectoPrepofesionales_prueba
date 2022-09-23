package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.Convocatoria;

public interface IConvocatoriaService {

	public List<Convocatoria> findAll();

	public Convocatoria save(Convocatoria convocatoria);

	public Convocatoria findById(Long id);

	public void delete(Long id);
}
