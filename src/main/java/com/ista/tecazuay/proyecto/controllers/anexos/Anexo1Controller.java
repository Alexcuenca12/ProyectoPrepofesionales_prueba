package com.ista.tecazuay.proyecto.controllers.anexos;

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

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo1;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo1Service;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class Anexo1Controller {

	@Autowired
	private IAnexo1Service Anexo1Service;

	// LISTAR
	@GetMapping("/ListAnexo1")
	public List<Anexo1> index() {

		return Anexo1Service.findAll();
	}
	// LISTAR
		@GetMapping("/ListAnexo1RP/{id_realiza_practica}")
		public List<Anexo1> findbyrealprac(Long id_realiza_practica) {

			return Anexo1Service.findbyrealprac( id_realiza_practica);
		}

	// BUSCAR
	@GetMapping("/SearchAnexo1/{id}")
	public Anexo1 show(@PathVariable Long id) {

		return Anexo1Service.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveAnexo1")
	@ResponseStatus(HttpStatus.CREATED)
	public Anexo1 create(@RequestBody Anexo1 anexo1) {

		return Anexo1Service.save(anexo1);
	}

	// EDITAR
	@PutMapping("/EditAnexo1/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Anexo1 update(@RequestBody Anexo1 anexo1, @PathVariable Long id) {

		Anexo1 Anexo1Actual = Anexo1Service.findById(id);
		Anexo1Actual.setApellido(anexo1.getApellido());
		Anexo1Actual.setNombre(anexo1.getNombre());
		Anexo1Actual.setEmail(anexo1.getEmail());

		return Anexo1Service.save(Anexo1Actual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteAnexo1/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		Anexo1Service.delete(id);
	}
}
