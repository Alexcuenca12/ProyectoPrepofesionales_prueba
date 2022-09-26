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

import com.ista.tecazuay.proyecto.models.primary.entity.anexos.A1_PlanFormacion;
import com.ista.tecazuay.proyecto.models.primary.entity.anexos.A1_PlanRotacion;
import com.ista.tecazuay.proyecto.models.service.anexos.IA1_PlanFormacionService;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class A1_PlanFormacionController {
	
	@Autowired
	private IA1_PlanFormacionService planFormacionService;
	
	
	//Metodo para Listar Cliente
	@GetMapping("/planformacion")
	public List<A1_PlanFormacion> indext(){
		return planFormacionService.findAll();
	}
	@GetMapping("/planformaciona1/{idanexo}")
	public List<A1_PlanFormacion> indext(@PathVariable Long idanexo){
		return planFormacionService.findbyanexo(idanexo);
	}
	
	
	
	//Metodo para Guardar Cliente
	@PostMapping("/planformacion")
	@ResponseStatus(HttpStatus.CREATED)
	public A1_PlanFormacion Guardar(@RequestBody A1_PlanFormacion a1_PlanFormacion ){
		return planFormacionService.save(a1_PlanFormacion);
	}
	
	
	//Metodo para Eliminar Cliente
	@DeleteMapping("/planformacion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void Eliminar(@PathVariable Long id) {
		planFormacionService.delete(id);
	}
	
	
	//Metodo para Buscar por id un Cliente
	@GetMapping("/planformacion/{id}")
	public A1_PlanFormacion Buscar(@PathVariable Long id) {
		return planFormacionService.findById(id);
	}
	
	/*
	//Metodo para editar Cliente
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente actualizar(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente clienteActual=clienteService.findById(id);
		clienteActual.setApellido(cliente.getApellido());
		clienteActual.setNombre(cliente.getNombre());
		clienteActual.setEmail(cliente.getEmail());
		return clienteService.Save(clienteActual);
	}*/
}
