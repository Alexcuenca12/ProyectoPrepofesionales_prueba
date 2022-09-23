package com.ista.tecazuay.proyecto.models.service.implement.anexos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo6_DetallePractica;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.anexos.IAnexo6_DetallePracticaDao;
import com.ista.tecazuay.proyecto.models.service.anexos.IAnexo6_DetallePracticaService;

@Service
public class Anexo6_DetallePracticaServiceImpl implements IAnexo6_DetallePracticaService {

	@Autowired
	private IAnexo6_DetallePracticaDao Anexo6_DetallePracticaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Anexo6_DetallePractica> findAll() {

		return (List<Anexo6_DetallePractica>) Anexo6_DetallePracticaDao.findAll();
	}

	@Override
	@Transactional
	public Anexo6_DetallePractica save(Anexo6_DetallePractica anexo6) {

		return Anexo6_DetallePracticaDao.save(anexo6);
	}

	@Override
	@Transactional(readOnly = true)
	public Anexo6_DetallePractica findById(Long id) {

		return Anexo6_DetallePracticaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		Anexo6_DetallePracticaDao.deleteById(id);
	}
}
