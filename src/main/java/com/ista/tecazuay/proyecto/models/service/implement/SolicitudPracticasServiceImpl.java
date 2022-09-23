package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.SolicitudPracticas;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.ISolicitudPracticasDao;
import com.ista.tecazuay.proyecto.models.service.ISolicitudPracticasService;

@Service
public class SolicitudPracticasServiceImpl implements ISolicitudPracticasService {

	@Autowired
	private ISolicitudPracticasDao SolicitudPracticasDao;

	@Override
	@Transactional(readOnly = true)
	public List<SolicitudPracticas> findAll() {

		return (List<SolicitudPracticas>) SolicitudPracticasDao.findAll();
	}

	@Override
	@Transactional
	public SolicitudPracticas save(SolicitudPracticas solicitud) {

		return SolicitudPracticasDao.save(solicitud);
	}

	@Override
	@Transactional(readOnly = true)
	public SolicitudPracticas findById(Long id) {

		return SolicitudPracticasDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		SolicitudPracticasDao.deleteById(id);
	}
}
