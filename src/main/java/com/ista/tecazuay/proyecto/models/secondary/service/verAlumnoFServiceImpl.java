package com.ista.tecazuay.proyecto.models.secondary.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.repository.secondary.dao.IverAlumnoFDao;
import com.ista.tecazuay.proyecto.models.secondary.entity.veralumnosf;

import java.util.List;

@Service
public class verAlumnoFServiceImpl implements IverAlumnoFService{
	@Autowired
	private IverAlumnoFDao alumnoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List <veralumnosf> findAll(){
		return (List <veralumnosf>)alumnoDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public veralumnosf findById (String per_identificacion) {
		return alumnoDao.findById(per_identificacion).orElse(null);
	}
	

}
