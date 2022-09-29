package com.ista.tecazuay.proyecto.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.ista.tecazuay.proyecto.models.primary.entity.Rol;
import com.ista.tecazuay.proyecto.models.primary.entity.Usuario;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IUsuariosRepositoryDao;
import com.ista.tecazuay.proyecto.models.repository.secondary.dao.IVerpersonafDao;
import com.ista.tecazuay.proyecto.models.service.IUsuarioService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	IVerpersonafDao personaFenix;

	@Autowired
	IUsuariosRepositoryDao userRepository;

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
	public Usuario create(@RequestBody Usuario usuario) throws Exception {

		// verificando si esa en nuestra bd..
		if (!userRepository.existsByCedula(usuario.getCedula())) {

			// verificando si el usuario que va registrarse esta en Fenix..
			if (personaFenix.existsByCedula(usuario.getCedula())) {

				// comprobando que no se ingrese un correo que ya fue ingresado..
				if (!userRepository.existsByCorreo(usuario.getCorreo())) {

					return UsuarioService.save(usuario);

				} else {

					throw new Exception("Error: Usted no puede ingresar un correo existente!");
				}

			} else {

				throw new Exception("Error: El usuario no esta en FENIX!");
			}

		} else {

			throw new Exception("Error: Usuario ya esta en la BD!");
		}

	}

	// EDITAR
	@PutMapping("/EditUser/{id}")
	/*
	 * @ResponseStatus(HttpStatus.CREATED) public Usuario update(@RequestBody
	 * Usuario usuario, @PathVariable Long id) {
	 * 
	 * Usuario UsuarioActual = UsuarioService.findById(id);
	 * UsuarioActual.setApellido(usuario.getApellido());
	 * UsuarioActual.setNombre(usuario.getNombre());
	 * UsuarioActual.setEmail(usuario.getEmail());
	 * 
	 * return UsuarioService.save(UsuarioActual); }
	 */

	// ELIMINAR
	@DeleteMapping("/DeleteUser/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		UsuarioService.delete(id);
	}

	@PostMapping("/signin")
	public ResponseEntity<?> IniciarSesion(@RequestBody Usuario usuario) throws Exception {
		// Estamos verificando si esa en nuestra bd..
		if (userRepository.existsByCedula(usuario.getCedula())) {

			// Estamos comprobando que no se ingrese un correo que ya fue ingresado..
			if (userRepository.existsByContrasenia(usuario.getContrasenia())) {

				return null;

			} else {

				throw new Exception("Error: Datos Erroneos!");
			}

		} else {

			throw new Exception("Error: Datos Erroneos!");
		}
	}

}
