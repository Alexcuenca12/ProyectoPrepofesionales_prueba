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

import com.ista.tecazuay.proyecto.models.primary.entity.SolicitudPracticas;
import com.ista.tecazuay.proyecto.models.service.ISolicitudPracticasService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class SolicitudPracticasController {

	@Autowired
	private ISolicitudPracticasService SolicitudPracticasService;

	// LISTAR
	@GetMapping("/ListSolicitud")
	public List<SolicitudPracticas> index() {

		return SolicitudPracticasService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchSolicitud/{id}")
	public SolicitudPracticas show(@PathVariable Long id) {

		return SolicitudPracticasService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveSolicitud")
	@ResponseStatus(HttpStatus.CREATED)
	public SolicitudPracticas create(@RequestBody SolicitudPracticas solicitud) {

		return SolicitudPracticasService.save(solicitud);
	}

	// EDITAR
	@PutMapping("/EditSolicitud/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public SolicitudPracticas update(@RequestBody SolicitudPracticas solicitud, @PathVariable Long id) {

		SolicitudPracticas SolicitudPracticasActual = SolicitudPracticasService.findById(id);
		SolicitudPracticasActual.setApellido(solicitud.getApellido());
		SolicitudPracticasActual.setNombre(solicitud.getNombre());
		SolicitudPracticasActual.setEmail(solicitud.getEmail());

		return SolicitudPracticasService.save(SolicitudPracticasActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteSolicitud/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		SolicitudPracticasService.delete(id);
	}
}
