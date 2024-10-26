package com.coderhouse.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alumnos") //esto sirve para cambiarle el nombre a la tabla en wb pero no en la entidad
public class Alumno {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	
	@Column(unique = true, nullable = false)//porque dni debe ser unico y no nulo
	private int dni;
	@Column(unique = true, nullable = false)
	private String legajo;
	
	@ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)//tenemos esta relacion
	
	private List<Curso> cursos = new ArrayList<>();//que va a traer una lista de cursos
	//es decir, alumnos va a mapearse con cursos
	
	//acá vengo a crear un constructor
	
	
	private LocalDateTime createdAt = LocalDateTime.now();

	//aca vengo a crear el constructor, primero de la superclass
	public Alumno() {
		super();
		
	}	

	
	//y desp cocn public fields. al crearlo no tilde todo
	public Alumno(String nombre, String apellido, int dni, String legajo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.legajo = legajo;
	}



	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	} 
	

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", legajo="
				+ legajo + ", cursos=" + cursos + ", createdAt=" + createdAt + "]";
	}

}
