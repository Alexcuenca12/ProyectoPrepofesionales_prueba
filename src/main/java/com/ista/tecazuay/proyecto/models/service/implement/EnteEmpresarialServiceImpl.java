package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.EnteEmpresarial;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IEnteEmpresarialDao;
import com.ista.tecazuay.proyecto.models.service.IEnteEmpresarialService;

@Service
public class EnteEmpresarialServiceImpl implements IEnteEmpresarialService {

	@Autowired
	private IEnteEmpresarialDao EnteEmpresarialDao;

	@Override
	@Transactional(readOnly = true)
	public List<EnteEmpresarial> findAll() {

		return (List<EnteEmpresarial>) EnteEmpresarialDao.findAll();
	}

	@Override
	@Transactional
	public EnteEmpresarial save(EnteEmpresarial enteEmp) {

		return EnteEmpresarialDao.save(enteEmp);
	}

	@Override
	@Transactional(readOnly = true)
	public EnteEmpresarial findById(Long id) {

		return EnteEmpresarialDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		EnteEmpresarialDao.deleteById(id);
	}
}
