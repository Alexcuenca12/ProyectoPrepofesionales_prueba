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

import com.ista.tecazuay.proyecto.models.primary.entity.Practicante;
import com.ista.tecazuay.proyecto.models.service.IPracticanteService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PracticantesController {

	@Autowired
	private IPracticanteService PracticanteService;

	// LISTAR
	@GetMapping("/ListPracticante")
	public List<Practicante> index() {

		return PracticanteService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchPracticante/{id}")
	public Practicante show(@PathVariable Long id) {

		return PracticanteService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SavePracticante")
	@ResponseStatus(HttpStatus.CREATED)
	public Practicante create(@RequestBody Practicante practicante) {

		return PracticanteService.save(practicante);
	}

	// EDITAR
	@PutMapping("/EditPracticante/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Practicante update(@RequestBody Practicante practicante, @PathVariable Long id) {

		Practicante PracticanteActual = PracticanteService.findById(id);
		PracticanteActual.setApellido(practicante.getApellido());
		PracticanteActual.setNombre(practicante.getNombre());
		PracticanteActual.setEmail(practicante.getEmail());

		return PracticanteService.save(PracticanteActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeletePracticante/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		PracticanteService.delete(id);
	}
}
