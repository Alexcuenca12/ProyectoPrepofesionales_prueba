package com.ista.tecazuay.proyecto.models.service.anexos;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.A1_PlanRotacion;


public interface IA1_PlanRotacionService {
	public List<A1_PlanRotacion> findAll();

	public A1_PlanRotacion save(A1_PlanRotacion a1_PlanRotacion);

	public A1_PlanRotacion findById(Long id);

	public void delete(Long id);
}
