package com.coderhouse.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

//@Entity
public class Persona {

	@Id //con esto digo que es primary key. debe ser incremental y no nulo
	@GeneratedValue (strategy = GenerationType.IDENTITY) //esto lo hago para que el id sea autoincremental
	private Long id;
	
	
	@Column(name = "nombre") //esto no es necesario porque abajo ya le dije que empiece con nombre. Pero sirve si quisiera ponerle un alias o cambiar una mayus o agregar palabras
	private String nombre;
	
	//ahora le digo cómo se van a relacionar y creo la col pasaporte
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pasaporte_id", referencedColumnName = "id")  //aca le digo con qué columna hacer join
	private Pasaporte pasaporte;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", pasaporte=" + pasaporte + "]";
	}
	
	
	
}
