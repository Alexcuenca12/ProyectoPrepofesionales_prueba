package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.viewAlumnosI;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IviewAlumnosDao;
import com.ista.tecazuay.proyecto.models.service.IviewAlumnosService;

@Service
public class viewAlumnosServiceImpl implements IviewAlumnosService{

	@Autowired
	private IviewAlumnosDao alumnosDao;

	@Override
	@Transactional(readOnly = true)
	public List<viewAlumnosI> findAll() {
	
		return (List<viewAlumnosI>)alumnosDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public viewAlumnosI findByIdentificaion(String identificacion) {

		return alumnosDao.findById(identificacion).orElse(null);
	}
}
