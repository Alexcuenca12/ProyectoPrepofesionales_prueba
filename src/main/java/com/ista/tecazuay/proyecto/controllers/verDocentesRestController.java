package com.ista.tecazuay.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.primary.entity.verDocentes;
import com.ista.tecazuay.proyecto.models.service.IverDocenteService;


@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class verDocentesRestController {
	@Autowired
	private IverDocenteService docenteService;
	
	
	//Metodo para listar los docentes 
	@GetMapping("/listaDocentes")
	public List<verDocentes> index(){
		return docenteService.findAll();
	}
	
	@GetMapping("/listaDocentes/{id_persona}")
	public verDocentes buscarXid(@PathVariable Long id_persona) {
		return docenteService.findById(id_persona);
		
	}
	
	
	
	
}
