package com.ista.tecazuay.proyecto.models.repository.primary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.tecazuay.proyecto.models.primary.entity.DocenteTutor;

public interface IDocenteTutorDao extends JpaRepository<DocenteTutor, String> {

	Boolean existsByCedula(String cedula);
}
