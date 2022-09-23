package com.ista.tecazuay.proyecto.models.repository.primary.dao;

import com.ista.tecazuay.proyecto.models.primary.entity.ERol;
import com.ista.tecazuay.proyecto.models.primary.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IRolRepositoryDao extends JpaRepository<Rol,Long> {

    public Rol findByNombre(ERol nombre);

    //Optional<Rol> findByName(ERol name);
}
