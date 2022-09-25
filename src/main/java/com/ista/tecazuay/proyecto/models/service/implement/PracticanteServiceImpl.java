package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.ista.tecazuay.proyecto.controllers.RealizaPracticaController;
import com.ista.tecazuay.proyecto.models.primary.entity.Practicante;
import com.ista.tecazuay.proyecto.models.primary.entity.RealizaPractica;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IPracticanteDao;
import com.ista.tecazuay.proyecto.models.service.IPracticanteService;

@Service
public class PracticanteServiceImpl implements IPracticanteService {

	@Autowired
	private IPracticanteDao PracticanteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Practicante> findAll() {

		return (List<Practicante>) PracticanteDao.findAll();
	}
	
	
	
	@Override
	@Transactional
	public Practicante save(Practicante practicante) {

		return PracticanteDao.save(practicante);
	}

	@Override
	@Transactional(readOnly = true)
	public Practicante findById(Long id) {

		return PracticanteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		PracticanteDao.deleteById(id);
	}
}
