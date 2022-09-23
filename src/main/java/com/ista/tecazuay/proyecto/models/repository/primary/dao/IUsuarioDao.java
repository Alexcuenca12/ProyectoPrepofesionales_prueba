package com.ista.tecazuay.proyecto.models.repository.primary.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.tecazuay.proyecto.models.primary.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
