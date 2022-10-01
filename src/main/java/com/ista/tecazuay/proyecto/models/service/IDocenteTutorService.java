package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.DocenteTutor;

public interface IDocenteTutorService {

	public List<DocenteTutor> findAll();

	DocenteTutor findByIdentificaion(String identificacion);

	public DocenteTutor save(DocenteTutor tutor);

	public DocenteTutor findById(String id);

	public void delete(String id);
}
