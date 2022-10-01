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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ista.tecazuay.proyecto.models.primary.entity.Rol;
import com.ista.tecazuay.proyecto.models.primary.entity.Usuario;
import com.ista.tecazuay.proyecto.models.primary.entity.UsuarioRol;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IUsuariosRepositoryDao;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IverDocenteDao;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IviewAlumnosDao;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IviewCoordinadoresDao;
import com.ista.tecazuay.proyecto.models.repository.secondary.dao.IVerpersonafDao;
import com.ista.tecazuay.proyecto.models.service.IUsuarioService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	IVerpersonafDao personaFenix;

	@Autowired
	IverDocenteDao docenteFenix;

	@Autowired
	IviewCoordinadoresDao coordinadorFenix;

	@Autowired
	IviewAlumnosDao alumnoFenix;

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
	@PostMapping("/signup")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) throws Exception {

		Rol rol = new Rol();
		Set<UsuarioRol> userRoles = new HashSet<>();

		// VERIFICAR SI HAY EXISTENCIA DE USUARIO EN NUESTRA BD..
		if (!userRepository.existsByCedula(usuario.getCedula())) {

			// VERIFICAR EXISTENCIA DE LA PERSONA EN LA BD DEL ISTA..
			if (personaFenix.existsByCedula(usuario.getCedula())) {

				// SE COMPRUEBA QUE NO SE REGISTRE UN CORREO PREVIAMENTE REGISTRADO..
				if (!userRepository.existsByCorreo(usuario.getCorreo())) {

					// COMPROBAR SI LA CEDULA INGRESADA PERTENENCE A UN COORDINADOR
					if (coordinadorFenix.existsByCedula(usuario.getCedula())) {

						rol.setRolId(1L);
						rol.setRolNombre("COORDINADOR");
						UsuarioRol usuarioRol = new UsuarioRol();
						usuarioRol.setUsuario(usuario);
						usuarioRol.setRol(rol);

						userRoles.add(usuarioRol);
						return UsuarioService.save(usuario, userRoles);

						// COMPROBAR SI LA CEDULA INGRESADA PERTENENCE A UN DOCENTE
					} else if (alumnoFenix.existsByCedula(usuario.getCedula())) {

						rol.setRolId(2L);
						rol.setRolNombre("ESTUDIANTE");
						UsuarioRol usuarioRol = new UsuarioRol();
						usuarioRol.setUsuario(usuario);
						usuarioRol.setRol(rol);

						userRoles.add(usuarioRol);
						return UsuarioService.save(usuario, userRoles);

					} else {

						throw new Exception("Error: No existe rol!");

					}

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

	// ELIMINAR
	@DeleteMapping("/DeleteUser/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {

		UsuarioService.delete(id);
	}

	@PostMapping("/signin")
	public ResponseEntity<?> IniciarSesion(@RequestBody Usuario usuario) throws Exception {
		// COMPROBAR SI EXISTE EL NOMBRE DE USUARIO EN NUESTRA BD..
		if (userRepository.existsByCedula(usuario.getCedula())) {

			// COMPROBAR SI CONINCIDE USUARIO Y CONTRASEÑA EN NUESTRA BD..
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
