package com.ista.tecazuay.proyecto.models.service.implement.anexos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.RealizaPractica;
import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo1;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.anexos.IAnexo1Dao;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo1Service;

@Service
public class Anexo1ServiceImpl implements IAnexo1Service {

	@Autowired
	private IAnexo1Dao Anexo1Dao;

	@Override
	@Transactional(readOnly = true)
	public List<Anexo1> findAll() {

		return (List<Anexo1>) Anexo1Dao.findAll();
	}

	@Override
	@Transactional
	public Anexo1 save(Anexo1 anexo1) {

		return Anexo1Dao.save(anexo1);
	}

	@Override
	@Transactional(readOnly = true)
	public Anexo1 findById(Long id) {

		return Anexo1Dao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		Anexo1Dao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Anexo1> findbyrealprac(Long id_realiza_practica) {
		// TODO Auto-generated method stub
		List<Anexo1> anexo1respuesta = new ArrayList<>();
		List<Anexo1> anexo1 = (List<Anexo1>) Anexo1Dao.findAll();
		for (int i = 0; i < anexo1.size(); i++) {
			if (anexo1.get(i).getId_practica_real() == id_realiza_practica) {
				anexo1respuesta.add(anexo1.get(i));

			}
		}

		return anexo1respuesta;
	}
}
