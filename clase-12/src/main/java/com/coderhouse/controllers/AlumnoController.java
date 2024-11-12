package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.dtos.InscripcionDTO;
import com.coderhouse.models.Alumno;
import com.coderhouse.services.AlumnoService;

@RestController
@RequestMapping("/api/alumnos")//le va a pedir una solicitud a la url api/alumnos
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;//hago que el controlador se comunique con el servicio

	@GetMapping//método get para ver lista de alumnos. el controlador me tiene que dar una respuesta del servidor en cada metodo
	public ResponseEntity<List<Alumno>> getAllAlumnos(){
		try { //try catch para manejar excepciones
			List<Alumno> alumnos = alumnoService.getAllAlumnos();
			return ResponseEntity.ok(alumnos);	//si tengo la lista, me manda un ok y muestra los alumnos
			
		}catch (Exception e) {//sino me tira esta excepcion
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();//me va a devolver este error 500 en caso de q no haya nada que mostrar o el servidor esté caido
		}
	}
	
	@GetMapping("/{id}") //para vevr segun id
		public ResponseEntity<Alumno> getAlumnoById(@PathVariable long id){
		try {
			Alumno alumno = alumnoService.findById(id);
			return ResponseEntity.ok(alumno);
		} catch (IllegalArgumentException e) {//por si el alumno no existe
			return ResponseEntity.notFound().build();
		} catch (Exception e) {//sino me tira esta excepcion
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}

	@PostMapping //post para agegar un alumno
	public ResponseEntity<Alumno> createalumno(@RequestBody Alumno alumno){
		try {
			Alumno createdAlumno = alumnoService.saveAlumno(alumno);
			return ResponseEntity.ok(createdAlumno);
			
		} catch (Exception e) {//sino me tira esta excepcion
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	@PutMapping("/{id}")//busco por id, alumno service lo busca y recube el rb, lo cambia al servicio y el conrolador retorna un mensaje de ok con el alumno modificado
	public ResponseEntity<Alumno> updateAlumnoById(@PathVariable Long id, @RequestBody Alumno alumnoDetails){
		try {
			Alumno updatedAlumno = alumnoService.updateAlumno(id, alumnoDetails);//instancio alumno que va a hacer un updatedalumno. y al servicio le paso mis 2 parametros
			return ResponseEntity.ok(updatedAlumno);//al retorno le paso el updated alumno
		} catch (IllegalArgumentException e) {//esta excepcion me tira un not found si el alumno no existe
			return ResponseEntity.notFound().build();
		} catch (Exception e) {//esta excepcion va siempre
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteAlumno(@PathVariable Long id){
		try {
			alumnoService.deleteAlumno(id);
			return ResponseEntity.noContent().build();//devuelve codigo 200 indicando que el alumno está eliminado
			
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//metodo para inscribir alumno a curso
	@PostMapping("/inscribir")
	public ResponseEntity<Alumno> inscribirAlumnoACursos(@RequestBody InscripcionDTO inscripcionDTO){
		try {
			Alumno alumno = alumnoService.inscribirAlumnoACursos(inscripcionDTO);
			return ResponseEntity.ok(alumno);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
}