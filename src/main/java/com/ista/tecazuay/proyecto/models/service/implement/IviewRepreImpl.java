package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.vNombreEmpresaRepre;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IviewNomRepreDao;
import com.ista.tecazuay.proyecto.models.service.IviewRepreService;

@Service
public class IviewRepreImpl implements IviewRepreService {

	@Autowired
	private IviewNomRepreDao nomRepreDao;

	@Override
	@Transactional(readOnly = true)
	public List<vNombreEmpresaRepre> findAll() {
		// TODO Auto-generated method stub
		return (List<vNombreEmpresaRepre>) nomRepreDao.findAll();
	}

}
