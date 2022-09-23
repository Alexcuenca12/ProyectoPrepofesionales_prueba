package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.Empresa;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IEmpresaDao;
import com.ista.tecazuay.proyecto.models.service.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

	@Autowired
	private IEmpresaDao EmpresaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Empresa> findAll() {

		return (List<Empresa>) EmpresaDao.findAll();
	}

	@Override
	@Transactional
	public Empresa save(Empresa empresa) {

		return EmpresaDao.save(empresa);
	}

	@Override
	@Transactional(readOnly = true)
	public Empresa findById(Long id) {

		return EmpresaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		EmpresaDao.deleteById(id);
	}
}
