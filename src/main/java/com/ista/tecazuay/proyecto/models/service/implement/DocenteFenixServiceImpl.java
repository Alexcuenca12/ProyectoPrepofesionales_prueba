package com.ista.tecazuay.proyecto.models.service.implement;

import com.ista.tecazuay.proyecto.models.repository.secondary.dao.IVerpersonafDao;
import com.ista.tecazuay.proyecto.models.secondary.entity.verpersonaf;
import com.ista.tecazuay.proyecto.models.service.IDocenteFenixService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteFenixServiceImpl implements IDocenteFenixService {

	@Autowired
	private IVerpersonafDao verpersonafDao;

	@Override
	@Transactional(readOnly = true)
	public List<verpersonaf> findAll() {
		// TODO Auto-generated method stub
		return (List<verpersonaf>) verpersonafDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public verpersonaf findById(String id) {
		// TODO Auto-generated method stub
		return verpersonafDao.findById(id).orElse(null);
	}
}
