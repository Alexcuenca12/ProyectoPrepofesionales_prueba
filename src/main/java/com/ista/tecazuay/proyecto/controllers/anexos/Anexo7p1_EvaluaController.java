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

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo7p1_Evalua;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo7p1_EvaluaService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class Anexo7p1_EvaluaController {

	@Autowired
	private IAnexo7p1_EvaluaService Anexo7p1_EvaluaService;

	// LISTAR
	@GetMapping("/ListAnexo7p1")
	public List<Anexo7p1_Evalua> index() {

		return Anexo7p1_EvaluaService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchAnexo7p1/{id}")
	public Anexo7p1_Evalua show(@PathVariable Long id) {

		return Anexo7p1_EvaluaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveAnexo7p1")
	@ResponseStatus(HttpStatus.CREATED)
	public Anexo7p1_Evalua create(@RequestBody Anexo7p1_Evalua anexo7p1) {

		return Anexo7p1_EvaluaService.save(anexo7p1);
	}

	// EDITAR
	@PutMapping("/EditAnexo7p1/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Anexo7p1_Evalua update(@RequestBody Anexo7p1_Evalua anexo7p1, @PathVariable Long id) {

		Anexo7p1_Evalua Anexo7p1_EvaluaActual = Anexo7p1_EvaluaService.findById(id);
		Anexo7p1_EvaluaActual.setApellido(anexo7p1.getApellido());
		Anexo7p1_EvaluaActual.setNombre(anexo7p1.getNombre());
		Anexo7p1_EvaluaActual.setEmail(anexo7p1.getEmail());

		return Anexo7p1_EvaluaService.save(Anexo7p1_EvaluaActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteAnexo7p1/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		Anexo7p1_EvaluaService.delete(id);
	}
}
