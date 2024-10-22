package com.coderhouse;

import com.coderhouse.impresora.Impresora;

//import com.coderhouse.entidades.Auto;
//import com.coderhouse.entidades.Perro;
//import com.coderhouse.interfaces.SerVivoInterface;

public class Main {

	public static void main(String[] args) {
		
/*------------------------------------COMENTO TODO ESTO DE ABAJO PARA VER EL ÚLTIMO TEMA--------------------------------------------
		
		//instanciamos clase perro
		Perro miPerro = new Perro();
		
		miPerro.setNombre("firulais");
		miPerro.setEdad(5);
		
		System.out.println(miPerro);
		
		//llamo los métodos desde mi clase padre Perro despues de crear la interface. Solo los sobrescribí en Perro y ya imprimió
		miPerro.amigable();//no tira nada porque solo le dije que retorne true. tendria que haber hecho un public void y hacer que returne un string
		miPerro.comer();
		miPerro.emitirSonido();
		miPerro.moverse();
		
		
		//voy a llamar a mi ubicacion. para eso puedo traerla importando la interface y llamando el atributo ubicacion q por defecto es publico
		System.out.println("La ubicacion del " + miPerro.getNombre() + " esta en el " + SerVivoInterface.UBICACION);
		
		//después de crear la clase hija auto, puedo instanciarlo importandolo
		Auto miAuto = new Auto();
		//y ahora puedo traer los metodos. pero primero debo pasarlos a public para que me permita traerlos.
		miAuto.encender();
		miAuto.apagar();
		miAuto.mover();
		miAuto.setRuedas(4);//no da error pero para visualizarlo debo guardar el valor en una variable por ej. cantidadDeRuedas. lo hago a continuacion
		//y sino tendria que haber delarado mostrarCantidadDeRuedas como public void en Vehiculo para que me devuelva un string y me muestre la cant de ruedas directamente
		//int cantidadDeRuedas = miAuto.mostrarCantidadDeRuedas();
		//System.out.println("Mi auto tiene " + cantidadDeRuedas + " ruedas");
		
		miAuto.mostrarCantidadDeRuedas();//si o si debo pasarle cantidad de ruedas, para eso voy a vehiculo y le doy un valor a ruedas, generando getters y setters
		
		
------------------------------------COMENTO TODO ESTO DE ARRIBA PARA VER EL ÚLTIMO TEMA ABAJO-------------------------------------------*/		
		
		//sobrecarga de metodos (overloading) lo vemos con una imapresora(un metodo hace la misma accion pero con distintos datos
		//primero hice los metodos y ahora instancio mi impresora y la importo:
		  
		 Impresora miImpresora = new Impresora();
		 miImpresora.imprimir(10);
		 miImpresora.imprimir(10, 20);
		 miImpresora.imprimir("texto para imprimir");
		//para imprimir el array de enteros, primero lo instancio al array
		 int[] enteros = {1, 2, 3, 4};
		 miImpresora.imprimir(enteros);
		
		miImpresora.imprimir("A para imprimir", "B para imprimir");
		
/*-----------*/
	}

}
