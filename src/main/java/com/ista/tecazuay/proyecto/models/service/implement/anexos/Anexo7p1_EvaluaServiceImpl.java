package com.ista.tecazuay.proyecto.models.service.implement.anexos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo7p1_Evalua;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.anexos.IAnexo7p1_EvaluaDao;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo7p1_EvaluaService;

@Service
public class Anexo7p1_EvaluaServiceImpl implements IAnexo7p1_EvaluaService {

	@Autowired
	private IAnexo7p1_EvaluaDao Anexo7p1_EvaluaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Anexo7p1_Evalua> findAll() {

		return (List<Anexo7p1_Evalua>) Anexo7p1_EvaluaDao.findAll();
	}

	@Override
	@Transactional
	public Anexo7p1_Evalua save(Anexo7p1_Evalua anexo7p1) {

		return Anexo7p1_EvaluaDao.save(anexo7p1);
	}

	@Override
	@Transactional(readOnly = true)
	public Anexo7p1_Evalua findById(Long id) {

		return Anexo7p1_EvaluaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		Anexo7p1_EvaluaDao.deleteById(id);
	}
}
