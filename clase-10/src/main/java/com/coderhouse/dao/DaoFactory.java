package com.coderhouse.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Alumno;
import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory { //en dao creamos metodos. queremos crear crud: crear, leer, modificar, eliminar

	@PersistenceContext //esto es una clase que maneja entidades
	private EntityManager em; //em en realidad significa entityManager pero con la e minuscula, se resume en em
	
	//CREATE(CRUD) métodos para crear mis clases
	@Transactional
	public void createAlumno (Alumno alumno) {
		em.persist(alumno); //tengo que persistir al alumno y hago lo mismo con un curso
	}
	@Transactional
	public void createCurso (Curso curso) {
		em.persist(curso); 
	}
	
	@Transactional//creo categoria
	public void createCategoria (Categoria categoria) {
		em.persist(categoria); 
	}
	
	//READ (CRUD) métodos para mostrar mis clases
	@Transactional
	public List<Alumno> getAllAlumnos(){
		TypedQuery<Alumno> query = em.createQuery("SELECT a FROM Alumno a", Alumno.class); //a quiere decir alumnos. acá le pido a la bbdd q muestre alumnos.para eso le aviso que hago un alias
		List<Alumno> alumnos = query.getResultList();//y esto se va a guardar en una lista de alumnos
		alumnos.forEach(a -> Hibernate.initialize(a.getCursos()));//ahora recorro la lista y pido que por todos los alumnos haga la recorrida y me traiga todos los cursos de c/u
		return alumnos; //me tiene que devolver a los alumnos
	}
	
	
		//hago lo mismo para cursos
	@Transactional
	public List<Curso> getAllCursos(){
		TypedQuery<Curso> query = em.createQuery("SELECT c FROM Curso c", Curso.class); //cu significa curso
		List<Curso> cursos = query.getResultList(); 		//tengo que hacer una recorrida para ver categorias
		cursos.forEach(c -> Hibernate.initialize(c.getCategoria())); //por cada curso que tenga, me muestra categoria
		return cursos; //no tengo que hacer for each ni cargar todo en una lista
	}
	
	
	//y ahora hago lo mismo con categoria
	@Transactional
	public List<Categoria> getAllCategorias(){
		TypedQuery<Categoria> query = em.createQuery("SELECT ca FROM Categoria ca", Categoria.class);
		return query.getResultList(); //no tengo que hacer for each ni cargar todo en una lista
	}
	
	//creo metodo para seleccionar un curso. va a devolverme un curso por id. asi me puedo inscribir
	@Transactional
	public Curso getCursoById(Long cursoId) {//paso el id del curso que necesito como parametro
		TypedQuery<Curso> query = em.createQuery("SELECT c FROM Curso c WHERE c.id = :id", Curso.class); //con where comparo los id que envio con el de la query
		return query.setParameter("id", cursoId).getSingleResult();//según el id, que va a ser cursoId, me devuelve los cursos
	}
	
	//creo metodo para seleccionar un alumno asi me puedo inscribir
	@Transactional
	public Alumno getAlumnoById(Long alumnoId) {
		TypedQuery<Alumno> query = em.createQuery("SELECT a FROM Alumno a WHERE a.id = :id", Alumno.class);
		Alumno alumno = query.setParameter("id", alumnoId).getSingleResult();//le tengo que pasar los cursos tambien porque los alumnos tienen curso y guardarlo con toda la query
		Hibernate.initialize(alumno.getCursos());//le pido a hibernate que me traiga los cursos
		return alumno;//y que me devuelva alumno completo con sus cursos
	}
	
	
	//Ahora hacemos un metodo para que un alumno se pueda inscribir a un curso. pero para inscribirme primero debo seleccionar un curso, y para seleccionar un curso en particular, primero creo otro metodo
	@Transactional
	public void inscribirAlumnoEnCurso (Long cursoId, Long alumnoId) {//pongo estos id porque ahi se unen las tablas
	
		Curso curso = getCursoById(cursoId);//ahora que están los métodos creados puedo recuperar un curso segun id
		Alumno alumno = getAlumnoById(alumnoId);//y recuperar un alumno segun id
	
		
		System.out.println(curso.toString());
		System.out.println(alumno.toString());
		
		//hacemos una validacion por tema joins
		if (!curso.getAlumnos().contains(alumno)) {//verifico si el alumno está inscripto en el curso. y si no está, lo agrego. sino no
			curso.getAlumnos().add(alumno);
		}
		
		if (!alumno.getCursos().contains(curso)) {//verifico si el curso está en la lista de cursos del alumno lo agrego, sino no
			alumno.getCursos().add(curso);
		}
		
		em.merge(curso);//y hago los merge para que quede todo guardado
		em.merge(alumno);

	
	}

	

}
