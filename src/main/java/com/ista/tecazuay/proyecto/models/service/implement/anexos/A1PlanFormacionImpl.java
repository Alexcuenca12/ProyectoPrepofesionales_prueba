package com.ista.tecazuay.proyecto.models.service.implement.anexos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.A1_PlanFormacion;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.anexos.IA1_PlanFormacionDao;
import com.ista.tecazuay.proyecto.models.service.anexos.IA1_PlanFormacionService;
@Service
public class A1PlanFormacionImpl implements IA1_PlanFormacionService{
	
	@Autowired
	private IA1_PlanFormacionDao planFormacionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<A1_PlanFormacion> findAll() {
		// TODO Auto-generated method stub
		return (List<A1_PlanFormacion>) planFormacionDao.findAll();
	}

	@Override
	@Transactional
	public A1_PlanFormacion save(A1_PlanFormacion a1_PlanFormacion) {
		// TODO Auto-generated method stub
		return planFormacionDao.save(a1_PlanFormacion);
	}

	@Override
	@Transactional(readOnly = true)
	public A1_PlanFormacion findById(Long id) {
		// TODO Auto-generated method stub
		return planFormacionDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		planFormacionDao.deleteById(id);
	}

}
