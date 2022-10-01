package com.ista.tecazuay.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.primary.entity.lista_practicantes_view;
import com.ista.tecazuay.proyecto.models.primary.entity.verEmpresas;
import com.ista.tecazuay.proyecto.models.service.IverEmpresaService;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class verEmpresasFRestController {

	@Autowired
	private IverEmpresaService empresaService;
	
	@GetMapping("/listaEmpresa")
	public List<verEmpresas>index(){
		return empresaService.findAll();
	}
	
	@GetMapping("/listaEmpresa/{name}")
	public int findbyconv(@PathVariable String name) {

		return empresaService.findByName(name);
	}
}
