package com.ista.tecazuay.proyecto.models.service.anexos;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo3;

public interface IAnexo3Service {

	public List<Anexo3> findAll();

	public Anexo3 save(Anexo3 anexo3);

	public Anexo3 findById(Long id);

	public void delete(Long id);
}
