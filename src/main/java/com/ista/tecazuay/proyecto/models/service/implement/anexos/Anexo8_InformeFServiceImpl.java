package com.ista.tecazuay.proyecto.models.service.implement.anexos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo8_InformeF;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.anexos.IAnexo8_InformeFDao;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo8_InformeFService;

@Service
public class Anexo8_InformeFServiceImpl implements IAnexo8_InformeFService {

	@Autowired
	private IAnexo8_InformeFDao Anexo8_InformeFDao;

	@Override
	@Transactional(readOnly = true)
	public List<Anexo8_InformeF> findAll() {

		return (List<Anexo8_InformeF>) Anexo8_InformeFDao.findAll();
	}

	@Override
	@Transactional
	public Anexo8_InformeF save(Anexo8_InformeF anexo8) {

		return Anexo8_InformeFDao.save(anexo8);
	}

	@Override
	@Transactional(readOnly = true)
	public Anexo8_InformeF findById(Long id) {

		return Anexo8_InformeFDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		Anexo8_InformeFDao.deleteById(id);
	}
}
