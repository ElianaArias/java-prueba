package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cursos")
public class Curso {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false) // para asegurarme de que haya siempre un curso
	private String nombre;
	
	@ManyToMany(fetch = FetchType.EAGER) //tenemos el mtm eager, le pedimos que haga el join con una tabla y abajo le digo como va a ser (el parametro lo pongo para que funcione, haya curso o alumnos, o no. es para que funcione igual)
	@JoinTable(                              		       		 //hago esto para generar la 3er tabla donde va a hacerse el join, porque es muchos a muchos
			name = "curso_alumno", 								//nombre de la tabla nueva
			joinColumns = @JoinColumn(
									name = "curso_id"),		//va a hacer una col llamada cursoid
			inverseJoinColumns = @JoinColumn(
											name = "alumno_id") // y otra col llamada alumnoid
											)
	//y aca, luego de lo primero, se genera una tabla nueva y le digo qué 2  col van a generarse en mi nueva tabla
	
	@JsonIgnore //para que no se me haga un bucle infinito en postman cuando muestro lista de alumnos y sea más corta
	private List<Alumno> alumnos = new ArrayList<>();
	
	@ManyToOne //muchos cursos por categoria
	private Categoria categoria; //acá le digo a curso que va a recibir solo una categoria

	
	//constructor de la superclass. lo dejé como estaba
	public Curso() {
		super();
		
	}	
	
	//apublic fields le agrego categoria
	public Curso(String nombre, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
	}

	//getters y setters

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



	public Categoria getCategoria() {
		return categoria;
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	//tostring
	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + "]"; //acá también llamaba al alumno pero lo saqué para que no se haga un bucle infinito
	}
	
	//si dejara tal cual el tostring de curso y alumno, el curso me mostraría los alumnos, y los alumnos me mostrarían curso. para cortar el bucle, elimino alumno del tostring curso y ahí corta. 
	//de esta forma, cuando quiero mostrar el curso, no me muestra al alumno sino los datos del curso. y en alumno me va a mostrar los cursos en que se inscribió
	
	
	
	
}
