package com.ista.tecazuay.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.primary.entity.viewCoordinadoresI;
import com.ista.tecazuay.proyecto.models.service.IviewCoordinadoresIService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class viewCoordinadorIRestController {

	@Autowired
	 private IviewCoordinadoresIService coordinadoresService;
	 
	 @GetMapping("/listvCoordinadoresI")
		public List<viewCoordinadoresI> index() {
			// TODO Auto-generated method stub
			return coordinadoresService.findAll();
		}
}
