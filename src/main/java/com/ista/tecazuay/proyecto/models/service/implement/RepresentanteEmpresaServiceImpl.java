package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.RepresentanteEmpresa;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IRepresentanteEmpresaDao;
import com.ista.tecazuay.proyecto.models.service.IRepresentanteEmpresaService;

@Service

public class RepresentanteEmpresaServiceImpl implements IRepresentanteEmpresaService {

	@Autowired
	private IRepresentanteEmpresaDao RepresentanteEmpresaDao;

	@Override
	@Transactional(readOnly = true)
	public List<RepresentanteEmpresa> findAll() {

		return (List<RepresentanteEmpresa>) RepresentanteEmpresaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public RepresentanteEmpresa findByIdentificaion(String identificacion) {

		return RepresentanteEmpresaDao.findById(identificacion).orElse(null);
	}

	@Override
	@Transactional
	public RepresentanteEmpresa save(RepresentanteEmpresa representanteempresa) {

		return RepresentanteEmpresaDao.save(representanteempresa);
	}

	@Override
	@Transactional(readOnly = true)
	public RepresentanteEmpresa findById(String cedula) {

		return RepresentanteEmpresaDao.findById(cedula).orElse(null);
	}

	@Override
	@Transactional
	public void delete(String cedula) {

		RepresentanteEmpresaDao.deleteById(cedula);
	}

}
