package com.ista.tecazuay.proyecto.models.secondary.service;

import java.util.List;


import com.ista.tecazuay.proyecto.models.secondary.entity.veralumnosf;

public interface IverAlumnoFService {
	
	public List<veralumnosf> findAll();
	public veralumnosf findById(String id);

}
