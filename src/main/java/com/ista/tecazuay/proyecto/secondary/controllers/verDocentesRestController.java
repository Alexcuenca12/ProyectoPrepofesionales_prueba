package com.ista.tecazuay.proyecto.secondary.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ista.tecazuay.proyecto.models.secondary.entity.verDocentes;
import com.ista.tecazuay.proyecto.models.secondary.service.IverDocenteService;

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
	
}
