package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.ResponsableCarrera;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IResponsableCarreraDao;
import com.ista.tecazuay.proyecto.models.service.IResponsableCarreraService;

@Service
public class ResponsableCarreraServiceImpl implements IResponsableCarreraService {

	@Autowired
	private IResponsableCarreraDao RepresentanteDao;

	@Override
	@Transactional(readOnly = true)
	public List<ResponsableCarrera> findAll() {

		return (List<ResponsableCarrera>) RepresentanteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public ResponsableCarrera findByIdentificaion(String identificacion) {

		return RepresentanteDao.findById(identificacion).orElse(null);
	}
	
	@Override
	@Transactional
	public ResponsableCarrera save(ResponsableCarrera representante) {

		return RepresentanteDao.save(representante);
	}

	@Override
	@Transactional(readOnly = true)
	public ResponsableCarrera findById(String id) {

		return RepresentanteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(String id) {

		RepresentanteDao.deleteById(id);
	}

}
