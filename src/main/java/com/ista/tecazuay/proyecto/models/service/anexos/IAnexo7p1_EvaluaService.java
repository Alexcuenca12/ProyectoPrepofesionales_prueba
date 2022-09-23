package com.ista.tecazuay.proyecto.models.service.anexos;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo7p1_Evalua;

public interface IAnexo7p1_EvaluaService {

	public List<Anexo7p1_Evalua> findAll();

	public Anexo7p1_Evalua save(Anexo7p1_Evalua anexo7p1);

	public Anexo7p1_Evalua findById(Long id);

	public void delete(Long id);
}
