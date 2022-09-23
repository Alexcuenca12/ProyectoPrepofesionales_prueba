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

import com.ista.tecazuay.proyecto.models.primary.entity.Usuario;
import com.ista.tecazuay.proyecto.models.service.IUsuarioService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private IUsuarioService UsuarioService;

	// LISTAR
	@GetMapping("/ListUser")
	public List<Usuario> index() {

		return UsuarioService.findAll();
	}

	// BUSCAR
	@GetMapping("/SearchUser/{id}")
	public Usuario show(@PathVariable Long id) {

		return UsuarioService.findById(id);
	}

	// GUARDAR
	@PostMapping("/SaveUser")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {

		return UsuarioService.save(usuario);
	}

	// EDITAR
	@PutMapping("/EditUser/{id}")
	/*@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {

		Usuario UsuarioActual = UsuarioService.findById(id);
		UsuarioActual.setApellido(usuario.getApellido());
		UsuarioActual.setNombre(usuario.getNombre());
		UsuarioActual.setEmail(usuario.getEmail());

		return UsuarioService.save(UsuarioActual);
	}*/

	// ELIMINAR
	@DeleteMapping("/DeleteUser/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		UsuarioService.delete(id);
	}
}
