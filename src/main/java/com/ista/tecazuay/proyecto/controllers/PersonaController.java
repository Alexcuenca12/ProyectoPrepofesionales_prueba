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

import com.ista.tecazuay.proyecto.models.primary.entity.Persona;
import com.ista.tecazuay.proyecto.models.service.IPersonaService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PersonaController {

	@Autowired
	private IPersonaService PersonaService;

	// LISTAR
	@GetMapping("/ListPerson")
	public List<Persona> index() {

		return PersonaService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchPerson/{id}")
	public Persona show(@PathVariable Long id) {

		return PersonaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SavePerson")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona create(@RequestBody Persona persona) {

		return PersonaService.save(persona);
	}

	// EDITAR
	@PutMapping("/EditPerson/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Persona update(@RequestBody Persona persona, @PathVariable Long id) {

		Persona PersonaActual = PersonaService.findById(id);
		PersonaActual.setApellido(Persona.getApellido());
		PersonaActual.setNombre(Persona.getNombre());
		PersonaActual.setEmail(Persona.getEmail());

		return PersonaService.save(PersonaActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeletePerson/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		PersonaService.delete(id);
	}
}
