package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.DocenteTutor;

public interface IDocenteTutorService {

	public List<DocenteTutor> findAll();

	public DocenteTutor save(DocenteTutor tutor);

	public DocenteTutor findById(Long id);

	public void delete(Long id);
}
