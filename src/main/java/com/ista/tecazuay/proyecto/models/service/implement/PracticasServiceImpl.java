package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.Practicas;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IPracticasDao;
import com.ista.tecazuay.proyecto.models.service.IPracticasService;

@Service
public class PracticasServiceImpl implements IPracticasService {

	@Autowired
	private IPracticasDao PracticasDao;

	@Override
	@Transactional(readOnly = true)
	public List<Practicas> findAll() {

		return (List<Practicas>) PracticasDao.findAll();
	}

	@Override
	@Transactional
	public Practicas save(Practicas practicas) {

		return PracticasDao.save(practicas);
	}

	@Override
	@Transactional(readOnly = true)
	public Practicas findById(Long id) {

		return PracticasDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		PracticasDao.deleteById(id);
	}
}
