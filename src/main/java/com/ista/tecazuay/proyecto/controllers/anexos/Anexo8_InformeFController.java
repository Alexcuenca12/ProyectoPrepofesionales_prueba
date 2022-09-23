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

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo8_InformeF;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo8_InformeFService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class Anexo8_InformeFController {

	@Autowired
	private IAnexo8_InformeFService Anexo8_InformeFService;

	// LISTAR
	@GetMapping("/ListAnexo8")
	public List<Anexo8_InformeF> index() {

		return Anexo8_InformeFService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchAnexo8/{id}")
	public Anexo8_InformeF show(@PathVariable Long id) {

		return Anexo8_InformeFService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveAnexo8")
	@ResponseStatus(HttpStatus.CREATED)
	public Anexo8_InformeF create(@RequestBody Anexo8_InformeF anexo8) {

		return Anexo8_InformeFService.save(anexo8);
	}

	// EDITAR
	@PutMapping("/EditAnexo8/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Anexo8_InformeF update(@RequestBody Anexo8_InformeF anexo8, @PathVariable Long id) {

		Anexo8_InformeF Anexo8_InformeFActual = Anexo8_InformeFService.findById(id);
		Anexo8_InformeFActual.setApellido(anexo8.getApellido());
		Anexo8_InformeFActual.setNombre(anexo8.getNombre());
		Anexo8_InformeFActual.setEmail(anexo8.getEmail());

		return Anexo8_InformeFService.save(Anexo8_InformeFActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteAnexo8/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		Anexo8_InformeFService.delete(id);
	}
}
