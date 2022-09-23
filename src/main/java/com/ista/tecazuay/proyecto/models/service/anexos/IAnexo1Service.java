package com.ista.tecazuay.proyecto.models.service.anexos;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo1;

public interface IAnexo1Service {

	public List<Anexo1> findAll();

	public Anexo1 save(Anexo1 anexo1);

	public Anexo1 findById(Long id);

	public void delete(Long id);
}
