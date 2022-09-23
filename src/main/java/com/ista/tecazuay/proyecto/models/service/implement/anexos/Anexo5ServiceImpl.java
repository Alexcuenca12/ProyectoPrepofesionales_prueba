package com.ista.tecazuay.proyecto.models.service.implement.anexos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo5;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.anexos.IAnexo5Dao;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo5Service;

@Service
public class Anexo5ServiceImpl implements IAnexo5Service {

	@Autowired
	private IAnexo5Dao Anexo5Dao;

	@Override
	@Transactional(readOnly = true)
	public List<Anexo5> findAll() {

		return (List<Anexo5>) Anexo5Dao.findAll();
	}

	@Override
	@Transactional
	public Anexo5 save(Anexo5 anexo5) {

		return Anexo5Dao.save(anexo5);
	}

	@Override
	@Transactional(readOnly = true)
	public Anexo5 findById(Long id) {

		return Anexo5Dao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		Anexo5Dao.deleteById(id);
	}
}
