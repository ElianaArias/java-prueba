package com.coderhouse.banco;

public class Persona {
	
	//atributos de persona
	private String titular;
	private int dni;
	
	//getters y setters
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getDni() {
		return this.dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Persona [titular=" + titular + ", dni=" + dni + "]";
	}

}
