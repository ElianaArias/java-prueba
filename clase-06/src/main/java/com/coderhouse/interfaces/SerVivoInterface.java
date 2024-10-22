package com.coderhouse.interfaces;

public interface SerVivoInterface {
	
	//si quisiera agregar un atributo, en este caso constante
	String UBICACION = "Planeta Tierra"; //en este caso, por defecto es publico
	
	
	
	//declaro todos los metodos que van a reutilizar las clases que implementen esta interface (en vez de escribir los metodos en perro, ave, personas)
	void emitirSonido();//metodos abstractos porque termina en ;. si no fuera abstracto terminaría con {}
	
	void moverse ();
	
	void comer();
	
	boolean estaVivo();
	
	
	//
	
	
	
	

}
