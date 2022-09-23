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

import com.ista.tecazuay.proyecto.models.primary.entity.Practicas;
import com.ista.tecazuay.proyecto.models.service.IPracticasService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PracticasController {

	@Autowired
	private IPracticasService PracticasService;

	// LISTAR
	@GetMapping("/ListPracticas")
	public List<Practicas> index() {

		return PracticasService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchPracticas/{id}")
	public Practicas show(@PathVariable Long id) {

		return PracticasService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SavePracticas")
	@ResponseStatus(HttpStatus.CREATED)
	public Practicas create(@RequestBody Practicas practicas) {

		return PracticasService.save(practicas);
	}

	// EDITAR
	@PutMapping("/EditPracticas/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Practicas update(@RequestBody Practicas practicas, @PathVariable Long id) {

		Practicas PracticasActual = PracticasService.findById(id);
		PracticasActual.setApellido(practicas.getApellido());
		PracticasActual.setNombre(practicas.getNombre());
		PracticasActual.setEmail(practicas.getEmail());

		return PracticasService.save(PracticasActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeletePracticas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		PracticasService.delete(id);
	}
}
