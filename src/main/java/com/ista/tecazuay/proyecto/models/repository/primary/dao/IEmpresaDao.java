package com.ista.tecazuay.proyecto.models.repository.primary.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.tecazuay.proyecto.models.primary.entity.Empresa;

public interface IEmpresaDao extends CrudRepository<Empresa, Long> {

}
