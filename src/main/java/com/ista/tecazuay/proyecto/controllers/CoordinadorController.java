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

import com.ista.tecazuay.proyecto.models.primary.entity.Coordinador;
import com.ista.tecazuay.proyecto.models.service.ICoordinadorService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class CoordinadorController {

	@Autowired
	private ICoordinadorService CoordinadorService;

	// LISTAR
	@GetMapping("/ListCoordinador")
	public List<Coordinador> index() {

		return CoordinadorService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchCoordinador/{id}")
	public Coordinador show(@PathVariable Long id) {

		return CoordinadorService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveCoordinador")
	@ResponseStatus(HttpStatus.CREATED)
	public Coordinador create(@RequestBody Coordinador coordinador) {

		return CoordinadorService.save(coordinador);
	}

	// EDITAR
	@PutMapping("/EditCoordinador/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Coordinador update(@RequestBody Coordinador coordinador, @PathVariable Long id) {

		Coordinador CoordinadorActual = CoordinadorService.findById(id);
		CoordinadorActual.setApellido(coordinador.getApellido());
		CoordinadorActual.setNombre(coordinador.getNombre());
		CoordinadorActual.setEmail(coordinador.getEmail());

		return CoordinadorService.save(CoordinadorActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteCoordinador/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		CoordinadorService.delete(id);
	}
}
