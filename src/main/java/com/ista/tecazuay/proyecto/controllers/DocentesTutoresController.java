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

import com.ista.tecazuay.proyecto.models.primary.entity.DocenteTutor;
import com.ista.tecazuay.proyecto.models.service.IDocenteTutorService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class DocentesTutoresController {

	@Autowired
	private IDocenteTutorService DocenteTutorService;

	// LISTAR
	@GetMapping("/ListTutor")
	public List<DocenteTutor> index() {

		return DocenteTutorService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchTutor/{id}")
	public DocenteTutor show(@PathVariable Long id) {

		return DocenteTutorService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveTutor")
	@ResponseStatus(HttpStatus.CREATED)
	public DocenteTutor create(@RequestBody DocenteTutor tutor) {

		return DocenteTutorService.save(tutor);
	}

	// EDITAR
	@PutMapping("/EditTutor/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public DocenteTutor update(@RequestBody DocenteTutor tutor, @PathVariable Long id) {

		DocenteTutor DocenteTutorActual = DocenteTutorService.findById(id);
		DocenteTutorActual.setApellido(tutor.getApellido());
		DocenteTutorActual.setNombre(tutor.getNombre());
		DocenteTutorActual.setEmail(tutor.getEmail());

		return DocenteTutorService.save(DocenteTutorActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteTutor/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		DocenteTutorService.delete(id);
	}
}
