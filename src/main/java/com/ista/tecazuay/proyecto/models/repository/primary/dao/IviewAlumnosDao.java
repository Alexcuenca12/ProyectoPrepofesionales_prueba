package com.ista.tecazuay.proyecto.models.repository.primary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.tecazuay.proyecto.models.primary.entity.viewAlumnosI;

public interface IviewAlumnosDao extends JpaRepository<viewAlumnosI, String>{

	Boolean existsByCedula(String cedula);
}
