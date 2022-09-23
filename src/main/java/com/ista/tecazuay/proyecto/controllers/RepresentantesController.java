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

import com.ista.tecazuay.proyecto.models.primary.entity.Representante;
import com.ista.tecazuay.proyecto.models.service.IRepresentanteService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/api")
public class RepresentantesController {

	@Autowired
	private IRepresentanteService RepresentanteService;

	// LISTAR
	@GetMapping("/ListRepresentante")
	public List<Representante> index() {

		return RepresentanteService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchRepresentante/{id}")
	public Representante show(@PathVariable Long id) {

		return RepresentanteService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveRepresentante")
	@ResponseStatus(HttpStatus.CREATED)
	public Representante create(@RequestBody Representante representante) {

		return RepresentanteService.save(representante);
	}

	// EDITAR
	@PutMapping("/EditRepresentante/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Representante update(@RequestBody Representante representante, @PathVariable Long id) {

		Representante RepresentanteActual = RepresentanteService.findById(id);
		RepresentanteActual.setApellido(representante.getApellido());
		RepresentanteActual.setNombre(representante.getNombre());
		RepresentanteActual.setEmail(representante.getEmail());

		return RepresentanteService.save(RepresentanteActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteRepresentante/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		RepresentanteService.delete(id);
	}
}
