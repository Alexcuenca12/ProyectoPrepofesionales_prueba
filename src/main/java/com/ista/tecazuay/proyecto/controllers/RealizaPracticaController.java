package com.ista.tecazuay.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.primary.entity.RealizaPractica;
import com.ista.tecazuay.proyecto.models.service.IRealizaPracticaService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class RealizaPracticaController {

	@Autowired
	private IRealizaPracticaService RealizaPracticaService;

	// LISTAR
	@GetMapping("/ListRealizaPrac")
	public List<RealizaPractica> index() {

		return RealizaPracticaService.findAll();
	}
	
	@GetMapping("/ListRealizaPrac/{idconv}")
	public List<RealizaPractica> findbyconv(@PathVariable Long idconv) {

		return RealizaPracticaService.findbyconv(idconv);
	}

	// BUSCAR
	@GetMapping("/SearchRealizaPrac/{id}")
	public RealizaPractica show(@PathVariable Long id) {

		return RealizaPracticaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveRealizaPrac")
	@ResponseStatus(HttpStatus.CREATED)
	public RealizaPractica create(@RequestBody RealizaPractica realiza) {

		return RealizaPracticaService.save(realiza);
	}

	// EDITAR
	@PutMapping("/EditRealizaPrac/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public RealizaPractica update(@RequestBody RealizaPractica realiza, @PathVariable Long id) {

		RealizaPractica RealizaPracticaActual = RealizaPracticaService.findById(id);
		RealizaPracticaActual.setApellido(realiza.getApellido());
		RealizaPracticaActual.setNombre(realiza.getNombre());
		RealizaPracticaActual.setEmail(realiza.getEmail());

		return RealizaPracticaService.save(RealizaPracticaActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteRealizaPrac/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		RealizaPracticaService.delete(id);
	}
}
