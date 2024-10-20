package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase04 {

	public static void main(String[] args) throws Exception {
		
//DE ACÁ PARA ABAJO, TODO LO QUE ESTÁ COMENTADO Y TIENE LLAVES, OJO! PORQUE PUEDEN ESTAR REPETIDAS AFUERA PARA QUE FUNCIONE EL CÓDIGO		
		  

/*--------------------------------------------------------------------------------------------------
		 Dejo comentado esto solo para hacer lo de abajo con listas. pero anda todo ok
		 
		
//		//Ahora debo instanciar el objeto perro: hora creo el objeto perro
//		Perro  primerPerro = new Perro();//perro es mi molde, y quiero darle un nombre
//
//		//Ahora cómo lo nombro? tengo que poder ver los atributos
//		primerPerro.nombre = "Firulais";
//		primerPerro.color = "Marron";
//		primerPerro.edad = '3';
//		primerPerro.raza = "Caniche";
//		primerPerro.tamanio = "Chico";
//		
//		primerPerro.ladrar();
//		primerPerro.caminar();
//		
//		//Defino nombre de mi variable
//	
//		primerPerro.setNombre ("Firulais");
//		primerPerro.setColor("Marron");
/*------------------------------------------------------------------------------------------------------------*/

		
/*------------------------------------------------------------------------------------------------------------
					Dejo comentado esto para trabajar excecpciones pero anda todo ok
		
//ARRANCO EJEMPLO LISTA: quiero armar una lista y un metodo para recorrerla y ver los nombres
//		
//		//Primero hago la lista
//		String [] nombres = new String [] {
//			"Lorena",
//			"Alejandro",
//			"Tristan",
//			"Valentin"
//		};
//		//y tercero lo invoco para que mi metodo imprimirListaDeNombres funcione
//		imprimirListaDeNombres(nombres);
//		//y 2do invoco mi segundo método sumarNumeros
//		sumarNumeros (5,66);
//		
//	}		
//		//segundo creo mi metodo y la recorro usando for each
//		private static void imprimirListaDeNombres (String[] nombres) {
//			for (String nombre : nombres) {
//			System.out.println("Nombre: " + nombre);	
//			}
//		}
//		
//		
//		
////OTRO MÉTODO: sumarNumeros
//		//1ro creo mi metodo y sigo arriba
//		private static void sumarNumeros (int numeroA, int numeroB) {
//			System.out.println("La suma entre "+ numeroA + " y " + numeroB + " es de: " + (numeroA + numeroB)); /*y uso parentesis al final en la suma para que lo sume primero antes de meterlo en la operacion. sin el parentesis estaría concatenando*/
//		};										//puede quedar así o puedo pedirle que muestre un resultado
/*----------------------------------------------------------------------------------------------------------*/
		
		
		
/*---------------------------------------AHORA VAMOS CON EXCEPCIONES----------------------------------------*/
//traigo de vuelta el ejemplo del perro. voy a trabajar la edad con rango, así controlo el mensaje de error
		Perro  primerPerro = new Perro();
		
		try { //trata de imprimir esto
		primerPerro.setNombre ("Firulais");
		primerPerro.setColor("Marron");
		primerPerro.setRaza("caniche");
		primerPerro.setTamanio("chico");
		primerPerro.setEdad(10);//acá no puedo poner cualquier num, para controlar eso debo ir a Perro y trabajar algo 1ro
	//acá no debo olvidar add throws declaration. sino no anda todo lo que hice en Perro. Le va a agregar throws exc al metodo que etá haciendo la instancia (al lado de args arriba de todo)
		//System.out.println("Perro: " + primerPerro);//funciona si genero tostring en Perro primero
	} catch (Exception e) { //sino lanzame la excepcion. y la excepcion me pide un mensaje de error
		e.printStackTrace(); //esto es asi. no tocamos nada mas
	}
		
		
/*------------------------------INICIALIZADOR ESTÁTICO DENTRO DE MAIN-------------------------------------*/
	
		
		double radio = 4d; //3ro para eso declaro esta variable, para usar un random en mi msj

		System.out.println("El area del circulo con radio\n " + radio + " es igual a: " //2do compruebo q la variable anda imprimiendola
		+ calcularAreaDeUnCirculo (radio));
}		//esta llave va aca para que el static quede fuera del main
	
	//1ro inicializo mi constante estatica: con un inicializador estatico
		static final double PI; //esto va fuera del main pero el metodo lo voy a hacer dentro, es decir arriba
		static final double PO; 

		static {//puedo inicializar varias constantes aca adentro
			PI = 3.14141414;
			PO = 30414141; //y puedo poner todo dentro de un mismo renglon desde static si quisiera
		}
		private static double calcularAreaDeUnCirculo (double radio) {//calculo el area de un circulo
			return PI * Math.pow(radio, 2); //calculame pi*radio al cuadrado. que haga potencia entre radio y cuadrado
		}
		
}

