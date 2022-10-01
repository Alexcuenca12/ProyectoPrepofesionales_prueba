package com.ista.tecazuay.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.primary.entity.verDocentes;
import com.ista.tecazuay.proyecto.models.primary.entity.viewCoordinadoresI;
import com.ista.tecazuay.proyecto.models.service.IviewCoordinadoresService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class viewCoordinadorIRestController {

	@Autowired
	private IviewCoordinadoresService coordinadoresService;

	@GetMapping("/ListCoordinadores")
	public List<viewCoordinadoresI> index() {
		// TODO Auto-generated method stub
		return coordinadoresService.findAll();
	}

	@GetMapping("/ListaCoordinadores/{persona_identificacion}")
	public viewCoordinadoresI buscarXid(@PathVariable String id_persona) {
		return coordinadoresService.findByIdentificacion(id_persona);

	}
}
