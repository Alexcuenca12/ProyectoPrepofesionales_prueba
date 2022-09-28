package com.ista.tecazuay.proyecto.secondary.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.secondary.entity.veralumnosf;
import com.ista.tecazuay.proyecto.models.secondary.service.IverAlumnoFService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class verAlumnosFRestController {

	@Autowired
	private IverAlumnoFService alumnoService;

	// Metodo para listar Alumnos
	@GetMapping("/listAlumnosF")
	public List<veralumnosf> index() {
		return alumnoService.findAll();
	}

	// Metodo para buscar por id
	@GetMapping("/listAlumnosF/{id}")
	public veralumnosf show(@PathVariable String id) {
		return alumnoService.findById(id);

	}

}
