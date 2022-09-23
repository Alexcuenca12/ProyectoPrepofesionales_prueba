package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.EnteEmpresarial;

public interface IEnteEmpresarialService {

	public List<EnteEmpresarial> findAll();

	public EnteEmpresarial save(EnteEmpresarial enteEmp);

	public EnteEmpresarial findById(Long id);

	public void delete(Long id);
}
