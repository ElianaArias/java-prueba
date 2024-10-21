package com.coderhouse.entidades;

//import com.coderhouse.banco.CajaAhorros;
//import com.coderhouse.banco.Cuenta;
//import com.coderhouse.banco.CuentaCorriente;
//import com.coderhouse.banco.Persona;

public class Main {

	public static void main(String[] args) {
		
 		
 		//creo mi perro. llamo la clase y o instanciamos

		Perro unPerro = new Perro();
		Gato unGato = new Gato();
		Perro otroPerro = new Perro(); //Perro lo dejo igual porque se refiere al objeto
		Perro nuevoPerro = otroPerro; //otroPerro para que sean iguales. asi q no es necesario definir atributos ni metodos

		
		//ahora vamos a setearle todos los atributos
		unPerro.setNombre("firulais");
		unPerro.setEdad(4);
		unPerro.setMamifero(true);
		unPerro.setRaza("caniche");
		unPerro.setAlimentacion("alimento balanceado para perro");
		System.out.println(unPerro); //pude acceder a los atributos de mi clase padre porque la clase hija hereda todo

		//y traigo los métodos. que para que funcionen deben ser public
		unPerro.comer();
		unPerro.caminar();
		unPerro.emitirSonido();
		unPerro.saltar();
		
		//hago lo mismo con gato
		unGato.setNombre("michi");
		unGato.setEdad(6);
		unGato.setMamifero(true);
		unGato.setRaza("gato");
		unGato.setAlimentacion("alimento balanceado para gato");
		System.out.println(unGato);
		
		unGato.comer();
		unGato.caminar();
		unGato.emitirSonido();
		unGato.dormir();
		
		otroPerro.setNombre("pupi");
		otroPerro.setEdad(6);
		otroPerro.setMamifero(true);
		otroPerro.setRaza("maltes");
		otroPerro.setAlimentacion("alimento balanceado para perro");
		System.out.println(otroPerro); 

		otroPerro.comer();
		otroPerro.caminar();
		otroPerro.emitirSonido();
		otroPerro.saltar();
		

		//ahora que instancié los 2 perros y tienen el mismo nombre e hice los hashCode en Animal, los comparo con equals:
		if (unPerro.equals(otroPerro)) { //con equals comparo nombres
			System.out.println("Ambos perros son iguales segun equals");
		} else {
			System.out.println("Ambos perros no son iguales segun equals");
		}//me da igual si tienen el mismo nombre porque en Animal, equals es un booleano. solo da true o false. pero si le cambio el nombre a uno, me da que son distintos
		
		
		//ahora lo verificamos con hashcode
		
		if(unPerro.hashCode() == otroPerro.hashCode()) { //con hs comparo numeros de referencia de esos nombres
			System.out.println("Ambos perros son iguales segun hashCode");
		} else {
			System.out.println("Ambos perros no son iguales segun hashCode");
		}
		
		//si quisiera que sean iguales segund hs, dbería crear un nuevo perro y en vez de asignar una instancia nueva de perro, le asigno otroPerro que ya existe.
		if(nuevoPerro.hashCode() == otroPerro.hashCode()) { //con hs comparo numeros de referencia de esos nombres
			System.out.println("Ambos perros son iguales segun hashCode");
		} else {
			System.out.println("Ambos perros no son iguales segun hashCode");
		}
		
		
		
/*-----------------------------COMENTO TODO BANCOS PARA HACER EJEMPLO DE EQUALS ARRIBA----------------------------

		//creo una persona
		Persona unaPersona = new Persona();
		unaPersona.setTitular ("Andres");
		unaPersona.setDni (13131313);
		
		System.out.println(unaPersona);
		
		//ahora voy a crearle una cuenta. puede ser corriente o simple, así que primero creo las dos clases y le hago una cc
		Cuenta cuentaCorriente = new CuentaCorriente();
		
		//y antes de imprimir, voy a setearlo. es decir ponerle nombre a las variables
		cuentaCorriente.setTitular(unaPersona);
		cuentaCorriente.setNumero(123456);
		cuentaCorriente.setSaldo(1233.50d);
		cuentaCorriente.abrirCuenta();
		
		System.out.println(cuentaCorriente);
		
		//ahora le hago una caja de ahorros
		Cuenta cajaAhorros = new CajaAhorros();
		
		cajaAhorros.setTitular(unaPersona);
		cajaAhorros.setNumero(321654);
		cajaAhorros.setSaldo(6543.65d);
		cajaAhorros.abrirCuenta();
		
		System.out.println(cajaAhorros);
-----------------------------------Y DEJO AFUERA LAS 2 ULTIMAS LLAVES--------------------------------------*/	
		
		
		
		
	}

}
