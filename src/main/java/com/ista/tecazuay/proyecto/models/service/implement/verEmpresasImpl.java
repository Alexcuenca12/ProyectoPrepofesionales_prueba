package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.verEmpresas;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IverEmpresasDao;
import com.ista.tecazuay.proyecto.models.service.IverEmpresaService;
@Service
public class verEmpresasImpl implements IverEmpresaService{
	
	@Autowired
	private IverEmpresasDao empresaDao;
	@Override
	@Transactional(readOnly = true)
	public List<verEmpresas> findAll() {
		// TODO Auto-generated method stub
		return (List<verEmpresas>)empresaDao.findAll();
	}

	@Override
	public int findByName(String name) {
		int variable=0;
		List<verEmpresas> listado=new ArrayList<>();
		List<verEmpresas> listadoEmpresa=(List<verEmpresas>) empresaDao.findAll();
		for (int i = 0; i < listadoEmpresa.size(); i++) {
			if(listadoEmpresa.get(i).getNombre_emp().equalsIgnoreCase(name)) {
				variable=listadoEmpresa.get(i).getId_empresa();
			}
		}
		return variable;
	}

}
