package com.coderhouse;

public class Ejercicios01 {

	public static void main(String[] args) {
		
/*EJERCICIOS SOBRE VARIABLES Y TIPOS DE VARIABLES*/
		
//Crear una variable entera que almacene la edad de un usuario.
		byte edad = 10;
		System.out.println("La edad del usuario es " + edad);
		
//Definir una constante para el número de días en una semana.
		final int dias = 7;
		System.out.println("El número de días en una semana es " + dias);
		
//Declarar una variable de tipo double para almacenar el precio de un producto.
		double precio = 4.99d;
		System.out.println("El precio de este producto es " + precio);
		
//Crear una variable booleana que indique si un estudiante está aprobado o no.
		boolean aprobado = true;
		System.out.println("El estudiante está aprobado? " + aprobado);
		
//Utilizar una variable de tipo char para almacenar la inicial del nombre de una persona.
		char inicialNombre = 'A';
		System.out.println("Inicial del nombre de la persona es " + inicialNombre);
		
//Crear un arreglo de enteros que almacene las notas de 5 estudiantes.
		int[] notasEstudiantes = {85, 90, 78, 88, 92};

        /* Usar un bucle for para recorrer el arreglo y mostrar las notas*/
        for (int i = 0; i < notasEstudiantes.length; i++) {
            System.out.println("Nota del estudiante " + (i + 1) + ": " + notasEstudiantes[i]);
        }
//-------------------------------------ESTE NO LO ENTENDI-----------------------------------//
        
//Definir una variable de tipo String que almacene el nombre completo de una persona.
        String nombre = "Juan Perez";
        System.out.println("Nombre completo: " + nombre);
        
//Crear una variable float para almacenar el peso de una persona.
        float peso = 45f;
        System.out.println("Peso de la persona: " + peso + "kg");
        
/*EJERCICIOS SOBRE CONSTANTES*/
        
//Declarar una constante para representar el número PI (3.14).
       final double pi = 3.14d;
       System.out.println("Valor de pi: " + pi);
       
//Crear una constante que contenga el valor máximo de estudiantes en un aula.
       final byte maxEstudiantes = 30;
       System.out.println("Máximo de estudiantes en un aula: " + maxEstudiantes);
       
/*EJERCICIOS SOBRE OPERADORES*/
       
//Realizar una suma de dos números enteros y mostrar el resultado.
       int numero1 = 2;
       int numero2 = 4; 
       int resultado;
       resultado = numero1 + numero2;
       System.out.println("El resultado de la suma es: " + resultado);
       
//Restar dos números de tipo double y mostrar el resultado.
       double num1 = 10d;
       double num2 = 5d;
       double resultadoResta;
       resultadoResta = num1 - num2;
       System.out.println("El resultado de la resta es: " + resultadoResta);
       
//Multiplicar dos números y mostrar el resultado en pantalla.
       int num3 = 4;
       int num4 = 5;
       int resultadoMultipl;
       resultadoMultipl = num3 * num4;
       System.out.println("El resultado de la multiplicación es: " + resultadoMultipl);
       
//Dividir dos números y manejar la excepción de división por cero (es decir, qué pasa si divido por 0
       int num5 = 10;
       int num6 = 3;
       int resultadoDiv;
       try {
    	    resultadoDiv = num5 / num6; // Esto lanzará una excepción si num6 es 0
    	    System.out.println("El resultado de la división es: " + resultadoDiv);
    	} catch (ArithmeticException e) {
    	    System.out.println("Error: División por cero no es permitida.");
    	}
/*--------------------------------------TAMPOCO ENTENDÍ------------------------------------*/
       
//Usar el operador % para encontrar el residuo de una división.ej: 10/3=3. el residuo es 1
       int resultadoResiduo;
       resultadoResiduo = num5 % num6;
       System.out.println("El residuo de esta división es: " + resultadoResiduo);
/*Ejercicios sobre Operadores Relacionales*/
//Comparar dos enteros y mostrar si el primero es mayor que el segundo.
//Verificar si un número es par usando el operador %.
//Comparar dos String para ver si son iguales.
//Crear una condición que verifique si un estudiante está aprobado (nota >= 6).
//Utilizar operadores lógicos para verificar si un número está entre 1 y 10.
/*Ejercicios sobre Buenas Prácticas*/
//Escribir un código que declare variables siguiendo las convenciones de nomenclatura (camelCase).
//Agregar comentarios explicativos a un fragmento de código que declare y utilice variables.
//Refactorizar un código para eliminar variables innecesarias.
//Organizar un código en métodos para mejorar su legibilidad.
//Utilizar nombres descriptivos para las variables en un pequeño programa.
/*Ejercicios sobre Variables Primitivas y No Primitivas*/
//Crear una clase Persona que tenga variables primitivas como edad y altura.
//Declarar un arreglo de String para almacenar los nombres de los días de la semana.
//Definir un ArrayList<Integer> para almacenar las edades de varios estudiantes.
//Crear un objeto de la clase Persona y asignar valores a sus variables.
/*Ejercicios sobre Componentes del Lenguaje*/
//Crear un paquete com.ejemplo y dentro de él una clase llamada Ejemplo.
//Escribir un programa que use múltiples clases y acceda a sus métodos desde una clase principal.
//Definir un método estático que reciba un int y devuelva su cuadrado.
//Crear una clase Estudiante con atributos como nombre y nota.
/*Ejercicios de Integración*/
//Escribir un programa que calcule el área de un círculo usando una constante para PI.
//Crear un programa que determine si un número es primo utilizando operadores relacionales y bucles.
//Desarrollar un pequeño sistema de gestión de notas que almacene las notas de varios estudiantes y calcule su promedio.
//Crear una calculadora simple que permita sumar, restar, multiplicar y dividir dos números.
//Implementar un programa que reciba un String y cuente la cantidad de vocales que tiene.*/

	}

}
