package com.coderhouse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ejercicios03 {

	public static void main(String[] args) {
//Arrays
		// 1.Crea un array de enteros de tamaño 5 y asigna valores a cada elemento.
		int[] arrayEnteros = new int[5]; // declaro una nueva instancia
		arrayEnteros[0] = 1; // asigno valor a cada indice
		arrayEnteros[1] = 2;
		arrayEnteros[2] = 3;
		arrayEnteros[3] = 4;
		arrayEnteros[4] = 5;
		System.out.println(arrayEnteros.length); // cuántos elementos tengo
		System.out.println(Arrays.toString(arrayEnteros));

		// 2.Suma todos los elementos de un array de enteros y muestra el resultado.
		int sumaEnteros = 0; // declaro la variable donde voy a tener los numeros sumados
		for (int entero : arrayEnteros) { // declaro la variable entero para que cuente cada elemento en el indice
			sumaEnteros += entero; // += sirve para que a se sume a b y el resultado pase a ser el nuevo valor de
									// a.
		}
		System.out.println("La suma de los elementos del array es " + sumaEnteros);

		// 3.Encuentra el número mayor en un array de enteros.
		int mayorEnteros = arrayEnteros[0];
		for (int entero = 1; entero < arrayEnteros.length; entero++) { // parametros de inicializaacion (por donde
																		// arranco) ,finalizacion (el bucle funciona
																		// hasta alcanzar longitud del array)y de
																		// incremento(para que avance y pase x cada
																		// elemento)
			if (arrayEnteros[entero] > mayorEnteros) { // si un entero del array es mayor que mi variable mayorEnteros,
				mayorEnteros = arrayEnteros[entero]; // entonces le asigno ese nuevo valor a esta ultima
			}
		}
		System.out.println("El numero mayor en el array es " + mayorEnteros);

		// 4.Encuentra el número menor en un array de enteros.
		int menorEnteros = arrayEnteros[0];
		for (int entero = 1; entero < arrayEnteros.length; entero++) {
			if (arrayEnteros[entero] < menorEnteros) { // si un entero del array es menor que mi variable menorEnteros,
				menorEnteros = arrayEnteros[entero]; // entonces le asigno ese nuevo valor a esta ultima
			}
		}
		System.out.println("El numero menor en el array es " + menorEnteros);

		// 5.Cuenta cuántos números pares hay en un array.
		int parEnteros = arrayEnteros[0];
		for (int entero = 1; entero < arrayEnteros.length; entero++) {
			if (arrayEnteros[entero] % 2 == 0) { // si mi numero resulta par,
				parEnteros++; // incremento su valor para que pase al siguiente indice, y asi hasta que se
								// alcance la longitud del array
			}
		}
		System.out.println("La cantidad de numeros pares en el array es " + parEnteros);

		// 6.Invierte los elementos de un array de enteros.
		
		  System.out.println("Dada mi lista original: " + Arrays.toString(arrayEnteros));
		int inicio = 0; // que arranque recorrido por posicion 0
		int fin = arrayEnteros.length -1;// que termine en mi ultima posicion

		while (inicio < fin) {
			int invertidos = arrayEnteros[inicio]; // en esta variable guardo momentaneamente el elemento en cada posicion 
			arrayEnteros[inicio] = arrayEnteros[fin];//cuando el recorrido coincida en las posiciones
			arrayEnteros[fin] = invertidos; //intercambiamos los elementos de cada una
			
		inicio++;//hago que se muevan los indices de inicio a fin
		fin--;//y del final al inicio. asi a medida que se encuentren van cambiando el elemento
		}
		System.out.println("La invierto: " + Arrays.toString(arrayEnteros));
		
		
/*---------------------------------------------------KIIIIIIIIIIII-------------------------------------------*/

		
		// 7.Crea un array de cadenas y muestra sus elementos.
		String [] dias = {
				"lunes", 
				"martes",
				"miercoles",
				"jueves",
				"viernes"
		};
	System.out.println("Los elementos de la cadena son: " + Arrays.toString(dias));
				
		// 8.Ordena un array de enteros en orden ascendente.
	int [] enteros = {40, 32, 55, 54};
	System.out.println("Dado mi array original: " + Arrays.toString(enteros));
	Arrays.sort(enteros);
	System.out.println("Lo ordeno de forma ascendente: " + Arrays.toString(enteros));

	
		// 9.Encuentra si un número está en un array y muestra su índice.
	System.out.println("Dado mi array: " + Arrays.toString(enteros));
	int numeroBuscado = 40; //lo que voy a buscar dentro del array
	int indiceBuscado = Arrays.binarySearch(enteros, numeroBuscado); // dentro del array enteros, busco lo que quiero y devuelve el indice
	if (indiceBuscado >= 0) {//pongo esto para chequear que el indice devuelto se encuentre dentro del array (que va de 0 en adelante)
		System.out.println("El numero " + numeroBuscado + " se encuentra en el indice " + indiceBuscado);
	} else {
		System.out.println("El numero " + numeroBuscado + "no se encuentra en el array");
	}
	
	
		// 10.Muestra los elementos de un array en orden inverso.
	System.out.println("Dado mi array original: " + Arrays.toString(enteros));
	
	int start = 0;//voy a recorrer el array asi que le digo donde empezar y terminar
	int end = enteros.length -1;
	while (start <end) {//mientras permanezca dentro del bucle, se va a ejecutar
		int invertir = enteros[start];//el elemento de mi posicion inicial pasa a estar en la variable invertir
		enteros[start] = enteros[end];//el elemento de mi posicion fin pasa a estar  en la posicioin inicio
		enteros[end] = invertir;//el elemento en la posicion invertir pasa a estar en la posicion fin
		start++;//para invertir los elementos, deben encontrarse en el medio los indices
		end--;//a medida que se encuentran en la misma posicion, se van  invirtiendo
	}
	System.out.println("El array invertido es: " + Arrays.toString(enteros));
	
	
//List
		// 11.Crea una List de números enteros y añade 5 valores.
	  List<Integer> numEnteros = new ArrayList<>();//primero importo list y arraylist
      
      numEnteros.add(10);//y añado los 5 valores
      numEnteros.add(20);
      numEnteros.add(30);
      numEnteros.add(40);
      numEnteros.add(50);
      
      System.out.println("La lista de números enteros es: " + numEnteros);
  
		// 12.Elimina el primer elemento de una List de enteros.
	int indice = 0;
	System.out.println("El elemento en la primera posición es: " + numEnteros.get(indice));
	numEnteros.remove(0);
	System.out.println("Lo elimino y mi lista actual es: " + numEnteros);
	
		
	
		// 13.Encuentra el tamaño de una List de enteros.
	System.out.println("El tamaño de mi lista ahora es: " + numEnteros.size());
	
	
		// Suma todos los elementos de una List de enteros.
	  int sumaTotal = 0;//defino mi variable
      
      for (int numero : numEnteros) {// Sumar todos los elementos de la lista
          sumaTotal += numero;
      }

      System.out.println("La suma total de los elementos es: " + sumaTotal);
   /*----------------------------------------NO ENTENDI CREO----------------------------------------------------*/   
      
	// 14.Encuentra el número mayor en una List de enteros.
      int numMayor = Collections.max(numEnteros);
      System.out.println("El número mayor en la lista es: " + numMayor);
      

	//15. Verifica si un valor está presente en una List de enteros.
      int valor = 30;
      boolean presente = numEnteros.contains(valor); // Verificar si el valor está presente en la lista usando contains()

      if (presente) {      // Mostrar el resultado
          System.out.println("El valor " + valor + " está presente en la lista");
      } else {
          System.out.println("El valor " + valor + " no está presente en la lista");
      }
      
      
	// 16.Convierte una List en un array y muestra sus elementos.
      System.out.println("Dada mi lista: " + numEnteros);
      Integer[] arrayDeEnteros = numEnteros.toArray(new Integer[0]);//declaro mi nueva variable (nuevo array) y la inicializo
      
      System.out.println("La convierto en un array: " + Arrays.toString(arrayDeEnteros));
      
      
	// 17.Crea una List de cadenas y añade nombres de frutas.
      List<String> frutas = new ArrayList<>();
		frutas.add("uva");
		frutas.add("pera");
		frutas.add("kiwi");
		frutas.add("melon");
		frutas.add("higo");
		System.out.println("Mi nueva lista es: " + frutas);
	// 18.Recorre una List de cadenas y muestra cada elemento.
		System.out.println("Y estos son sus elementos:");
	        for (String fruta : frutas) {//va a imprimir cada fruta que encuentre en la lista frutas
	            System.out.println(fruta);
	        }
	        
	        
	// 19.Elimina todos los elementos de una List.
	   frutas.removeAll(frutas);
	   System.out.println(frutas);//borré la lista así que solo va a imprimir corchetes vacíos
	        
	        
//Iterable (bucles)
		// 20.Crea una List de números y utiliza Iterable para recorrerla.
	        List<Integer> listNumeros = new ArrayList<>();//creo lista
	        listNumeros.add(10);//agrego elementos
	        listNumeros.add(15);
	        listNumeros.add(20);
	        listNumeros.add(25);
	        listNumeros.add(23);
	        
	        System.out.println("La recorro con iterable:");
	        Iterator<Integer> iterador = listNumeros.iterator();//aca uso iterable para recorrerla
	       
	        while(iterador.hasNext()) {/*pregunto si iterator tiene un siguiente. arranca mostrando el 0 y vuelve a arriba para mostrar el 1, y asi sigue*/
				int numeros = iterador.next(); //iterador next devuelve el siguiente elemento de la lista
				System.out.println("Nombre es: " + numeros);
	        }
	        
	        
		// 21.Implementa una clase que implemente la interfaz Iterable y recorra un array.
		// 22.Utiliza Iterable para recorrer una colección de cadenas y mostrar los elementos.
		// 23.Crea una clase que tenga un método que devuelva un Iterable de enteros.
		// 24.Convierte una List en un Iterable y úsala en un ciclo for.
		// 25.Implementa un Iterable que permita recorrer un array de enteros.
		// 26.Crea un Iterable de números impares y recorre los valores.
		// 27.Usa un Iterable para recorrer una lista de palabras y contar cuántas tienen más de 5 letras.
		// 28.Crea una colección de números y úsala en un Iterable para encontrar cuántos son pares.
		// 29.Implementa un Iterable para recorrer una matriz bidimensional.
//Iterator
		// 30.Crea una List de enteros y usa un Iterator para recorrerla.
		// 31.Elimina elementos impares de una List usando un Iterator.
		// 32.Recorre una lista de cadenas con un Iterator y muestra sus elementos.
		// 33.Cuenta cuántos elementos hay en una List utilizando un Iterator.
		// 34.Elimina elementos de una List que comiencen con una vocal utilizando un
		// Iterator.
		// 35.Usa un Iterator para recorrer un array de enteros.
		// 36.Recorre una List de números con un Iterator y muestra solo los números mayores que 50.
		// 37.Modifica los valores de una List de enteros usando un Iterator.
		// 38.Crea una List de enteros y elimina los números negativos con un Iterator.
		// 39.Usa un Iterator para recorrer una lista de palabras y eliminar las que tengan menos de 3 letras.
//Ciclo for
		// 40.Imprime los números del 1 al 10 usando un ciclo for.
		// 41.Suma todos los números del 1 al 100 usando un ciclo for.
		// 42.Imprime los números pares del 2 al 20 usando un ciclo for.
		// Recorre un array de enteros con un ciclo for y muestra cada valor.
		// 43.Imprime los múltiplos de 5 del 5 al 50 usando un ciclo for.
		// 44.Encuentra el número mayor en un array de enteros usando un ciclo for.
		// 45.Crea un programa que imprima los primeros 10 números de la secuencia Fibonacci usando for.
		// 46.Multiplica todos los elementos de un array de enteros por 2 usando un ciclo for.
		// 47.Imprime las letras de una cadena de texto usando un ciclo for.
		// 49.Crea un programa que imprima una tabla de multiplicar del 1 al 10 usando for.
//Ciclo foreach
		// 50.Recorre un array de enteros usando foreach y muestra cada valor.
		// 51.Imprime los elementos de una List de cadenas usando foreach.
		// 52.Crea un array de enteros y suma sus elementos usando un ciclo foreach.
		// 53.Multiplica todos los elementos de un array de enteros por 3 usando foreach.
		// 56.Recorre un array de enteros y muestra los pares usando foreach.
		// 57.Recorre una List de cadenas y muestra solo las que tienen más de 5 letras usando foreach.
		// 58.Convierte todos los elementos de una lista de cadenas a mayúsculas usando foreach.
		// 59.Cuenta cuántos números negativos hay en un array de enteros usando foreach.
		// 60.Recorre una lista de enteros y elimina los menores de 10 usando foreach.
		// 61.Recorre una lista de cadenas y concatena todas las palabras usando foreach.
//Ciclo while
		// 62.Imprime los números del 1 al 10 usando un ciclo while.
		// 63.uma todos los números del 1 al 100 usando while.
		// 64.Encuentra el número mayor en un array usando while.
		// 65.Cuenta cuántos números impares hay en un array usando while.
		// 67.Imprime los números pares entre 1 y 20 usando while.
		// 68.Recorre una lista de enteros usando while y muestra cada elemento.
		// 69.Cuenta cuántos elementos hay en una lista de cadenas usando while.
		// 70.Imprime los múltiplos de 7 del 7 al 70 usando while.
		// Usa un ciclo while para encontrar el factorial de un número.
		// Recorre un array de enteros y encuentra el menor valor usando while.
//Ciclo do-while
		// Imprime los números del 1 al 10 usando un ciclo do-while.
		// Imprime los números impares del 1 al 20 usando do-while.
		// Suma todos los números del 1 al 50 usando do-while.
		// Cuenta cuántos números negativos hay en un array usando do-while.
		// Imprime las letras de una cadena de texto usando do-while.
		// Imprime los múltiplos de 3 del 3 al 30 usando do-while.
		// Recorre un array de enteros y muestra los números pares usando do-while.
		// Cuenta los elementos de una List de enteros usando do-while.
		// Imprime los números del 100 al 1 usando do-while.
		// Calcula la suma de los dígitos de un número usando do-while.
//Operadores lógicos &&, ||, !
		// Determina si un número es positivo y par usando &&.
		// Verifica si una persona es mayor de edad o tiene un permiso especial usando
		// ||.
		// Comprueba si un número no es negativo usando !.
		// Determina si una persona puede entrar a una película (mayor de 18 y tiene
		// boleto) usando &&.
		// Verifica si un número está en un rango (mayor que 10 y menor que 20) usando
		// &&.
		// Determina si un número no es par usando !.
		// Verifica si una cadena no está vacía y su longitud es mayor que 5 usando &&.
		// Comprueba si un número es divisible por 2 o por 3 usando ||.
		// Determina si una cadena no contiene un carácter específico usando !.
		// Verifica si un número es impar o mayor que 100 usando ||.
//Operaciones con Math.random()
		// Genera un número aleatorio entre 0 y 1 y muestra si es mayor o menor que 0.5.
		// Simula un lanzamiento de un dado y muestra el resultado.
		// Genera un número aleatorio entre 1 y 100 y muestra si es par o impar.
		// Simula una moneda y muestra "Cara" o "Cruz" dependiendo del resultado.
		// Genera un número aleatorio entre -50 y 50 y determina si es positivo o
		// negativo.
		// Simula un lanzamiento de dos dados y muestra si la suma es mayor que 7.
		// Genera 10 números aleatorios entre 1 y 100 y muestra el mayor.
		// Genera un número aleatorio y verifica si está entre 10 y 20.
		// Simula un juego de adivinanza en el que el usuario debe adivinar un número
		// generado aleatoriamente entre 1 y 50.
		// Genera números aleatorios hasta que el número sea divisible por 7 y muestra
		// cuántos intentos fueron necesarios.

		/*----------------------------------LO DE ACABJO NO SE TOCA O ROMPO TOD0----------------------------------*/
}
}



