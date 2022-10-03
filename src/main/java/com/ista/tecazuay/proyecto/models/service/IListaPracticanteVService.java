package com.ista.tecazuay.proyecto.models.service;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.RealizaPractica;
import com.ista.tecazuay.proyecto.models.primary.entity.lista_practicantes_view;

public interface IListaPracticanteVService {
	
	public List<lista_practicantes_view> findAll();
	public List<lista_practicantes_view> findbyconv(Long numconv);
	public List<lista_practicantes_view> findbypract(Long idpract);
	public List<lista_practicantes_view> findbyreal(Long idreal);
}
