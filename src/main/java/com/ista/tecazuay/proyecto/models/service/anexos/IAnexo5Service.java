package com.ista.tecazuay.proyecto.models.service.anexos;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo5;

public interface IAnexo5Service {

	public List<Anexo5> findAll();

	public Anexo5 save(Anexo5 anexo5);

	public Anexo5 findById(Long id);

	public void delete(Long id);
}
