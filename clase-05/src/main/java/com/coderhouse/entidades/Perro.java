package com.coderhouse.entidades;

public class Perro extends Animal{ //esto lo podia hacer al crear la clase para q entre en animal

	
	@Override //pongo esto porque estoy sobrescribiendo el metodo ladrar
	
	public void emitirSonido () {//metodo ladrar era propio de la clase perro. lo cambio por emitirSonido
		System.out.println(getNombre() + " está ladrando");
	}
	
	public void saltar () {
		System.out.println(getNombre() + " está saltando");
	}
	
	
}

//
//public void caminar () {
//	System.out.println("El animal camina");
//}
//
//public void comer () {
//	System.out.println("El animal comio");
