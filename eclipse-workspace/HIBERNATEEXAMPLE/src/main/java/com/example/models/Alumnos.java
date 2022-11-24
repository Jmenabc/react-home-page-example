package com.example.models;

import jakarta.persistence.*;

/*
 * Modelo alumno que usaremos para recoger la información de la base de datos
 * @author Jmenabc
 * */
@Entity
@Table(name = "ejemploAlumno")
public class Alumnos {

	// Atributos
	@Id
	@Column(name = "id")
	private int Id;

	@Column(name = "alumno_nombre")
	private String alumno_nombre;

	@Column(name = "alumno_apellido")
	private String alumno_apellido;

	@Column(name = "alumno_apellido2")
	private String alumno_apellido2;

	// Constructores
	public Alumnos(String alumno_nombre, String alumno_apellido, String alumno_apellido2) {
		super();
		this.alumno_nombre = alumno_nombre;
		this.alumno_apellido = alumno_apellido;
		this.alumno_apellido2 = alumno_apellido2;
	}

	public Alumnos() {
	}

	// Getters y Setters

	public String getAlumno_nombre() {
		return alumno_nombre;
	}

	public void setAlumno_nombre(String alumno_nombre) {
		this.alumno_nombre = alumno_nombre;
	}

	public String getAlumno_apellido() {
		return alumno_apellido;
	}

	public void setAlumno_apellido(String alumno_apellido) {
		this.alumno_apellido = alumno_apellido;
	}

	public String getAlumno_apellido2() {
		return alumno_apellido2;
	}

	public void setAlumno_apellido2(String alumno_apellido2) {
		this.alumno_apellido2 = alumno_apellido2;
	}

	// toString
	@Override
	public String toString() {
		return "Alumnos [Id=" + Id + ", alumno_nombre=" + alumno_nombre + ", alumno_apellido=" + alumno_apellido
				+ ", alumno_apellido2=" + alumno_apellido2 + "]";
	}

}
