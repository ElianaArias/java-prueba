package com.coderhouse.objetos;

public class Perro {
	
	
	/*si quiero que la edad del perro vaya variando pero dentro de un rango*/
private static final int EDAD_MAXIMA = 20;//todas las constantes van en mayuscula a dif de las variables y deben inicializarse si o si


	/*Defino atributos o variables de clase*/
	private String nombre;
	private String raza;
	private String color;
	private String tamanio;
	private int edad;

	String mensajeDeError = "El perro no vive más de " + EDAD_MAXIMA + " años de edad";/*declaro esta variable fuera de los metodos del final, para no tener que repetirlo dentro de cada uno. poniendolo aca le doy acceso global para poder acceder a el desde cualquier parte del codigo*/

		
	/*Métodos*/
	public void ladrar () {
		System.out.println( getNombre ()  + " está ladrando"); /*uso get y no nombre solo para que directamente me tire el nombre*/
	}
	public void caminar () {
		System.out.println( nombre  + " está caminando");
	}
	public String getNombre() { /*si quiero traer el valor nombre uso get*/
		return this.nombre;
	}
	public void setNombre(String nombre) { /*para asignarle un valor, inicializarlo*/
		this.nombre = nombre;
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
	
	public void setEdad(int edad) throws Exception { //le pide que arroje una excepcion si supera los 20
		if (edad > EDAD_MAXIMA) {
			throw new Exception (mensajeDeError);
		} else {
		this.edad = edad;
	}
}
	//metodo para imprimir datos: tostring
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", edad= " 
				+ edad + "]" + "\n" + mensajeDeError;
	}
	
	
	
	
	
	
	//GETTERS Y SETTERS para recuperar el atributo o setearlo (cambiarlo o inicializarlo)
	//cuando creo el objeto, con el setter le puedo cambiar el nombre
	

}
