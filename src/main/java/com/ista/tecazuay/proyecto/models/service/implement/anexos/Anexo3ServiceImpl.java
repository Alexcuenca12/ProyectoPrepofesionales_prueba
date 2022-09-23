package com.ista.tecazuay.proyecto.models.service.implement.anexos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo3;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.anexos.IAnexo3Dao;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo3Service;

@Service
public class Anexo3ServiceImpl implements IAnexo3Service {

	@Autowired
	private IAnexo3Dao Anexo3Dao;

	@Override
	@Transactional(readOnly = true)
	public List<Anexo3> findAll() {

		return (List<Anexo3>) Anexo3Dao.findAll();
	}

	@Override
	@Transactional
	public Anexo3 save(Anexo3 anexo3) {

		return Anexo3Dao.save(anexo3);
	}

	@Override
	@Transactional(readOnly = true)
	public Anexo3 findById(Long id) {

		return Anexo3Dao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		Anexo3Dao.deleteById(id);
	}
}
