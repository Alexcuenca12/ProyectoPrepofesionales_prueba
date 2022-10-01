package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.ResponsableCarrera;

public interface IResponsableCarreraService {

	public List<ResponsableCarrera> findAll();

	ResponsableCarrera findByIdentificaion(String identificacion);

	public ResponsableCarrera save(ResponsableCarrera representante);

	public ResponsableCarrera findById(String id);

	public void delete(String id);
}
