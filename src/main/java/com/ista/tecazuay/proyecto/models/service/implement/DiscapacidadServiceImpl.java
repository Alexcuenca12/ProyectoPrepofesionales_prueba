package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.Discapacidad;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IDiscapacidadDao;
import com.ista.tecazuay.proyecto.models.service.IDiscapacidadService;

@Service
public class DiscapacidadServiceImpl implements IDiscapacidadService {

	@Autowired
	private IDiscapacidadDao DiscapacidadDao;

	@Override
	@Transactional(readOnly = true)
	public List<Discapacidad> findAll() {

		return (List<Discapacidad>) DiscapacidadDao.findAll();
	}

	@Override
	@Transactional
	public Discapacidad save(Discapacidad discapacidad) {

		return DiscapacidadDao.save(discapacidad);
	}

	@Override
	@Transactional(readOnly = true)
	public Discapacidad findById(Long id) {

		return DiscapacidadDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		DiscapacidadDao.deleteById(id);
	}
}
