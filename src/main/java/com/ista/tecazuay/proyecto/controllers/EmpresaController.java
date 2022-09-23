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

import com.ista.tecazuay.proyecto.models.primary.entity.Empresa;
import com.ista.tecazuay.proyecto.models.service.IEmpresaService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class EmpresaController {

	@Autowired
	private IEmpresaService EmpresaService;

	// LISTAR
	@GetMapping("/ListEmpresa")
	public List<Empresa> index() {

		return EmpresaService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchEmpresa/{id}")
	public Empresa show(@PathVariable Long id) {

		return EmpresaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveEmpresa")
	@ResponseStatus(HttpStatus.CREATED)
	public Empresa create(@RequestBody Empresa empresa) {

		return EmpresaService.save(empresa);
	}

	// EDITAR
	@PutMapping("/EditEmpresa/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Empresa update(@RequestBody Empresa empresa, @PathVariable Long id) {

		Empresa EmpresaActual = EmpresaService.findById(id);
		EmpresaActual.setApellido(empresa.getApellido());
		EmpresaActual.setNombre(empresa.getNombre());
		EmpresaActual.setEmail(empresa.getEmail());

		return EmpresaService.save(EmpresaActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteEmpresa/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		EmpresaService.delete(id);
	}
}
