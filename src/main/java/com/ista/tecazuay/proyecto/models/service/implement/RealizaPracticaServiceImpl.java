package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.RealizaPractica;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IRealizaPracticaDao;
import com.ista.tecazuay.proyecto.models.service.IRealizaPracticaService;

@Service
public class RealizaPracticaServiceImpl implements IRealizaPracticaService {

	@Autowired
	private IRealizaPracticaDao RealizaPracticaDao;

	@Override
	@Transactional(readOnly = true)
	public List<RealizaPractica> findAll() {

		return (List<RealizaPractica>) RealizaPracticaDao.findAll();
	}

	@Override
	@Transactional
	public RealizaPractica save(RealizaPractica realiza) {

		return RealizaPracticaDao.save(realiza);
	}

	@Override
	@Transactional(readOnly = true)
	public RealizaPractica findById(Long id) {

		return RealizaPracticaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		RealizaPracticaDao.deleteById(id);
	}
}
