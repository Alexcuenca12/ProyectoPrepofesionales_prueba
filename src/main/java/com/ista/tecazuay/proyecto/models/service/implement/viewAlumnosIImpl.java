package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.tecazuay.proyecto.models.primary.entity.viewAlumnosI;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IviewAlumnosIDao;
import com.ista.tecazuay.proyecto.models.service.IviewAlumnosIService;

@Service
public class viewAlumnosIImpl implements IviewAlumnosIService{

	@Autowired
	private IviewAlumnosIDao viewAlumnosIDao;

	@Override
	public List<viewAlumnosI> findAll() {
		// TODO Auto-generated method stub
		return (List<viewAlumnosI>)viewAlumnosIDao.findAll();
	}
}
