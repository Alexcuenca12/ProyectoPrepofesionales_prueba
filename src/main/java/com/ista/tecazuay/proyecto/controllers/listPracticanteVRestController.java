package com.ista.tecazuay.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.primary.entity.lista_practicantes_view;
import com.ista.tecazuay.proyecto.models.service.IListaPracticanteVService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class listPracticanteVRestController {
	
	@Autowired
	private IListaPracticanteVService iListaPracticanteVService;
	
	@GetMapping("/listPracticante")
	public List<lista_practicantes_view>index(){
		return iListaPracticanteVService.findAll();
	}
	
	

}
