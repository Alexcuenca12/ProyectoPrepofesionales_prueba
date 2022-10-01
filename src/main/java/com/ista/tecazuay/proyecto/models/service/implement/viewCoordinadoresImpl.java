package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.viewCoordinadoresI;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IviewCoordinadoresDao;
import com.ista.tecazuay.proyecto.models.service.IviewCoordinadoresService;

@Service
public class viewCoordinadoresImpl implements IviewCoordinadoresService {

	@Autowired
	private IviewCoordinadoresDao coordinadoresDao;

	@Override
	@Transactional(readOnly = true)
	public List<viewCoordinadoresI> findAll() {

		return (List<viewCoordinadoresI>) coordinadoresDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public viewCoordinadoresI findByIdentificacion(String identificacion) {

		return coordinadoresDao.findById(identificacion).orElse(null);
	}
}
