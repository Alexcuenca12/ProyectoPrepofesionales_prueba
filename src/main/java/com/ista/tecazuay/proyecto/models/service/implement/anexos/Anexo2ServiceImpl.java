package com.ista.tecazuay.proyecto.models.service.implement.anexos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo2;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.anexos.IAnexo2Dao;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo2Service;

@Service
public class Anexo2ServiceImpl implements IAnexo2Service {

	@Autowired
	private IAnexo2Dao Anexo2Dao;

	@Override
	@Transactional(readOnly = true)
	public List<Anexo2> findAll() {

		return (List<Anexo2>) Anexo2Dao.findAll();
	}

	@Override
	@Transactional
	public Anexo2 save(Anexo2 anexo2) {

		return Anexo2Dao.save(anexo2);
	}

	@Override
	@Transactional(readOnly = true)
	public Anexo2 findById(Long id) {

		return Anexo2Dao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		Anexo2Dao.deleteById(id);
	}
}
