package com.ista.tecazuay.proyecto.models.primary.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios", uniqueConstraints = { @UniqueConstraint(columnNames = "cedula") })
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_usuario;
	private String nombre;
	private String apellido;
	private String cedula;
	private String correo;
	private String contrasenia;
	private String numcelular;
	@Column(name = "fechanac")
	@Temporal(TemporalType.DATE)
	private Date date_nac;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuario_roles", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
	private Set<Rol> roles = new HashSet<>();

	public Usuario(String nombre, String apellido, String cedula, String correo, String contrasenia, String numcelular,
			Date date_nac) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.numcelular = numcelular;
		this.date_nac = date_nac;
	}

}
