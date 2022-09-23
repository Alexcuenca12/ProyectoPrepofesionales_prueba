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

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo2;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo2Service;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class Anexo2Controller {

	@Autowired
	private IAnexo2Service Anexo2Service;

	// LISTAR
	@GetMapping("/ListAnexo2")
	public List<Anexo2> index() {

		return Anexo2Service.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchAnexo2/{id}")
	public Anexo2 show(@PathVariable Long id) {

		return Anexo2Service.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveAnexo2")
	@ResponseStatus(HttpStatus.CREATED)
	public Anexo2 create(@RequestBody Anexo2 anexo2) {

		return Anexo2Service.save(anexo2);
	}

	// EDITAR
	@PutMapping("/EditAnexo2/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Anexo2 update(@RequestBody Anexo2 anexo2, @PathVariable Long id) {

		Anexo2 Anexo2Actual = Anexo2Service.findById(id);
		Anexo2Actual.setApellido(anexo2.getApellido());
		Anexo2Actual.setNombre(anexo2.getNombre());
		Anexo2Actual.setEmail(anexo2.getEmail());

		return Anexo2Service.save(Anexo2Actual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteAnexo2/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		Anexo2Service.delete(id);
	}
}
