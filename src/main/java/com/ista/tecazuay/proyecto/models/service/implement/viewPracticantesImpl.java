package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.tecazuay.proyecto.models.primary.entity.viewPracticantes;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IviewPracticantesDao;
import com.ista.tecazuay.proyecto.models.service.IviewPracticantesService;

@Service
public class viewPracticantesImpl implements IviewPracticantesService{
	
	@Autowired
	private IviewPracticantesDao viewPracticantesDao;

	@Override
	public List<viewPracticantes> findAll() {
		// TODO Auto-generated method stub
		return (List<viewPracticantes>)viewPracticantesDao.findAll();
	}
	
	

}
