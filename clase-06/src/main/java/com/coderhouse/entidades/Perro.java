package com.coderhouse.entidades;

public class Perro extends AnimalTerrestre  {

	//hago override de los metodos, es decir polimorfismo, proque sobrescribo un metodo de mi clase padre para que funcione. esto a pesar de que animal terrestre está en blanco
	@Override//funciona por la interface. no sé cómo pero está implementando el método
	public void emitirSonido() {
		System.out.println(getNombre() + " está ladrando");
	}
	@Override
	public void moverse () {
		System.out.println(getNombre() + " está caminando");
	}
	@Override
	public void comer() {
		System.out.println(getNombre() + " está comiendo");
	}
	
	public boolean amigable(){
		return true;
	}
	
	
	
}
