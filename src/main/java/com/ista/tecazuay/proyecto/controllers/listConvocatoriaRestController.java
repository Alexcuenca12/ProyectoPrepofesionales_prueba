package com.ista.tecazuay.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.primary.entity.listConvocatorias;
import com.ista.tecazuay.proyecto.models.service.IlistConvocatoriasService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class listConvocatoriaRestController {
	
	@Autowired
	private IlistConvocatoriasService convocatoriasService;
	
	@GetMapping("/listConvEst")
	public List<listConvocatorias> index() {
		// TODO Auto-generated method stub
		return convocatoriasService.findAll();
	}

}
