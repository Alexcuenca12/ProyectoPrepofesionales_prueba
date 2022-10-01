package com.ista.tecazuay.proyecto.models.service;

import java.util.List;
import java.util.Set;

import com.ista.tecazuay.proyecto.models.primary.entity.Usuario;
import com.ista.tecazuay.proyecto.models.primary.entity.UsuarioRol;

public interface IUsuarioService {

	public List<Usuario> findAll();

	public Usuario save(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

	public Usuario findById(Long id);

	public void delete(Long id);
}
