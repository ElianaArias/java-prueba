package com.coderhouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;

@SpringBootApplication
public class Clase09Application implements CommandLineRunner{
	
	//ahora creo un alumnos y cursos y los guardo en mi bbdd. para eso, si o si tengo que hacer una inyeccion de mi servicio, para eso tengo que inyectar todos los metodos que tengo en ese servicio
	@Autowired //con esto dejo disponibles los 2 metodos que acabo de crear en dao par que los use cuando quiera
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase09Application.class, args);
	}
	
	//ahora tengo que crear unos alumnos porque necesito que haga algo mas ademas de run. quiero que haga una sobrescritura de metodos
	
	public void run(String...arg) throws Exception{
		try {
			//creo una categoria antes de crear un curso
			Categoria categoria1 = new Categoria("Programacion front end");
			Categoria categoria2 = new Categoria("Programacion back end");

			
			//primero creo 3 cursos y un alumno. pero para eso primero debo crear un constructor en mis clases alumno y curso
			Curso curso1 = new Curso("Html", categoria1);//le asigno una categoria a cada curso
			Curso curso2 = new Curso("CSS", categoria1);
			Curso curso3 = new Curso("Java", categoria2);
			
			Alumno alumno1 = new Alumno("Eliana", "Arias", 13131313, "L13131313"); //o simplemente puedo pasarle los parametros con getters y setters
			Alumno alumno2 = new Alumno("Agustin", "Barraza", 12121212, "L12121212"); 
			Alumno alumno3 = new Alumno("Bruno", "Lezama", 15151515, "L15151515");

			/*dejo comentado los create para que no vuelva a crearme todo
			//para que las tablas no me aparezcan vacias, uso dao para crear alumnos cursos y categorias:
			dao.createCategoria(categoria1);
			dao.createCategoria(categoria2);
			
			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);
			
			dao.createCurso(curso1);
			dao.createCurso(curso2);
			dao.createCurso(curso3);

			//y hago correr la aplicacion desde run as--sb application
			*/
			
			//pruebo si anda todo ok despues de tocar dao con categorias cursos y alumnos. me sale todo bien listado
			System.out.println("Mostrar lista de Categorias");
			List<Categoria> categorias = dao.getAllCategorias();//quiero ver una lista de categorias asi que la creo
			categorias.forEach(categoria -> System.out.println(categoria.toString())); //por cada categoria, imprimime la lista como string
			/*System.out.println(categorias);//si imprimo esto, me muestra un array vacio. tengo que hacer que el dao la popule*/
			System.out.println("---------------------------");
			
			System.out.println("Mostrar lista de Cursos");
			List<Curso> cursos = dao.getAllCursos();
			cursos.forEach(curso -> System.out.println(curso.toString()));
			System.out.println("---------------------------");
			
			System.out.println("Mostrar lista de Alumnos");
			List<Alumno> alumnos = dao.getAllAlumnos();
			alumnos.forEach(alumno -> System.out.println(alumno.toString()));
			System.out.println("---------------------------");
			
			System.out.println("Mostrar lista de Cursos con alumnos inscriptos");
			cursos = dao.getAllCursos();
			cursos.forEach(curso -> {
					System.out.println("Curso: " + curso.getNombre());
			});
			System.out.println("---------------------------");
			
			System.out.println("Mostrar lista de Alumnos con sus cursos");
			alumnos.forEach(alumno -> {
			System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " está inscripto en los cursos: ");
			for (Curso curso : alumno.getCursos()) {
				System.out.println(" - " + curso.getNombre());
				}
			});
			System.out.println("---------------------------");
			
		/*TODO ESTO LO COMENTO PORQUE NO ANDA. LO DEJAMOS PARA LA PROXIMA CLASE. se me estaba haciendo un bucle infinito. lo arreglé en curso
			//agrego metodo para inscribirse
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno1.getId());//inscribo al alumno1 en el curso1
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno2.getId());
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno3.getId());
			
			dao.inscribirAlumnoEnCurso(curso2.getId(), alumno2.getId());
			dao.inscribirAlumnoEnCurso(curso2.getId(), alumno3.getId());
			
			dao.inscribirAlumnoEnCurso(curso3.getId(), alumno2.getId());
		*/
			
		}catch(Exception e) {             //poniendo esto ya trabajamos la excepcion   
			e.printStackTrace(System.err);
		}
	}
	
	
	
	
	

}
