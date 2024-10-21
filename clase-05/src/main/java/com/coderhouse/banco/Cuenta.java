package com.coderhouse.banco;

public class Cuenta {

	//qué tienen las cuentas?
	private int numero;
	private double saldo;
	private Persona titular; //y lo hago llamando al titular desde mi clase Persona, para que me traiga el nombre del titular directamente
	
	//ahora que hice las 2 clases nuevas, abro una cuenta
	public void abrirCuenta() {
		System.out.println(getTitular() +"Abrió una cuenta");	
	}
	
	//metodos: qué se puede hacer con ellas?
	public void verSaldo() {
		System.out.println("El saldo de la cuenta bancaria es: " + getSaldo());
	}

	public void transferir() {
		System.out.println(getTitular() + " hizo una transferencia");
	}
	
	//getters y setters de atributos
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Persona getTitular() {
		return this.titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	
	
	
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
}
