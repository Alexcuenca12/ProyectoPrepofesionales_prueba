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

import com.ista.tecazuay.proyecto.models.primary.entity.EnteEmpresarial;
import com.ista.tecazuay.proyecto.models.service.IEnteEmpresarialService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class EnteEmpresarialController {

	@Autowired
	private IEnteEmpresarialService EnteEmpresarialService;

	// LISTAR
	@GetMapping("/ListEnteEmp")
	public List<EnteEmpresarial> index() {

		return EnteEmpresarialService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchEnteEmp/{id}")
	public EnteEmpresarial show(@PathVariable Long id) {

		return EnteEmpresarialService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveEnteEmp")
	@ResponseStatus(HttpStatus.CREATED)
	public EnteEmpresarial create(@RequestBody EnteEmpresarial enteEmp) {

		return EnteEmpresarialService.save(enteEmp);
	}

	// EDITAR
	@PutMapping("/EditEnteEmp/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public EnteEmpresarial update(@RequestBody EnteEmpresarial enteEmp, @PathVariable Long id) {

		EnteEmpresarial EnteEmpresarialActual = EnteEmpresarialService.findById(id);
		EnteEmpresarialActual.setApellido(enteEmp.getApellido());
		EnteEmpresarialActual.setNombre(enteEmp.getNombre());
		EnteEmpresarialActual.setEmail(enteEmp.getEmail());

		return EnteEmpresarialService.save(EnteEmpresarialActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteEnteEmp/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		EnteEmpresarialService.delete(id);
	}
}
