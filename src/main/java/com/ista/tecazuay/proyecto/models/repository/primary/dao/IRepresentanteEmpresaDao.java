package com.ista.tecazuay.proyecto.models.repository.primary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ista.tecazuay.proyecto.models.primary.entity.RepresentanteEmpresa;

public interface IRepresentanteEmpresaDao extends JpaRepository<RepresentanteEmpresa, String> {

	Boolean existsByCedula(String cedula);
}
