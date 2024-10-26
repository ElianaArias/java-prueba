package com.coderhouse.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cursos")
public class Curso {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(nullable = false) // para asegurarme de que haya siempre un curso
	private Long id;
	private String nombre;
	
	@ManyToMany(fetch = FetchType.EAGER) //tenemos el mtm eager, le pedimos que haga el join con una tabla y abajo le digo como va a ser (el parametro lo pongo para que funcione, haya curso o alumnos, o no. es para que funcione igual)
	@JoinTable(                              		       		 //hago esto para generar la 3er tabla donde va a hacerse el join, porque es muchos a muchos
			name = "curso_alumno", 								//nombre de la tabla nueva
			joinColumns = @JoinColumn(name = "curso_id"),		//va a hacer una col llamada cursoid
			inverseJoinColumns = @JoinColumn(name = "alumno_id") // y otra col llamada alumnoid
			)
	//y aca, luego de lo primero, see genera una tabla nueva y le digo qué 2  col van a generarse en mi nueva tabla
	
	private List<Alumno> alumnos = new ArrayList<>();

	//aca vengo a crear el constructor, primero de la superclass
	public Curso() {
		super();
		
	}	

	
	
	//y desp cocn public fields. al crearlo le destildo id porque es autoincremental
	public Curso(String nombre) {
		super();
		this.nombre = nombre;
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

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}
	
	
}
