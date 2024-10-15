package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase04 {

	public static void main(String[] args) throws Exception {
		
		/*
		  
		Dejo comentado esto solo para hacer lo de abajo con listas. pero anda todo ok
		
		Ahora debo instanciar el objeto perro: hora creo el objeto perro
		Perro  primerPerro = new Perro();//perro es mi molde, y quiero darle un nombre

		Ahora cómo lo nombro? tengo que poder ver los atributos
		primerPerro.nombre = "Firulais";
		primerPerro.color = "Marron";
		primerPerro.edad = '3';
		primerPerro.raza = "Caniche";
		primerPerro.tamanio = "Chico";
				
		//defino variables
		
		primerPerro.setNombre("Firulais");
		primerPerro.setColor("Marron");

		primerPerro.ladrar();
		primerPerro.caminar();
		*/
		
		
		
		/*Primero hago la lista para usar for each
		String [] nombres = new String [] {
			"Lorena",
			"Alejandro",
			"Tristan",
			"Valentin"
		};
		
		ahora como hago para que mi metodo funcione? debo invocarlo
		
		imprimirListaDeNombres (nombres);
		sumarNumeros (5, 66);
		*/
		
		
		
		//uso try catch para manejo  del error que sale al ingresar 100 años
			
		try {
		Perro  primerPerro = new Perro();//perro es mi molde, y quiero darle un nombre
		primerPerro.setNombre ("Firulais");
		primerPerro.setColor ("Marron");
		primerPerro.setRaza ("Caniche");
		primerPerro.setTamanio ("Chico");
		primerPerro.setEdad (15); //pero no le puedo poner tanto. va a dar error. debo limitarlo. para eso voy a metodo set.edad
		
		System.out.println("Perro: " + primerPerro);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	private static void imprimirListaDeNombres (String [] nombresPersonas) {
		for (String nombre : nombresPersonas) {
			System.out.println("Nombre: " + nombre);
		}
		
	}
	
	//probamos otro metodo
	private static void sumarNumeros (int numeroA, int numeroB) {
		System.out.println("La suma entre "+ numeroA + " y " + numeroB + " es de: " + (numeroA + numeroB)); /*y uso parentesis al final en la suma para que lo sume primero antes de meterlo en la operacion. sin el parentesis estaría concatenando*/
	};*/
	//COMENTO LO ANTERIOR PAR Q NO MOLESTE
	double radio = 4d;
	
	System.out.println("El area del circulo con radio " + radio + " es igual a: " 
	+ calcularAreaDeUnCirculo (radio))
	
	
	//formaa de inicializar una constante estatica
		//inicializador estatico
		
		static final double PI; //puedo inicializar varias constantes aca adentro
		static final double PO; 

		static {
			PI = 3.14141414;
			PO = 30414141; //y puedo poner todo dentro de un mismo renglon desde static si quisiera
		}
		private static double calcularAreaDeUnCirculo (double radio) {//calculo el area de un circulo
			return PI * Math.pow(radio, 2);
		}

	
	
	
}
