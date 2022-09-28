package com.ista.tecazuay.proyecto.models.repository.primary.dao;

import com.ista.tecazuay.proyecto.models.primary.entity.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariosRepositoryDao extends JpaRepository<Usuario, Long> {

	public Usuario findByCedula(String cedula);

	Boolean existsByCedula(String cedula);

	public Usuario findByCorreo(String correo);

	Boolean existsByCorreo(String correo);

	// Metodos Query
	@Query(value = "SELECT * FROM usuarios WHERE cedula = ?", nativeQuery = true)
	List<Usuario> buscarUsuario(String cedula);

	public boolean existsByContrasenia(String contrasenia);
}
