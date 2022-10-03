package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.tecazuay.proyecto.models.primary.entity.listConvocatorias;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IlistConvocatoriasDao;
import com.ista.tecazuay.proyecto.models.service.IlistConvocatoriasService;

@Service
public class listConvocatoriaImpl implements IlistConvocatoriasService {

	@Autowired
	private IlistConvocatoriasDao convocatoriasDao;

	@Override
	public List<listConvocatorias> findAll() {
		// TODO Auto-generated method stub
		return (List<listConvocatorias>) convocatoriasDao.findAll();
	}

}
