package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.SolicitudPracticas;

public interface ISolicitudPracticasService {

	public List<SolicitudPracticas> findAll();

	public SolicitudPracticas save(SolicitudPracticas solicitud);

	public SolicitudPracticas findById(Long id);

	public void delete(Long id);
}
