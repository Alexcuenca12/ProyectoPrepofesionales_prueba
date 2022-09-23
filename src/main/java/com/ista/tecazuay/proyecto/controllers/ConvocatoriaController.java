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

import com.ista.tecazuay.proyecto.models.primary.entity.Convocatoria;
import com.ista.tecazuay.proyecto.models.service.IConvocatoriaService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ConvocatoriaController {

	@Autowired
	private IConvocatoriaService ConvocatoriaService;

	// LISTAR
	@GetMapping("/ListConvocatoria")
	public List<Convocatoria> index() {

		return ConvocatoriaService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchConvocatoria/{id}")
	public Convocatoria show(@PathVariable Long id) {

		return ConvocatoriaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveConvocatoria")
	@ResponseStatus(HttpStatus.CREATED)
	public Convocatoria create(@RequestBody Convocatoria convocatoria) {

		return ConvocatoriaService.save(convocatoria);
	}

	// EDITAR
	@PutMapping("/EditConvocatoria/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Convocatoria update(@RequestBody Convocatoria convocatoria, @PathVariable Long id) {

		Convocatoria ConvocatoriaActual = ConvocatoriaService.findById(id);
		ConvocatoriaActual.setApellido(convocatoria.getApellido());
		ConvocatoriaActual.setNombre(convocatoria.getNombre());
		ConvocatoriaActual.setEmail(convocatoria.getEmail());

		return ConvocatoriaService.save(ConvocatoriaActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteConvocatoria/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		ConvocatoriaService.delete(id);
	}
}
