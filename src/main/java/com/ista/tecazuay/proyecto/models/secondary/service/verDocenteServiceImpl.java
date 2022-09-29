package com.ista.tecazuay.proyecto.models.secondary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.repository.secondary.dao.IverDocenteDao;
import com.ista.tecazuay.proyecto.models.secondary.entity.verDocentes;

@Service
public class verDocenteServiceImpl implements IverDocenteService {
	
	@Autowired
	private IverDocenteDao docenteDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<verDocentes> findAll() {
		// TODO Auto-generated method stub
		return (List<verDocentes>)docenteDao.findAll();
	}

	@Override
	@Transactional (readOnly=true)
	public verDocentes findById(Long id_persona) {
		// TODO Auto-generated method stub
		return docenteDao.findById(id_persona).orElse(null);
	}

	


}
