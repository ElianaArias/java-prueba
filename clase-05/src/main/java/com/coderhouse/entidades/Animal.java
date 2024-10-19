package com.coderhouse.entidades;

public class Animal {

	
	//metodos, es decir acciones
	
	public void emitirSonido () {
		System.out.println("Emitio sonido");
	}
	
	public void caminar () {
		System.out.println("El animal camina");
	}
	
	public void comer () {
		System.out.println("El animal comio");
	}

	@Override
	public String toString() {
		return "Animal [vivo=" + vivo + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	}
	
}
