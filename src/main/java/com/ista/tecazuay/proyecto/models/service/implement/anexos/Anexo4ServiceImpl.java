package com.ista.tecazuay.proyecto.models.service.implement.anexos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo4;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.anexos.IAnexo4Dao;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo4Service;

@Service
public class Anexo4ServiceImpl implements IAnexo4Service {

	@Autowired
	private IAnexo4Dao Anexo4Dao;

	@Override
	@Transactional(readOnly = true)
	public List<Anexo4> findAll() {

		return (List<Anexo4>) Anexo4Dao.findAll();
	}

	@Override
	@Transactional
	public Anexo4 save(Anexo4 anexo4) {

		return Anexo4Dao.save(anexo4);
	}

	@Override
	@Transactional(readOnly = true)
	public Anexo4 findById(Long id) {

		return Anexo4Dao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		Anexo4Dao.deleteById(id);
	}
}
