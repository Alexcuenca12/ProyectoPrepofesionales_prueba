package com.ista.tecazuay.proyecto.models.service.implement.anexos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.A1_PlanRotacion;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.anexos.IA1_PlanRotacionDao;
import com.ista.tecazuay.proyecto.models.service.anexos.IA1_PlanRotacionService;
@Service
public class A1_PlanRotacionServiceImpl implements IA1_PlanRotacionService{
	
	@Autowired
	private IA1_PlanRotacionDao planRotacionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<A1_PlanRotacion> findAll() {
		// TODO Auto-generated method stub
		return (List<A1_PlanRotacion>) planRotacionDao.findAll();
	}

	@Override
	@Transactional
	public A1_PlanRotacion save(A1_PlanRotacion a1_PlanRotacion) {
		// TODO Auto-generated method stub
		return planRotacionDao.save(a1_PlanRotacion);
	}

	@Override
	@Transactional(readOnly = true)
	public A1_PlanRotacion findById(Long id) {
		// TODO Auto-generated method stub
		return planRotacionDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		planRotacionDao.deleteById(id);
	}

}
