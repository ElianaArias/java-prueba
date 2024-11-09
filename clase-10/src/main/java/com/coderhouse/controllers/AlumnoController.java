package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.models.Alumno;
import com.coderhouse.repositories.AlumnoRepository;

@RestController
@RequestMapping("/api/alumnos")//le va a pedir una solicitud a la url api/alumnos
public class AlumnoController {

	@Autowired
	private AlumnoRepository alumnoRepository;//inyecto el repositorio que creamos recien de alumno, con autowired

	@GetMapping//método get para ver lista de alumnos
	public List<Alumno> getAllAlumnos(){
		return alumnoRepository.findAll();	
		}
	
	@GetMapping("/{id}") //método post para ver un alumno segun su id
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long id){ //paso el parametro id para que se use como variable en el response entity para capturar al alumno
		if(alumnoRepository.existsById(id)) { //le pido al respositorio una validación por true o false si el alumno existe o no
			Alumno alumno = alumnoRepository.findById(id).get(); //instancio al alumno, le pido al repo que lo busque y lo guarde en la variable que acabo de crear alumno
			return ResponseEntity.ok(alumno);//hago el return de la variable que acabo de crear. solo necesito que response me devuelva un msj. si el response me devuelve un ok, es decir que existe el alumno, me tiene que mostrar alumno
		} else {
			return ResponseEntity.notFound().build(); //y sino me tiene que mostrar el not found y con build ya tenemos capturado el error 404. esto es siempre igual
		}
	
	}

	@PostMapping //metodo post para crear el alumno. 
	public Alumno createAlumno(@RequestBody Alumno alumno){//el repo recibe un alumno
		
		return alumnoRepository.save(alumno);//lo va a guardar en la bbdd
	}
		
		

}