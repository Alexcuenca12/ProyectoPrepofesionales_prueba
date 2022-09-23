package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.MateriaAprobada;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IMateriaAprobadaDao;
import com.ista.tecazuay.proyecto.models.service.IMateriaAprobadaService;

@Service
public class MateriaAprobadaServiceImpl implements IMateriaAprobadaService {

	@Autowired
	private IMateriaAprobadaDao MateriaAprobadaDao;

	@Override
	@Transactional(readOnly = true)
	public List<MateriaAprobada> findAll() {

		return (List<MateriaAprobada>) MateriaAprobadaDao.findAll();
	}

	@Override
	@Transactional
	public MateriaAprobada save(MateriaAprobada materia) {

		return MateriaAprobadaDao.save(materia);
	}

	@Override
	@Transactional(readOnly = true)
	public MateriaAprobada findById(Long id) {

		return MateriaAprobadaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		MateriaAprobadaDao.deleteById(id);
	}
}
