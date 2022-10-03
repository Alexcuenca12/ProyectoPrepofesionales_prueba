package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.RealizaPractica;
import com.ista.tecazuay.proyecto.models.primary.entity.lista_practicantes_view;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IListaPracticantesVDao;
import com.ista.tecazuay.proyecto.models.service.IListaPracticanteVService;

@Service
public class listaPracticanteVImpl implements IListaPracticanteVService{
	
	@Autowired
	private IListaPracticantesVDao ilistaPracticantesV;

	@Override
	@Transactional(readOnly = true)
	public List<lista_practicantes_view> findAll() {
		// TODO Auto-generated method stub
		return (List<lista_practicantes_view>)ilistaPracticantesV.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public List<lista_practicantes_view> findbyconv(Long numconv) {
		List<lista_practicantes_view> listarespuesta=new ArrayList<>();
		List<lista_practicantes_view> listapracticas=(List<lista_practicantes_view>) ilistaPracticantesV.findAll();
		for (int i = 0; i < listapracticas.size(); i++) {
			if(listapracticas.get(i).getNumconvenio()==numconv) {
				listarespuesta.add(listapracticas.get(i));
			}
		}
		
		return listarespuesta;
	}
	@Override
	@Transactional(readOnly = true)
	public List<lista_practicantes_view> findbypract(Long idpract) {
		List<lista_practicantes_view> listarespuesta=new ArrayList<>();
		List<lista_practicantes_view> listapracticas=(List<lista_practicantes_view>) ilistaPracticantesV.findAll();
		for (int i = 0; i < listapracticas.size(); i++) {
			if(listapracticas.get(i).getIdpractica()==idpract) {
				listarespuesta.add(listapracticas.get(i));
			}
		}
		
		return listarespuesta;
	}
	@Override
	@Transactional(readOnly = true)
	public List<lista_practicantes_view> findbyreal(Long idreal) {
		List<lista_practicantes_view> listarespuesta=new ArrayList<>();
		List<lista_practicantes_view> listarealiza=(List<lista_practicantes_view>) ilistaPracticantesV.findAll();
		for (int i = 0; i < listarealiza.size(); i++) {
			if(listarealiza.get(i).getIdrealizando()==idreal) {
				listarespuesta.add(listarealiza.get(i));
			}
		}
		
		return listarespuesta;
	}
	
	

}
