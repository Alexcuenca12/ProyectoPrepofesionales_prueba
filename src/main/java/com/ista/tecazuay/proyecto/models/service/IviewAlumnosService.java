package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.viewAlumnosI;

public interface IviewAlumnosService {

	public List<viewAlumnosI> findAll();

	viewAlumnosI findByIdentificaion(String identificacion);

}
