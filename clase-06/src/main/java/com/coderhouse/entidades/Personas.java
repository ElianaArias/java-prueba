package com.coderhouse.entidades;

import com.coderhouse.interfaces.AccionesInterface;
import com.coderhouse.interfaces.SerVivoInterface;

public class Personas implements SerVivoInterface, AccionesInterface{

	@Override
	public void emitirSonido() {//puede quedar vacia porque es una clase padre. al metodo lo va a sobrescribir la clase hija
	
	}

	@Override
	public void moverse() {
		
	}

	@Override
	public void comer() {
		
	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return true;
	}
	
	//implemento e importo la nueva interface acciones, y traigo sus metodos:
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
	}

}
