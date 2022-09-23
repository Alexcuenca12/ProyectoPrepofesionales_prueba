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

import com.ista.tecazuay.proyecto.models.primary.entity.MateriaAprobada;
import com.ista.tecazuay.proyecto.models.service.IMateriaAprobadaService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class MateriaAprobadaController {

	@Autowired
	private IMateriaAprobadaService MateriaAprobadaService;

	// LISTAR
	@GetMapping("/ListMateria")
	public List<MateriaAprobada> index() {

		return MateriaAprobadaService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchMateria/{id}")
	public MateriaAprobada show(@PathVariable Long id) {

		return MateriaAprobadaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveMateria")
	@ResponseStatus(HttpStatus.CREATED)
	public MateriaAprobada create(@RequestBody MateriaAprobada materia) {

		return MateriaAprobadaService.save(materia);
	}

	// EDITAR
	@PutMapping("/EditMateria/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public MateriaAprobada update(@RequestBody MateriaAprobada materia, @PathVariable Long id) {

		MateriaAprobada MateriaAprobadaActual = MateriaAprobadaService.findById(id);
		MateriaAprobadaActual.setApellido(materia.getApellido());
		MateriaAprobadaActual.setNombre(materia.getNombre());
		MateriaAprobadaActual.setEmail(materia.getEmail());

		return MateriaAprobadaService.save(MateriaAprobadaActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteMateria/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		MateriaAprobadaService.delete(id);
	}
}
