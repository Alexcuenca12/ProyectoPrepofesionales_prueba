package com.ista.tecazuay.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.primary.entity.viewPracticantes;
import com.ista.tecazuay.proyecto.models.service.IviewPracticantesService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class viewPracticantesRestController{
	
 @Autowired
 private IviewPracticantesService practicantesService;
 
 @GetMapping("/listPracticanteM")
	public List<viewPracticantes> index() {
		// TODO Auto-generated method stub
		return practicantesService.findAll();
	}
	

}
