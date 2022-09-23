package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.Persona;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IPersonaDao;
import com.ista.tecazuay.proyecto.models.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDao PersonaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {

		return (List<Persona>) PersonaDao.findAll();
	}

	@Override
	@Transactional
	public Persona save(Persona persona) {

		return PersonaDao.save(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findById(Long id) {

		return PersonaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		PersonaDao.deleteById(id);
	}
}
