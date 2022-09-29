package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.lista_practicantes_view;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IListaPracticantesVDao;
import com.ista.tecazuay.proyecto.models.service.IListaPracticanteVService;

@Service
public class listaPracticanteVImpl implements IListaPracticanteVService{
	
	@Autowired
	private IListaPracticantesVDao ilistaPracticantesV;

	@Override
	@Transactional(readOnly = true)
	public List<lista_practicantes_view> findAll() {
		// TODO Auto-generated method stub
		return (List<lista_practicantes_view>)ilistaPracticantesV.findAll();
	}
	
	

}
