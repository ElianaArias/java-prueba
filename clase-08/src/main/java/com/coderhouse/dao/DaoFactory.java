package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.modelos.Alumno;
import com.coderhouse.modelos.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service //porque dao es un servicio
public class DaoFactory {

	@PersistenceContext //esto es una clase que maneja entidades
	private EntityManager em; //em en realidad significa entityManager pero con la e minuscula, se resume en em
	
	//ahora tengo que hacer un crear alumnos y curso
	@Transactional
	public void createAlumno (Alumno alumno) { //va a ser un metodo publico qe no va a devolver nada
		em.persist(alumno); //em me habilita un monton de metodos- en este caso tengo que persistir al alumno y hago lo mismo con un curso
	}
	@Transactional
	public void createCurso (Curso curso) {//creé un alumno y ahora creo un curso
		em.persist(curso); 
	}
	
	
	

}
