package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.ResponsableCarrera;

public interface IResponsableCarreraService {

	public List<ResponsableCarrera> findAll();

	public ResponsableCarrera save(ResponsableCarrera representante);

	public ResponsableCarrera findById(Long id);

	public void delete(Long id);
}
