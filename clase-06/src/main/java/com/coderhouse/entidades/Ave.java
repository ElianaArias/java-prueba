package com.coderhouse.entidades;

import com.coderhouse.interfaces.SerVivoInterface;

public class Ave implements SerVivoInterface{

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
	
}
