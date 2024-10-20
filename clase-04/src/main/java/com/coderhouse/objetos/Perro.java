package com.coderhouse.objetos;

public class Perro {
	
	
	/*EXCEPCIONES: si quiero evitar un error en edad, espero que la edad del perro vaya variando pero dentro de un rango*/
	private static final int EDAD_MAXIMA = 15;//todas las constantes van en mayusc a dif de las variables y deben inicializarse si o sim es decir hay q ponerle =20


	/*Defino atributos o variables de clase*/
	public String nombre;
	public String raza;
	public String color;
	public String tamanio;// tamanio sin ñ porque en teclado ingles no existe ni tildes
	public int edad; // int para que la edad no sea 1.4 o 0.06

	String mensajeDeError = "El perro no vive más de " + EDAD_MAXIMA + " años de edad";/*declaro esta variable fuera del metodo exception del final, para no tener que repetirlo dentro de cada uno. poniendolo aca le doy acceso global para poder acceder a el desde cualquier parte del codigo*/

		
	/*Métodos*/
	public void ladrar () {
		System.out.println(getNombre() + " está ladrando"); /*uso get y no nombre solo para que directamente me tire el nombre*/
	}
	
	public void caminar () {
		System.out.println(getNombre()  + " está caminando");
	}
	
	/*Getters and setters*/
	public String getNombre() {
		return this.nombre;
	}
	public String setNombre(String nombre) {
		return this.nombre;
	}
	public String getRaza() {
		return this.raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamanio() {
		return this.tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public int getEdad() {
		return this.edad;
	}
	
	//para manejar el problema de la edad seteo un mje de error (excepcion)
	public void setEdad(int edad) throws Exception {
		//y antes de asignarle la edad debo validar si se puede o no
		//eso lo chequeo con if. pero antes de if, vamos a arrojar una excepción. y eso lo hago poniendo throwException despues de (int edad)para que arroje un msj de error
		if (edad >=EDAD_MAXIMA) {//chequea el rango  -------> ahora quiero convertir 20 en una variable que pueda ir cambiando. lo hago arriba abajo de main
			throw new Exception (mensajeDeError);
		} else {//y sino me va a permitir hacer la asignacion
			this.edad = edad; 
		}
	}
	
	 //ahora cómo imprimo la edad? to string: source - generate to string
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", edad="
				+ edad + "]";
	}
	
	
	
}
	

	
	
	//GETTERS Y SETTERS para recuperar el atributo o setearlo (cambiarlo o inicializarlo)
	//cuando creo el objeto, con el setter le puedo cambiar el nombre
	


