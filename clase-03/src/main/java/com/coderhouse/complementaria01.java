package com.coderhouse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class complementaria01 {

	//vemos la diferencia entre iterable e iterator
	
	public static void main(String[] args) {
		List<String> listaDeNombres = new ArrayList<>();
		listaDeNombres.add("Maru");
		listaDeNombres.add("Pupi");
		listaDeNombres.add("Rue");
		listaDeNombres.add("Pupi");
		listaDeNombres.add("Sashi");
		
		//recorro la lista usando for iterable
		System.out.println("usando iterable para recorrer la lista");
		for (String nombre : listaDeNombres) {
			System.out.println("Nombre: " + nombre);
		}
		
		//busco el indice usando for comun
		System.out.println("\nusando for para obtener el índice");
		for (int i = 0; i < listaDeNombres.size(); i++) { //el for comun me pide una variable de iteracion (i), hasta dón de voy a iterar y un incremetador
			System.out.println("Nombre: " + i);
		}
		//ahora busco el nombre usando for comun
		System.out.println("\nusando for y get para obtener el nombre");
		for (int i = 0; i < listaDeNombres.size(); i++) { //el for comun me pide una variable de iteracion (i), hasta dón de voy a iterar y un incremetador
			System.out.println("Nombre: " + listaDeNombres.get(i));
		}
		
		//ahora recorro lista de nombres con iterator, que ya ni se usa. primero uso una instancia de iterator
		System.out.println("\nusando iterator para recorrer la lista");
		Iterator<String> iterator = listaDeNombres.iterator();
		while(iterator.hasNext()) {//va a preguntar si hay un siguiente, y si es así lo va a imprimir
			System.out.println("Nombre: " + iterator.next());//me va a devolver el siguiente
		}
		
		//usando for each
		System.out.println("\nusando for each para recorrer la lista");
		listaDeNombres.forEach(nombre -> {
			System.out.println("Nombre: " + nombre);
		});

	}

}
