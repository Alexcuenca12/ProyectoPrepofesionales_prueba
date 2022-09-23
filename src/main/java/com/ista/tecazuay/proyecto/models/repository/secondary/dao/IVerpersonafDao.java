package com.ista.tecazuay.proyecto.models.repository.secondary.dao;

import com.ista.tecazuay.proyecto.models.secondary.entity.verpersonaf;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IVerpersonafDao extends JpaRepository<verpersonaf, String> {

	Boolean existsByCedula(String cedula);

}
