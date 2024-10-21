package com.coderhouse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Clase05 {

	public static void main(String[] args) {
/*----------------------------HAGO OTRO EJEMPLO DE EXCEPCION TRY CATCH ABAJO----------------------------------
		
		//excepciones: vamos a dividir por 0
		try {
		double resultado = 10/0; // lo hago con try catch para controlar el error. si hago solo 10/0 me va a dar una ArithmeticException 
		
		System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: no se puede dividir por cero");
		}
		
-----------------------------------------------------------------------------------------------------------*/		
		
/*----------------------------COMENTO Y HAGO OTRO TIPO DE EXCEPCION ABAJO-------------------------------------

		//cómo manejo el llamar a una clase inexistente con try catch
		try {
			Class.forName("com.coderhouse.ClaseInexistente");
		} catch (ClassNotFoundException e) {
			System.out.println("Error: la clase ClaseInexistente no existe");	
		}
		
		//tambien puedo probar un método privado
		int x = 10;
		int y = 0;
		dividir (x, y);
	}		
		private static void dividir(int x, int y) {
			try {
				System.out.println(x/y);
			} catch (ArithmeticException e) {
				System.out.println("Error: no se puede dividir por cero");
		}
		
-----------------------------------------------------------------------------------------------------------*/		
				
		//Supongamos que me quiero conectar a una bbdd y no puedo
		
		try {
			Connection connection = DriverManager.getConnection("url de mi bbdd");
		} catch (SQLException e) {
			System.out.println("Error: no se pudo conectar a las bbdd");
		}
		
		
/*---------------no tocar---------*/
		}
}


