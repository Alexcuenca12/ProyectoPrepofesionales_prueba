package com.ista.tecazuay.proyecto.models.repository.secondary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.tecazuay.proyecto.models.secondary.entity.veralumnosf;

public interface IverAlumnoFDao extends JpaRepository<veralumnosf, String> {
	
	Boolean existsByCedula(String cedula);

}
