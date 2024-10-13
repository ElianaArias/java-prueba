package com.coderhouse;

public class Clase02 {

	public static void main(String[] args) {
		int numeroA = 1;
		int numeroB = 2;
		if (numeroA > numeroB) { /* las llaves hacen de contenedor de código */
			System.out.println("El " + numeroA + "es mayor que el" + numeroB);
		} else {
			System.out.println("NumeroB es mayor que numeroA");
		}
		System.out.println("Si se llegó hasta acá es porque el IF fue ejecutado");

		// HACEMOS UNA CCALCULADORA
		float numA = 1.0f;
		float numB = 0.0f;
		float resultado = numA / numB; /* y acá voy sumando restando o lo que sea */

		/*
		 * si tuviera que dividir por 0, para evitar el error, tendría que poner un
		 * condicional
		 */
		if (numB != 0) {
			System.out.println("El resultado es: " + resultado);
		} else {
			System.out.println("No se puede dividir por 0");
		}

		// SE SOLICITA REALIZAR UN PROGRAMA QUE IMPRIMA EL MES ACTUAL. Se hace con
		// switch o con if else
		int ingreseSuNumero = 0;
		/*
		 * para verificar si el numero es negativo positivo o igual a 0. son 3
		 * posibilidades, con if no alcanza uso if else
		 */
		if (ingreseSuNumero > 0) {
			System.out.println("El numero ingresado es positivo");
		} else if (ingreseSuNumero < 0) {
			System.out.println("El numero ingresado es negativo");
		} else if (ingreseSuNumero == 0) {
			System.out.println("El numero ingresado es igual a 0");
		} else {
			System.out.println("El dato ingresado no es un numero"); /* por si el usuario ingresa una letra o wtv */
		}

		// VALIDAR DIA DE LA SEMANA USANDO IF ELSE IF
		int numeroDia = 1;
		if (numeroDia == 1) {
			System.out.println("El día actual es Lunes");
		} else if (numeroDia == 2) {
			System.out.println("El día actual es Martes");
		} else if (numeroDia == 3) {
			System.out.println("El día actual es Miercoles");
		} else if (numeroDia == 4) {
			System.out.println("El día actual es Jueves");
		} else if (numeroDia == 5) {
			System.out.println("El día actual es Viernes");
		} else if (numeroDia == 6) {
			System.out.println("El día actual es Sabado");
		} else if (numeroDia == 7) {
			System.out.println("El día actual es Domingo");
		} else {
			System.out.println("El día ingresado no existe");
		}
		/* no me reconocia else porque tenía ; al final de cada () */

		// HAGO LO MISMO PERO CON SWITCH
		int numeroDeDia = 1;
		String nombreDeDia;

		switch (numeroDeDia) {
		case 1:
			nombreDeDia = "Lunes";
			break;                  /*break se usa para que el switch deje de ejecutarse al encontrar el caso correcto*/
		case 2:
			nombreDeDia = "Martes";
			break;
		case 3:
			nombreDeDia = "Miercoles";
			break;
		case 4:
			nombreDeDia = "Jueves";
			break;
		case 5:
			nombreDeDia = "Viernes";
			break;
		case 6:
			nombreDeDia = "Sabado";
			break;
		case 7:
			nombreDeDia = "Domingo";
			break;
		default:
			nombreDeDia = "Dia invalido";
			break;
			
		}
		System.out.println("El día de la semana correspondiente al número " + numeroDeDia + " es el dia " + nombreDeDia);
		
	/*para saber si un mes tiene 30 dias o 31
		int mes= 2;
		int anio = 2022;
		int numeroDeDias= 0;
		
		switch (mes) { 
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
				numerodeDias = 31;
				break;
		case 4:
		case 6:
		case 9:
		case 11:
				numeroDeDias = 30;
				break;
		}*/
	String dia = "Lunes";
	
	switch (dia.toLowerCase()) { /*pongo eso para que transforme todo lo que ponga el usuario a minuscula.  por si le pifia. y lo mio tiene que estar todo en minuscula tambien*/
	case "lunes":
		System.out.println("Hoy es " + dia);
		break;
	case "martes":
		System.out.println("Hoy es " + dia);
		break;
	case "miercoles":
		System.out.println("Hoy es " + dia);
		break;
	case "jueves":
		System.out.println("Hoy es " + dia);
		break;
	case "sabado":
		System.out.println("Hoy es " + dia);
		break;
	case "domingo":
		System.out.println("Hoy es " + dia);
		break;
		
	}
//OPERADORES TERNARIOS
	/*mayor o menos con las variables numeroA y B*/
	boolean condicion = numeroA<numeroB; /*boolean porque puede daar true o false*/
	boolean resultado2 =condicion ? true : false; /*si se cumple la condicion, muestra lo primero, y sino lo segundo*/
	System.out.println("La condicion es " + resultado2);
	
	
//NUMEROS ALEATORIOS
	double randon = 0.0d;
	randon = Math.random();
	System.out.println("El numero generado es: " + randon);
	
	/*pero si quiero que se imprima dentro de un rango de valores, puedo parcearlo o multiplicarlo por 10 por ej, o de entrada declararlo numero entero*/
	int minimo = 1;
	int maximo = 100;
	
	int rango = maximo - minimo +1; /*+1 para que no me de 0*/
	int randonn = 0; /*inicializamos randon*/
	randonn = (int) (Math.random() * rango) + minimo; /**rango para que respete el rango y sumo minimo para que arranque de ahi*/
	System.out.println("El numero generado es: " + randonn);		
	}
	
}