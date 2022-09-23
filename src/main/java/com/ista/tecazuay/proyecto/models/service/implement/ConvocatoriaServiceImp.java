package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.Convocatoria;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IConvocatoriaDao;
import com.ista.tecazuay.proyecto.models.service.IConvocatoriaService;

@Service
public class ConvocatoriaServiceImp implements IConvocatoriaService {

	@Autowired
	private IConvocatoriaDao ConvocatoriaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Convocatoria> findAll() {

		return (List<Convocatoria>) ConvocatoriaDao.findAll();
	}

	@Override
	@Transactional
	public Convocatoria save(Convocatoria Convocatoria) {

		return ConvocatoriaDao.save(Convocatoria);
	}

	@Override
	@Transactional(readOnly = true)
	public Convocatoria findById(Long id) {

		return ConvocatoriaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		ConvocatoriaDao.deleteById(id);
	}
}
