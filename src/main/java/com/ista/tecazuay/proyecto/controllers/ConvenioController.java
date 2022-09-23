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

import com.ista.tecazuay.proyecto.models.primary.entity.Convenio;
import com.ista.tecazuay.proyecto.models.service.IConvenioService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ConvenioController {

	@Autowired
	private IConvenioService ConvenioService;

	// LISTAR
	@GetMapping("/ListConvenio")
	public List<Convenio> index() {

		return ConvenioService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchConvenio/{id}")
	public Convenio show(@PathVariable Long id) {

		return ConvenioService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveConvenio")
	@ResponseStatus(HttpStatus.CREATED)
	public Convenio create(@RequestBody Convenio convenio) {

		return ConvenioService.save(convenio);
	}

	// EDITAR
	@PutMapping("/EditConvenio/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Convenio update(@RequestBody Convenio convenio, @PathVariable Long id) {

		Convenio ConvenioActual = ConvenioService.findById(id);
		ConvenioActual.setApellido(convenio.getApellido());
		ConvenioActual.setNombre(convenio.getNombre());
		ConvenioActual.setEmail(convenio.getEmail());

		return ConvenioService.save(ConvenioActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteConvenio/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		ConvenioService.delete(id);
	}
}
