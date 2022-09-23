package com.ista.tecazuay.proyecto.models.service.anexos;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo4;

public interface IAnexo4Service {

	public List<Anexo4> findAll();

	public Anexo4 save(Anexo4 anexo4);

	public Anexo4 findById(Long id);

	public void delete(Long id);
}
