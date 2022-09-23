package com.ista.tecazuay.proyecto.models.primary.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="roles")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_rol;
	@Enumerated(EnumType.STRING)
	private ERol nombre;

}
