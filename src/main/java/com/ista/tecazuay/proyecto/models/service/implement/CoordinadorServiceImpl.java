package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.Coordinador;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.ICoordinadorDao;
import com.ista.tecazuay.proyecto.models.service.ICoordinadorService;

@Service
public class CoordinadorServiceImpl implements ICoordinadorService {

	@Autowired
	private ICoordinadorDao CoordinadorDao;

	@Override
	@Transactional(readOnly = true)
	public List<Coordinador> findAll() {

		return (List<Coordinador>) CoordinadorDao.findAll();
	}

	@Override
	@Transactional
	public Coordinador save(Coordinador coordinador) {

		return CoordinadorDao.save(coordinador);
	}

	@Override
	@Transactional(readOnly = true)
	public Coordinador findById(Long id) {

		return CoordinadorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		CoordinadorDao.deleteById(id);
	}
}
