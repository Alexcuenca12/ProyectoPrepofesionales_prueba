package com.ista.tecazuay.proyecto.controllers.anexos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.A1_PlanRotacion;
import com.ista.tecazuay.proyecto.models.service.anexos.IA1_PlanRotacionService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class A1_PlanRotacionController {
	
	@Autowired
	private IA1_PlanRotacionService planRotacionService;
	
	
	//Metodo para Listar Cliente
	@GetMapping("/PlanRotacion")
	public List<A1_PlanRotacion> indext(){
		return planRotacionService.findAll();
	}
	
	
	//Metodo para Guardar Cliente
	@PostMapping("/PlanRotacion")
	@ResponseStatus(HttpStatus.CREATED)
	public A1_PlanRotacion Guardar(@RequestBody A1_PlanRotacion a1_PlanRotacion){
		return planRotacionService.save(a1_PlanRotacion);
	}
	
	
	//Metodo para Eliminar Cliente
	@DeleteMapping("/PlanRotacion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void Eliminar(@PathVariable Long id) {
		planRotacionService.delete(id);
	}
	
	
	//Metodo para Buscar por id un Cliente
	@GetMapping("/PlanRotacion/{id}")
	public A1_PlanRotacion Buscar(@PathVariable Long id) {
		return planRotacionService.findById(id);
	}
	
	/*
	//Metodo para editar Cliente
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente actualizar(@RequestBody A1_PlanRotacion rotacion, @PathVariable Long id) {
		Cliente clienteActual=planRotacionService.findById(id);
		clienteActual.setApellido(cliente.getApellido());
		clienteActual.setNombre(cliente.getNombre());
		clienteActual.setEmail(cliente.getEmail());
		return planRotacionService.Save(clienteActual);
	}*/
	
}
