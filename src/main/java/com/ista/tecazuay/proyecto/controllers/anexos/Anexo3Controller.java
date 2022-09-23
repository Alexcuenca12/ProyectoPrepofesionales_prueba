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

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo3;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo3Service;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class Anexo3Controller {

	@Autowired
	private IAnexo3Service Anexo3Service;

	// LISTAR
	@GetMapping("/ListAnexo3")
	public List<Anexo3> index() {

		return Anexo3Service.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchAnexo3/{id}")
	public Anexo3 show(@PathVariable Long id) {

		return Anexo3Service.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveAnexo3")
	@ResponseStatus(HttpStatus.CREATED)
	public Anexo3 create(@RequestBody Anexo3 anexo3) {

		return Anexo3Service.save(anexo3);
	}

	// EDITAR
	@PutMapping("/EditAnexo3/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Anexo3 update(@RequestBody Anexo3 anexo3, @PathVariable Long id) {

		Anexo3 Anexo3Actual = Anexo3Service.findById(id);
		Anexo3Actual.setApellido(anexo3.getApellido());
		Anexo3Actual.setNombre(anexo3.getNombre());
		Anexo3Actual.setEmail(anexo3.getEmail());

		return Anexo3Service.save(Anexo3Actual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteAnexo3/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		Anexo3Service.delete(id);
	}
}
