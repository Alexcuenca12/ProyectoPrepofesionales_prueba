package com.ista.tecazuay.proyecto.models.repository.primary.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.tecazuay.proyecto.models.primary.entity.viewCoordinadoresI;

public interface IviewCoordinadoresDao extends CrudRepository<viewCoordinadoresI, String>{

	Boolean existsByCedula(String cedula);
}
