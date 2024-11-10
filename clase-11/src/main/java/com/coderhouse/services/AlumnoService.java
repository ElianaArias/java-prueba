package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Alumno;
import com.coderhouse.repositories.AlumnoRepository;

import jakarta.transaction.Transactional;

@Service
public class AlumnoService {
	
	//inyecto repositorio
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	//y métodos
	public List<Alumno> getAllAlumnos(){//listar alumnos
		return alumnoRepository.findAll();	
		}
	
	public Alumno findById(Long id) {//listar alumno por id
		return alumnoRepository.findById(id)//con esto, si no encuentro al alumno, me lanza una excepcion
				.orElseThrow(() -> new IllegalArgumentException("Alumno no encontrado"));
	}
	
	@Transactional
	public Alumno saveAlumno(Alumno alumno) {//guardar alumno
		return alumnoRepository.save(alumno);
		
	}
	
	@Transactional //decorador que avisa a sb qye haga una nueva transaccion. si uno de los datos ingresados es incorrecto, no me aplica el metodo
	public Alumno updateAlumno(Long id, Alumno alumnoDetails) {//recibe un long id y detalles de un alumno
		Alumno alumno = alumnoRepository.findById(id)//instancio alumno para ver si existe y lo guardo en la variable alumno
				.orElseThrow(() -> new IllegalArgumentException("Alumno no encontrado"));	//si no existe me tira error	
		alumno.setNombre(alumnoDetails.getNombre());//si existe lo tengo que setear
		alumno.setApellido(alumnoDetails.getApellido());//acá podría setear el dni o legajo si hiciera falta corregirlo
		
		if(alumnoDetails.getDni() != 0) { //hago una validacion para confirmar que estoy enviando un dni int
			alumno.setDni(alumnoDetails.getDni());
		}
		if(alumnoDetails.getLegajo() != null && !alumnoDetails.getLegajo().isEmpty()) {
			alumno.setLegajo(alumnoDetails.getLegajo());
		}
		return alumnoRepository.save(alumno); //le digo al repositorio que guarde el alumno que estoy construyendo
	}
	
	public void deleteAlumno(Long id) {
		if(!alumnoRepository.existsById(id)) {//pregunto si el alumno no existe. si existe lo borra, si no tengo que lanzar una excepcion
			throw new IllegalArgumentException("Alumno no encontrado");
		}
		alumnoRepository.deleteById(id);
	} 
	
	

}
