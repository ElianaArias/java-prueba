package com.coderhouse.impresora;

public class Impresora {
	//OVERLOADING: sobrecarga de métodos
	//qué hace una impresora? 
	public void imprimir(int numero) {
		System.out.println("imprimiendo el numero " + numero);
	}
	
	//y si quiero que me imprima dos num distintos?
	public void imprimir(int numeroA, int numeroB) {
		System.out.println("imprimiendo los numeros " + numeroA + " " + numeroB);
	}
	
	//ahora quiero que me imprima un texto
	public void imprimir(String texto) {
		System.out.println("imprimiendo el texto " + texto);
	}
	//ahora un array de numeros
	public void imprimir(int[] numeros) {
		System.out.println("imprimiendo el array de numeros");
		for (int numero : numeros) {
			System.out.println(numero + "\n");
		}	
	}
	
	//si quiero imprimir dos string
	
	public void imprimir(String textoA, String textoB) {
			System.out.println("imprimiendo el texto " + textoA + "\nimprimiendo el texto " + textoB);
		}

}
