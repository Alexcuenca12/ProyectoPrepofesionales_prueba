package com.ista.tecazuay.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.primary.entity.viewAlumnosI;
import com.ista.tecazuay.proyecto.models.service.IviewAlumnosService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class viewAlumnosIRestController {

	@Autowired
	private IviewAlumnosService alumnosService;

	@GetMapping("/listvAlumno")
	public List<viewAlumnosI> index() {

		return alumnosService.findAll();
	}

	@GetMapping("/listaAlumnos/{persona_identificacion}")
	public viewAlumnosI buscarXid(@PathVariable String id_persona) {
		return alumnosService.findByIdentificaion(id_persona);

	}
}
