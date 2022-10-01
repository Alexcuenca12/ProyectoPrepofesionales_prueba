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

import com.ista.tecazuay.proyecto.models.primary.entity.ResponsableCarrera;
import com.ista.tecazuay.proyecto.models.service.IResponsableCarreraService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/api")
public class ResponsableCarreraController {

	@Autowired
	private IResponsableCarreraService RepresentanteService;

	// LISTAR
	@GetMapping("/ListRepresentante")
	public List<ResponsableCarrera> index() {

		return RepresentanteService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchRepresentante/{id}")
	public ResponsableCarrera show(@PathVariable Long id) {

		return RepresentanteService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveRepresentante")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponsableCarrera create(@RequestBody ResponsableCarrera representante) {

		return RepresentanteService.save(representante);
	}

	// EDITAR
	@PutMapping("/EditRepresentante/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponsableCarrera update(@RequestBody ResponsableCarrera representante, @PathVariable Long id) {

		ResponsableCarrera RepresentanteActual = RepresentanteService.findById(id);
		RepresentanteActual.setNombre(representante.getNombre());
		RepresentanteActual.setApellido(representante.getApellido());
		RepresentanteActual.setCorreo(representante.getCorreo());
		RepresentanteActual.setDireccion(representante.getDireccion());
		RepresentanteActual.setTelefono(representante.getTelefono());

		return RepresentanteService.save(RepresentanteActual);
	}

	// ELIMINAR
	@DeleteMapping("/DeleteRepresentante/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		RepresentanteService.delete(id);
	}
}
