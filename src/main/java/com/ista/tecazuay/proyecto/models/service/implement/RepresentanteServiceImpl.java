package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.Representante;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IRepresentanteDao;
import com.ista.tecazuay.proyecto.models.service.IRepresentanteService;

@Service
public class RepresentanteServiceImpl implements IRepresentanteService {

	@Autowired
	private IRepresentanteDao RepresentanteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Representante> findAll() {

		return (List<Representante>) RepresentanteDao.findAll();
	}

	@Override
	@Transactional
	public Representante save(Representante representante) {

		return RepresentanteDao.save(representante);
	}

	@Override
	@Transactional(readOnly = true)
	public Representante findById(Long id) {

		return RepresentanteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		RepresentanteDao.deleteById(id);
	}
}
