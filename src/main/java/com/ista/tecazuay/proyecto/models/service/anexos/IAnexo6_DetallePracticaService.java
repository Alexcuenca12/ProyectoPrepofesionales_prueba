package com.ista.tecazuay.proyecto.models.service.anexos;

import java.util.List;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.Anexo6_DetallePractica;

public interface IAnexo6_DetallePracticaService {

	public List<Anexo6_DetallePractica> findAll();

	public Anexo6_DetallePractica save(Anexo6_DetallePractica anexo6);

	public Anexo6_DetallePractica findById(Long id);

	public void delete(Long id);
}
