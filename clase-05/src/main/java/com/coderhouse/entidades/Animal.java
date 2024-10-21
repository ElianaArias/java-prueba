package com.coderhouse.entidades;

import java.util.Objects;

public class Animal {

	
	//atributos y metodos, es decir acciones
	private String nombre; 
	private String raza;
	private int edad;
	private boolean mamifero;
	private String alimentacion;
	
	//metodos, es decir acciones. los tengo que hacer publicos para que funcionen en main

	
	public void emitirSonido () { //uso esto para explicar polimorfismo
		System.out.println(getNombre() + " emitio sonido");
	}
	
	public void caminar () {
		System.out.println(getNombre() + " está caminando"); //get nombre lo pongo de getters and setters. así me trae directamente el nombre
	}
	

	public void comer () {
		System.out.println(getNombre() + " está comiendo");
	}

//	public boolean isVivo() {
//		return vivo;
//	}
//
//	public void setVivo(boolean vivo) {
//		this.vivo = vivo;
//	}

	public String getNombre() { //cuadno necesite tomar ese nombre, lo haría desde acá usando get
		return nombre;
	}

	public void setNombre(String nombre) {//sirve para setear el nombre cuando un objeto es creado. ese nombre se va a guardar en mi variable nombre
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isMamifero() {
		return this.mamifero;
	}

	public void setMamifero(boolean mamifero) {
		this.mamifero = mamifero;
	}

	public String getAlimentacion() {
		return this.alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}


	//si al final quiero imprimir todos mis datos, genero toString para que me los imprima por consola

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", mamifero=" + mamifero
				+ ", alimentacion=" + alimentacion + "]";
	}

	@Override //source-generate hashCode-nombre. asi se comparan solamente por el nombre
	public int hashCode() {
		return Objects.hash(nombre);//ahora nombre es mi parametro
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(nombre, other.nombre);//aca se guarda el numero de referencia que el metodo genera para nombre
	}//y la comparacion se va a hacer usando esos numeros de referencia

	

	
	
	
	
	
	
	
}
