package com.coderhouse.entidades;

import com.coderhouse.abstractas.Vehiculos;

public class Auto extends Vehiculos {

	//al crear la clase le digo que es hija de Vehiculo y me trae todos los metodos automaticamente con override
	
	@Override
	public void encender() {
		System.out.println("el auto se enciende");//primero lo sobrescribo
	}

	@Override
	public void apagar() {
		System.out.println("el auto se apaga");

	}

	@Override
	public void mover() {
		System.out.println("el auto se mueve");//y luego puedo instanciar mi vehiculo en main

	}

}
