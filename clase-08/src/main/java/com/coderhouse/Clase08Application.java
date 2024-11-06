package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.modelos.Alumno;
import com.coderhouse.modelos.Curso;

@SpringBootApplication
public class Clase08Application implements CommandLineRunner{ //esto me habilita a sobrescribir el metodo run
	
	//ahora creo un alumnos y cursos y los guardo en mi bbdd. para eso, si o si tengo que hacer una inyeccion de mi servicio, para eso tengo que inyectar todos los metodos que tengo en ese servicio
	@Autowired //con esto dejo disponibles los 2 metodos que acabo de crear en dao par que los use cuando quiera
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}
	
	//ahora que tengo que crear unos alumnos, necesito que haga algo mas ademas de run. quiero que haga una sobrescritura de metodos
	
	public void run(String...arg) throws Exception{
		try {
			//primero creo 3 cursos y un alumno. pero para eso primero debo crear un constructor en mis clases alumno y curso
			Curso curso1 = new Curso("Html");
			Curso curso2 = new Curso("CSS");
			Curso curso3 = new Curso("Java");
			
			Alumno alumno1 = new Alumno("Eliana", "Arias", 13131313, "EA131313"); //o simplemente puedo pasarle los parametros con getters y setters
			Alumno alumno2 = new Alumno("Agustin", "Barraza", 12121212, "AB121212"); 
			Alumno alumno3 = new Alumno("Bruno", "Lezama", 15151515, "BL151515");

			//para que las tablas no me aparezcan vacias, uso dao para crear alumnos y cursos:
			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);
			
			dao.createCurso(curso1);
			dao.createCurso(curso2);
			dao.createCurso(curso3);
			//y hago correr la aplicacion desde run as--sb application
			
		}catch(Exception e) {             //poniendo esto ya trabajamos la excepcion.luego hago los cursos y alumnos que tengo arriba 
			e.printStackTrace(System.err);
		}
	}
	
	
	
	
	

}
