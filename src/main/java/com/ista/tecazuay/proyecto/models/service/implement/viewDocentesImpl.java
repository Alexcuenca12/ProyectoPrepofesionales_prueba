package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.tecazuay.proyecto.models.primary.entity.viewDocentes;
import com.ista.tecazuay.proyecto.models.primary.entity.viewPracticantes;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IviewDocentesDao;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IviewPracticantesDao;
import com.ista.tecazuay.proyecto.models.service.IviewDocentesService;

@Service
public class viewDocentesImpl implements IviewDocentesService{

	@Autowired
	private IviewDocentesDao viewDocentesDao;

	public List<viewDocentes> findAll() {
		// TODO Auto-generated method stub
		return (List<viewDocentes>)viewDocentesDao.findAll();
	}
	
	

}
