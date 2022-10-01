package com.ista.tecazuay.proyecto.models.repository.primary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.tecazuay.proyecto.models.primary.entity.ResponsableCarrera;

public interface IResponsableCarreraDao extends JpaRepository<ResponsableCarrera, String> {

	Boolean existsByCedula(String cedula);
}
