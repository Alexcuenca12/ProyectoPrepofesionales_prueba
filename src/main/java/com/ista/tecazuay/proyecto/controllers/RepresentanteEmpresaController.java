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

import com.ista.tecazuay.proyecto.models.primary.entity.RepresentanteEmpresa;
import com.ista.tecazuay.proyecto.models.service.IRepresentanteEmpresaService;

	@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
	@RestController
	@RequestMapping("/api")
	public class RepresentanteEmpresaController {

		@Autowired
		private IRepresentanteEmpresaService RepresentanteEmpresaService;

		// LISTAR
		@GetMapping("/ListRepresentanteEmpresa")
		public List<RepresentanteEmpresa> index() {

			return RepresentanteEmpresaService.findAll();
		}

		// BUSCAR
		@GetMapping("/SearchRepresentanteEmpresa/{id}")
		public RepresentanteEmpresa show(@PathVariable Long id) {

			return RepresentanteEmpresaService.findById(id);
		}

		// GUARDAR
		@PostMapping("/SaveRepresentanteEmpresa")
		@ResponseStatus(HttpStatus.CREATED)
		public RepresentanteEmpresa create(@RequestBody RepresentanteEmpresa representanteempresa) {

			return RepresentanteEmpresaService.save(representanteempresa);
		}

		// EDITAR
		@PutMapping("/EditRepresentanteEmpresa/{id}")
		/*@ResponseStatus(HttpStatus.CREATED)
		public Representante update(@RequestBody Representante representante, @PathVariable Long id) {

			Representante RepresentanteActual = RepresentanteService.findById(id);
			RepresentanteActual.setApellido(representante.getApellido());
			RepresentanteActual.setNombre(representante.getNombre());
			RepresentanteActual.setEmail(representante.getEmail());

			return RepresentanteService.save(RepresentanteActual);
		}*/

		// ELIMINAR
		@DeleteMapping("/DeleteRepresentanteEmpresa/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {

			RepresentanteEmpresaService.delete(id);
		}
	}
	

	
	
	

