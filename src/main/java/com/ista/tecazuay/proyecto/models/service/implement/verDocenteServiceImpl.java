package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.verDocentes;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IverDocenteDao;
import com.ista.tecazuay.proyecto.models.service.IverDocenteService;

@Service
public class verDocenteServiceImpl implements IverDocenteService {

	@Autowired
	private IverDocenteDao docenteDao;

	@Override
	@Transactional(readOnly = true)
	public List<verDocentes> findAll() {

		return (List<verDocentes>) docenteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public verDocentes findById(Long id_persona) {

		return docenteDao.findById(id_persona).orElse(null);
	}

}
