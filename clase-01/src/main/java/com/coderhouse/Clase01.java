package com.coderhouse;

public class Clase01 {

	public static void main(String[] args) {
		
		
		
		/*DECLARACION DE VARIABLES*/
				
		byte variableA = 10;
		byte variableB = 12;
		int variableC = 1000;
		//en caso de que variable sea mayor a mil lo paso a int
		
		/*var numero = 1;
		numero = 10;*/
		
		String numeroA = "Hola";
		
		//string: varias letras 
		//char: 1 solo caracter o letra
		
		char letra = '+';
		String letraA = "b";
		String letraB = "asdasd";
				
		//comilla simple para un solo caracter en char
		//doble para cuando use string con más de uno
		
		
		
		/*CONCATENACION*/
		
		System.out.println(variableA + variableB);
		System.out.println("El resultado es " + (variableA + variableB));
		
		
				
		/*HACEMOS UNA CALCULADORA*/
		
		float numero1 = 12f;
		float numero2 = 12f;
		float resultado;
		
		resultado = numero1 + numero2; 
		
		System.out.println("El resultado es " + resultado);
		
		//para hacer resta o multiplicación división, eso lo cambio en resultado, en vez de poner 
		//resultado = numero1 + numero2, pongo resultado = numero1 / numero2 y así
		
		//módulo % es el resto de una división: 10/10 =1
		
		
		
		/*INCREMENTOS*/

		int contador = 1;
		
		System.out.println(contador);
		contador = contador + 1;
		System.out.println(contador);
		contador = contador + 1;
		System.out.println(contador);
		
		//y si quiero que se autoincremente:
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		
		//lo mismo para decrementar con --
		System.out.println(contador);
		contador--;
		System.out.println(contador);
		
		
		/*OPERADORES RELACIONALES*/
		
		//contador == contador compara valor de dos variables
		//contador === contador compara valor y tipo de dos variables
		//contador != contador compara si son distintos
		//contador > contador verifica si el primero es mayor
		//contador < contador verifica si el primero es menor
		//contador >= contador verifica si el primero es mayor o igual
		//contador <= contador verifica si el primero es menor o igual
		
		
		
		
	}

}
