package com.example.models;



import jakarta.persistence.*;

/*
 * Modelo alumno que usaremos para recoger la información de la base de datos
 * @author Jmenabc
 * */

@Entity
@Table(name = "meme")
public class Alumnos {
	// Atributos
	@Id
	@Column(name = "id")
	private int Id;

	@Column(name = "name")
	private String nombre;

	@Column(name = "lastname")
	private String apellido;

	// Constructores

	public Alumnos() {
	}

	public Alumnos(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Setters y getters
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// ToString
	@Override
	public String toString() {
		return "Alumnos [Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}

