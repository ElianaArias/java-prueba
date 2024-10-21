package com.coderhouse.entidades;

public class Gato extends Animal {
	
	
	@Override
	
	public void emitirSonido() {//metodo maullar es propio de la clase gato. lo reemplazo por emitirSonido. es decir, lo sobrescribo
		System.out.println(getNombre() + " está maullando");
	}
	
	public void dormir() {
		System.out.println(getNombre() + " está durmiendo");
	}

}
