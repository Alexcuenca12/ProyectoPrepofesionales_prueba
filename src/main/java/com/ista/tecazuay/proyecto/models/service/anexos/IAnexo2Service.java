package com.ista.tecazuay.proyecto.models.service.anexos;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo2;

public interface IAnexo2Service {

	public List<Anexo2> findAll();

	public Anexo2 save(Anexo2 anexo2);

	public Anexo2 findById(Long id);

	public void delete(Long id);
}
