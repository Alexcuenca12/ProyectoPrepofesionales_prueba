package com.ista.tecazuay.proyecto.models.service.anexos;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo8_InformeF;

public interface IAnexo8_InformeFService {

	public List<Anexo8_InformeF> findAll();

	public Anexo8_InformeF save(Anexo8_InformeF anexo8);

	public Anexo8_InformeF findById(Long id);

	public void delete(Long id);
}
