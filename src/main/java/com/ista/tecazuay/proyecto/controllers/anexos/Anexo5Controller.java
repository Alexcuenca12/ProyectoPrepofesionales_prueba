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

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo5;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo5Service;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class Anexo5Controller {

	@Autowired
	private IAnexo5Service Anexo5Service;

	// LISTAR
	@GetMapping("/ListAnexo5")
	public List<Anexo5> index() {

		return Anexo5Service.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchAnexo5/{id}")
	public Anexo5 show(@PathVariable Long id) {

		return Anexo5Service.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveAnexo5")
	@ResponseStatus(HttpStatus.CREATED)
	public Anexo5 create(@RequestBody Anexo5 anexo5) {

		return Anexo5Service.save(anexo5);
	}

	// EDITAR
	@PutMapping("/EditAnexo5/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Anexo5 update(@RequestBody Anexo5 anexo5, @PathVariable Long id) {

		Anexo5 Anexo5Actual = Anexo5Service.findById(id);
		Anexo5Actual.setApellido(anexo5.getApellido());
		Anexo5Actual.setNombre(anexo5.getNombre());
		Anexo5Actual.setEmail(anexo5.getEmail());

		return Anexo5Service.save(Anexo5Actual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteAnexo5/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		Anexo5Service.delete(id);
	}
}
