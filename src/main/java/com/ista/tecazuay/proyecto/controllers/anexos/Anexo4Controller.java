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

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo4;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo4Service;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class Anexo4Controller {

	@Autowired
	private IAnexo4Service Anexo4Service;

	// LISTAR
	@GetMapping("/ListAnexo4")
	public List<Anexo4> index() {

		return Anexo4Service.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchAnexo4/{id}")
	public Anexo4 show(@PathVariable Long id) {

		return Anexo4Service.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveAnexo4")
	@ResponseStatus(HttpStatus.CREATED)
	public Anexo4 create(@RequestBody Anexo4 anexo4) {

		return Anexo4Service.save(anexo4);
	}

	// EDITAR
	@PutMapping("/EditAnexo4/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Anexo4 update(@RequestBody Anexo4 anexo4, @PathVariable Long id) {

		Anexo4 Anexo4Actual = Anexo4Service.findById(id);
		Anexo4Actual.setApellido(anexo4.getApellido());
		Anexo4Actual.setNombre(anexo4.getNombre());
		Anexo4Actual.setEmail(anexo4.getEmail());

		return Anexo4Service.save(Anexo4Actual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteAnexo4/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		Anexo4Service.delete(id);
	}
}
