package com.ista.tecazuay.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@RestController
@SpringBootApplication
public class ProyectoPrepofesionalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPrepofesionalesApplication.class, args);
	}

}
