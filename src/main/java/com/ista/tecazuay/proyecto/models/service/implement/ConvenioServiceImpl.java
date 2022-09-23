package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.Convenio;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IConvenioDao;
import com.ista.tecazuay.proyecto.models.service.IConvenioService;

@Service
public class ConvenioServiceImpl implements IConvenioService {

	@Autowired
	private IConvenioDao ConvenioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Convenio> findAll() {

		return (List<Convenio>) ConvenioDao.findAll();
	}

	@Override
	@Transactional
	public Convenio save(Convenio convenio) {

		return ConvenioDao.save(convenio);
	}

	@Override
	@Transactional(readOnly = true)
	public Convenio findById(Long id) {

		return ConvenioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		ConvenioDao.deleteById(id);
	}
}
