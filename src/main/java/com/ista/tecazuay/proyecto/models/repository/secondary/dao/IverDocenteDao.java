package com.ista.tecazuay.proyecto.models.repository.secondary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.tecazuay.proyecto.models.secondary.entity.verDocentes;

public interface IverDocenteDao extends JpaRepository<verDocentes,String>{
	
}
