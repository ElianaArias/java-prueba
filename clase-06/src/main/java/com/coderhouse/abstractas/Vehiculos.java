package com.coderhouse.abstractas;

public abstract class Vehiculos {

	//todo lo que cree acá va a ser accesible por cualquiera de sus hijos
	
	//declaro mis variables. deben ser protected
	protected String marca ;
	protected String modelo;
	protected String color;
	protected Integer ruedas;
	
	//metodos deben ser private y abstractos
	protected abstract void encender();
	protected abstract void apagar ();
	protected abstract void mover();
	
	//tmb puedo hacer metodos no abstractos, pero en este caso para que funcione debo hacer que devuelva un numero, sino no imprime nada en main. esto va a pasar despues de setear ruedas con getters y setters
	/*public int mostrarCantidadDeRuedas () {
		return getRuedas();
	}*/
	
	//y sino, si quisiera ver en main la cantidad de ruedas, tendria que declararla asi: 
	public void mostrarCantidadDeRuedas () {
		System.out.println("Mi auto tiene " + getRuedas() + " ruedas");
	}
	//y ahora para instanciar un vehiculo, si o si debo crear un a clase hija llamada por ej auto, donde voy a llevar todo esto
	
	
	//genero getters and setters para setear la cantidad de ruedas, ya que la tengo que usar en main para que me imprimar la cantidad. si o si tengo que ponerle un numero
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getRuedas() {
		return this.ruedas;
	}
	public void setRuedas(Integer ruedas) {
		this.ruedas = ruedas;
	}
	
	
}
