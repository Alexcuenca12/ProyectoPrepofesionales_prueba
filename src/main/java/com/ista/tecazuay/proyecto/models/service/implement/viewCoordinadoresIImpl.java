package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.tecazuay.proyecto.models.primary.entity.viewCoordinadoresI;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IviewCoordinadoresIDao;
import com.ista.tecazuay.proyecto.models.service.IviewCoordinadoresIService;

@Service
public class viewCoordinadoresIImpl implements IviewCoordinadoresIService{

	@Autowired
	private IviewCoordinadoresIDao viewCoordinadoresIDao;

	@Override
	public List<viewCoordinadoresI> findAll() {
		// TODO Auto-generated method stub
		return (List<viewCoordinadoresI>)viewCoordinadoresIDao.findAll();
	}
}
