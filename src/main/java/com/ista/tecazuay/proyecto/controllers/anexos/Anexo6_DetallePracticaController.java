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

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo6_DetallePractica;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo6_DetallePracticaService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class Anexo6_DetallePracticaController {

	@Autowired
	private IAnexo6_DetallePracticaService Anexo6_DetallePracticaService;

	// LISTAR
	@GetMapping("/ListAnexo6")
	public List<Anexo6_DetallePractica> index() {

		return Anexo6_DetallePracticaService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchAnexo6/{id}")
	public Anexo6_DetallePractica show(@PathVariable Long id) {

		return Anexo6_DetallePracticaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveAnexo6")
	@ResponseStatus(HttpStatus.CREATED)
	public Anexo6_DetallePractica create(@RequestBody Anexo6_DetallePractica anexo6) {

		return Anexo6_DetallePracticaService.save(anexo6);
	}

	// EDITAR
	@PutMapping("/EditAnexo6/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Anexo6_DetallePractica update(@RequestBody Anexo6_DetallePractica anexo6, @PathVariable Long id) {

		Anexo6_DetallePractica Anexo6_DetallePracticaActual = Anexo6_DetallePracticaService.findById(id);
		Anexo6_DetallePracticaActual.setApellido(anexo6.getApellido());
		Anexo6_DetallePracticaActual.setNombre(anexo6.getNombre());
		Anexo6_DetallePracticaActual.setEmail(anexo6.getEmail());

		return Anexo6_DetallePracticaService.save(Anexo6_DetallePracticaActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteAnexo6/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		Anexo6_DetallePracticaService.delete(id);
	}
}
