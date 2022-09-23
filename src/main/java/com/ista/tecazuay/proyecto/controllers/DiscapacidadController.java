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

import com.ista.tecazuay.proyecto.models.primary.entity.Discapacidad;
import com.ista.tecazuay.proyecto.models.service.IDiscapacidadService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class DiscapacidadController {

	@Autowired
	private IDiscapacidadService DiscapacidadService;

	// LISTAR
	@GetMapping("/ListDiscapacidad")
	public List<Discapacidad> index() {

		return DiscapacidadService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchDiscapacidad/{id}")
	public Discapacidad show(@PathVariable Long id) {

		return DiscapacidadService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveDiscapacidad")
	@ResponseStatus(HttpStatus.CREATED)
	public Discapacidad create(@RequestBody Discapacidad discapacidad) {

		return DiscapacidadService.save(discapacidad);
	}

	// EDITAR
	@PutMapping("/EditDiscapacidad/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Discapacidad update(@RequestBody Discapacidad discapacidad, @PathVariable Long id) {

		Discapacidad DiscapacidadActual = DiscapacidadService.findById(id);
		DiscapacidadActual.setApellido(discapacidad.getApellido());
		DiscapacidadActual.setNombre(discapacidad.getNombre());
		DiscapacidadActual.setEmail(discapacidad.getEmail());

		return DiscapacidadService.save(DiscapacidadActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteDiscapacidad/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		DiscapacidadService.delete(id);
	}
}
