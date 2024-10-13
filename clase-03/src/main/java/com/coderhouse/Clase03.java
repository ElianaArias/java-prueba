package com.coderhouse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.Arrays;

public class Clase03 {

	public static void main(String[] args) {
		
/*este array lo uso si de entrada sé cuántos elementos voy a tener*/
		
		int [] arrayInt = new int [6];
		arrayInt [0] = 1;
		arrayInt [1] = 2;
		arrayInt [2] = 3;
		arrayInt [3] = 4;
		arrayInt [4] = 5;
		arrayInt [5] = 6;
		
		System.out.println("La cantidad de elementos del array es: " + arrayInt.length); /*array es un objeto. con 1 punto puedo acceder a uno de los metodos*/
		/*con length puedo saber longitud del array*/
		
		/*ahora para ver todos los elementos del array*/
	//	System.out.println(Arrays.toString(arrayInt));
		/*ahora para ver un elemento en particular*/
		System.out.println("El elemento del array con indice 0 es: " + arrayInt[0]);
		System.out.println("El elemento del array con indice 1 es: " + arrayInt[1]);
		System.out.println("El elemento del array con indice 2 es: " + arrayInt[2]);
		System.out.println("El elemento del array con indice 3 es: " + arrayInt[3]);
		System.out.println("El elemento del array con indice 4 es: " + arrayInt[4]);
		System.out.println("El elemento del array con indice 5 es: " + arrayInt[5]);
		
/*y este array lo uso cuando voy a ir cargando los elementos a mano*/
		
		String[] palabras = {
				"Hola",
				"Mundo",
				"Coder"
		};
		System.out.println("La cantidad de elementos del array es: " + palabras.length);
		//System.out.println(Arrays.toString(palabras));
		
//LISTAS
		List<String> listaDeNombres = new ArrayList<>();
		listaDeNombres.add("Maru");
		listaDeNombres.add("Pupi");
		listaDeNombres.add("Rue");
		listaDeNombres.add("Pupi");
		listaDeNombres.add("Sashi");

		
		System.out.println("Antes de agregar: " + listaDeNombres);
		
		/*hago lista2*/
		List<String> listaDeNombres2 = new ArrayList<>();
		System.out.println(listaDeNombres.containsAll(listaDeNombres2)); /*por que imprime true?*/

		listaDeNombres2.add("Yunke");
		listaDeNombres2.add("Lilu");
		listaDeNombres2.add("Pompi");
		
		System.out.println(listaDeNombres2);
		
		/*y si quiero combinar los dos arrays*/
		listaDeNombres.addAll(listaDeNombres2); /*las combino y declaro la nueva lista*/
		
		List<String> listaDeNombres3 = new ArrayList<>();
		System.out.println("Después de agregar lista2: " + listaDeNombres);
		
		/*pregunto si todos los elementos de lista 2 estan en lista 1*/
		
		System.out.println(listaDeNombres.containsAll(listaDeNombres2));

//usamos for para recorrer la lista,cada elemento de un array
	//ciclo por conteo: for
		/*defino una variable*/
		for (String nombre : listaDeNombres) { //por cada nombre de lista de nombres, hace esto: imprimir el nombre
		System.out.println("Nombre: " + nombre); //va a listar los elementos del array
		}
		
		for (String nombre : listaDeNombres2) { 
		System.out.println("Nombre: " + nombre);
			}
		
		/*para ver si una lista esta vacia*/
		if (listaDeNombres.isEmpty()) {
			System.out.println("El array listaDeNombres está vacío");
		}
		
		if (listaDeNombres2.isEmpty()) {
			System.out.println("El array listaDeNombres2 está vacío");
		}
		
		if (listaDeNombres3.isEmpty()) {
			System.out.println("El array listaDeNombres3 está vacío"); //imprime solo esto porque es la unica que se cumple. las otras no
		}
		System.out.println(listaDeNombres.isEmpty());
		System.out.println(listaDeNombres2.isEmpty());
		
		/*para acceder a las posiciones/indices uso el metodo get */
		int indice = 3;
		System.out.println("El nombre en la posición " + indice + " es " + listaDeNombres.get(indice));
		
		/*otro metodo es set. me pide 2 parametros: indice que quiero reemplazar y qué le pongo*/
		listaDeNombres.set(indice, null);
		System.out.println(listaDeNombres);
		
		/*otro metodo remove*/
		listaDeNombres.remove(3); /*para eliminar un elemento*/
		System.out.println(listaDeNombres);
		listaDeNombres.removeAll(listaDeNombres2);/*elimina todo*/
		System.out.println(listaDeNombres);
		
		/*metodo para ver en que indice está un elemento*/
		String pupi = "Pupi";
		System.out.println(listaDeNombres.indexOf(pupi));
		
		/*devuelve la ultima posicion que tuvo un valor, suponiendo que lo movi de lugar*/
		listaDeNombres.add("Pupi"); /*agrego pupi al final*/
		System.out.println(listaDeNombres.lastIndexOf(pupi)); /*pido ver la ultima posición*/
		System.out.println(listaDeNombres);/*pido la lista actualizada*/
		
		/*metodo size para saber cuantos elementos tiene mi lista. array tiene length y list tiene size*/
		System.out.println("La cantidad de elementos de listaDeNombres es: " + listaDeNombres.size());
		
	//ciclo por condicion
		/*saber cantidad de elementos que hay*/
		System.out.println("La cantidad de elementos de listaDeNombres antes de iterar es:" + listaDeNombres.size());
		
		/*vemos cada elemento. necesito llamar al objeto iterator para poder iterar*/
		Iterator<String> iterator = listaDeNombres.iterator(); /*definimos iterator*/
		
		/*metodo hasnext para saber si llego al final del array. si da false se termina el ciclo*/
		
		while(iterator.hasNext()) {/*pregunto si iterator tiene un siguiente. arranca mostrando el  y vuelve a arriba para mostrar el, y asi sigue*/
			String nombre = iterator.next();
			System.out.println("Nombre es: " + nombre);
			//iterator.remove(); /*metodo remove para ir eliminando elementos con una iteracion. es decir, muestra 0 y borra, vuelve a 1, muestra y borra, y asi*/ 

		}
		//System.out.println("La cantidad de elementos de listaDeNombres luego de iterar es: " + listaDeNombres.size());


	/*iterable: vamos a iterar la lista, que en realidad es lo que ya veniamos haciendo*/
		for (String nombre : listaDeNombres) { /*por cada noomre de lista de nombres, imprimime algo*/
			System.out.println("Nombre: " + nombre);
		}
		
//CICLOS
		/*WHILE*/
		
		/*tengo un contador que incrementa a medida que la condicion sea verdadera*/ 
		int contador = 1; /*por lo gral se inicializa en 1*/
		
		System.out.println("Ya entré al while");
		/*quiero que while verifique si mi contador es menr a 5*/
		while (contador <0) {
			System.out.println("El contador actual vale: " + contador);
		/*ahora agrego incrementador para frenar el bucle, se imprime el 1, da el resultado. vuelve y se imprime el 1+1. y asi da las vueltas hasta alcanzar 5*/
			contador = contador + 1; /*incrementador*/
			contador++; /*otra forma de incrementar*/
			System.out.println("Ya salí del while");

			
		/*DO WHILE*/
		System.out.println("Ya entré al doWhile");

		do {
			System.out.println("El contador actual vale: " + contador);
			contador++;
		} while (contador < 0 );
		System.out.println("Ya salí del doWhile");			
		}
		/*primero hace todo lo del do y despues se fija si la condicion se cumple. si la condicion se umple, lo repetis, sino termino ahi*/
	
		/*FOR*/
		/*for pide 3 parametros. de inicializaacion ,finalizacion y de incremento. luego la sentencia entre llaves*/
		for (int conntador =1; conntador <= 10; conntador++) {
			System.out.println("El contador actual vale: " + conntador); //imprime 1, compara, incrementa, vuelve a repetir hasta llegar a 10
		}
		
	//FOR EACH
	/*usando la listaDeNombres del ppio, pido ver cada nombre así:*/
		
		listaDeNombres.forEach(nombre -> {
			System.out.println("Nombre: " + nombre);
		}); //no se imprime xq antes usé un remoive. lo comenté y ahora anda. genia abso
		
		
		
	}
	

}
