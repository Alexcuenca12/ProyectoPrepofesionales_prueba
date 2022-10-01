package com.ista.tecazuay.proyecto.models.repository.primary.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ista.tecazuay.proyecto.models.primary.entity.FileEntity;
@Repository
public interface FileRepository extends CrudRepository<FileEntity, String> {

}
