package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.viewCoordinadoresI;

public interface IviewCoordinadoresService {

	public List<viewCoordinadoresI> findAll();

	viewCoordinadoresI findByIdentificacion(String identificacion);
}
