package com.ista.tecazuay.proyecto.models.service.anexos;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.A1_PlanFormacion;


public interface IA1_PlanFormacionService {
	
	public List<A1_PlanFormacion> findAll();

	public A1_PlanFormacion save(A1_PlanFormacion a1_PlanFormacion);

	public A1_PlanFormacion findById(Long id);

	public void delete(Long id);
}
