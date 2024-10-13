package com.coderhouse;

public class Ejercicios02 {

	public static void main(String[] args) {
//Ejercicios con if
	//Determina si un número es positivo. Declara un número y usa if para verificar si es mayor que 0.
		int num = 11;
		if (num>0) {
			System.out.println("El numero es mayor a 0");
		}
	//Verifica si una persona es mayor de edad (>= 18 años).
		int edad = 20;
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
		}
	//Comprueba si un número es impar usando el operador %.
		if (num % 2 == 1) {
			System.out.println("El numero es impar");
		}
	//Revisa si una cadena está vacía usando if con string.isEmpty().
	//Determina si un número es divisible por 5.
		if (num % 5 == 0) {
			System.out.println("El numero es divisible por 5");
		} else {
			System.out.println("El numero no es divisible por 5");
		}
//Ejercicios con if-else
	//Verifica si un número es par o impar y muestra un mensaje correspondiente.
		if (num % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
	//Determina si una persona puede votar (mayor de 18 años) o no.
		if (edad >=18) {
			System.out.println("Puede votar");
		} else {
			System.out.println("No puede votar");
		}
	//Verifica si una letra es vocal o consonante (para simplificar, considera solo las letras en minúsculas).
		char letra = 'a';
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("La letra es una vocal");
		} else {
			System.out.println("La letra es una consonante");
		}
	//Revisa si un número es positivo, negativo o cero.
		if (num > 0) {
			System.out.println("El numero ingresado es positivo");
		} else if (num < 0) {
			System.out.println("El numero ingresado es negativo");
		} else if (num == 0) {
			System.out.println("El numero ingresado es igual a 0");
		} else {
			System.out.println("El dato ingresado no es un numero");
		}
	//Determina si un año es bisiesto. (Pista: un año es bisiesto si es divisible por 4 y no por 100, excepto si es divisible por 400).
		int anio = 2020;
		if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
//Ejercicios con if-else if-else
	//Determina la categoría de una persona según su edad: bebé (<2), niño (2-12), adolescente (13-18), adulto (19-64), anciano (65+).
	if (edad<2) {
		System.out.println("Es bebé");
	} else if (edad <=2 && edad<=12) {
		System.out.println("Es un niño");
	} else if (edad >=13 && edad<=18) {
		System.out.println("Es un adolescente");
	} else if (edad >= 19 && edad<=64) {
		System.out.println("Es un adulto");
	} else if (edad >=65) {
		System.out.println("Es un anciano");
	}
	//Calcula el precio de una entrada al cine según la edad: niño (5€), adulto (10€), anciano (7€).
	 if (edad <=2 && edad<=12) {
		System.out.println("El precio de la entrada es $5");
	} else if (edad >= 19 && edad<=64) {
		System.out.println("El precio de la entrada es $10");
	} else if (edad >=65) {
		System.out.println("El precio de la entrada es $7");
	}
	//Asigna una nota en función de la calificación: A (>=90), B (>=80), C (>=70), D (>=60), F (<60).
	 int nota = 80;
	 if (nota >=90) {
			System.out.println("La nota es A");
		} else if (nota >=80) {
			System.out.println("La nota es B");
		} else if (nota >=70) {
			System.out.println("La nota es C");
		} else if (nota >=60) {
			System.out.println("La nota es D");
		} else if (nota >60) {
			System.out.println("La nota es F");
		}
	//Evalúa un número si es negativo, positivo, o cero, mostrando un mensaje en cada caso.
	 if (num > 0) {
			System.out.println("El numero ingresado es positivo");
		} else if (num < 0) {
			System.out.println("El numero ingresado es negativo");
		} else if (num == 0) {
			System.out.println("El numero ingresado es igual a 0");
		} else {
			System.out.println("El dato ingresado no es un numero");
		}
	//Determina el nivel de peligro de un volcán según su estado (dormido, activo, erupción inminente).
	 String estado = "dormido";
	 if (estado == "dormido") {
		 System.out.println("El volcan está " + estado + ". El nivel de peligro es bajo");
	 } else if (estado == "activo") {
		 System.out.println("El volcan está " + estado + ". El nivel de peligro es moderado");
	 } else if (estado == "erupcion inminente") {
		 System.out.println("El volcan está " + estado + ". El nivel de peligro es alto");
	 }
//Ejercicios con switch
	//Asigna un día de la semana según un número del 1 al 7.
	 int numeroDeDia = 3;
	 String nombreDeDia;

		switch (numeroDeDia) {
		case 1:
			nombreDeDia = "Lunes";
			break;                  
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
		
	//Muestra el nombre de un mes según un número del 1 al 12.
		int numeroMes = 1;
		String nombreMes;

		switch (numeroMes) {
		case 1:
			nombreMes = "Enero";
			break;                  
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		default:
			nombreMes = "Mes invalido";
			break;
			
		}
		System.out.println("El mes correspondiente al número " + numeroMes + " es " + nombreMes);
		
	//Determina el nombre de una estación del año según un número (1: invierno, 2: primavera, 3: verano, 4: otoño).
		int numeroEstacion = 3;
		 String estacion;

			switch (numeroEstacion) {
			case 1:
				estacion = "invierno";
				break;                  
			case 2:
				estacion = "primavera";
				break;
			case 3:
				estacion = "verano";
				break;
			case 4:
				estacion = "otoño";
				break;
			default:
				estacion = "Estacion invalida";
				break;
				
			}
			System.out.println("La estacion correspondiente al número " + numeroEstacion + " es " + estacion);
	//Calcula operaciones aritméticas básicas (suma, resta, multiplicación, división) según un operador ingresado (+, -, *, /).
	float numA = 4.0f;
	float numB = 0.0f;
	float resultado = numA / numB;
	if (numB != 0) {
		System.out.println("El resultado es: " + resultado);
	} else {
		System.out.println("No se puede dividir por 0");
	}
	//Verifica el tipo de fruta según su código: 1: manzana, 2: plátano, 3: naranja, 4: uva.
	int numFruta = 3;
	String fruta;

		switch (numFruta) {
		case 1:
			fruta = "manzana";
			break;                  
		case 2:
			fruta = "banana";
			break;
		case 3:
			fruta = "naranja";
			break;
		case 4:
			fruta = "uva";
			break;
		default:
			fruta = "No es una fruta";
			break;
			
		}
		System.out.println("La fruta correspondiente al codigo " + numFruta + " es " + fruta);	
//Ejercicios con Operadores Ternarios
	//Verifica si un número es par o impar usando un operador ternario.
	boolean condicion = num%2==0;
	boolean resultado2 =condicion ? true : false; 
	System.out.println("El numero " + num + " es par? " + resultado2);
	
	//Determina si una persona es mayor de edad con un operador ternario.
	boolean mayorEdad = edad >= 18;
	boolean resultado3 =mayorEdad ? true : false; 
	System.out.println("La persona es mayor de edad");
	
	//Asigna el valor "Positivo" o "Negativo" a una variable según el valor de un número.
	boolean valor = num >= 0;
	String resultado4 = valor ? "Positivo" : "Negativo";
	System.out.println("El numero es " + resultado4);
	
	//Calcula el mayor de dos números usando un operador ternario.
	int mayor = (int) ((numA > numB) ? numA : numB); /*int adelante para que devuelva un numero*/
	System.out.println("El mayor numero es " + mayor);
	
	//Asigna un valor "Aprobado" o "Reprobado" a una variable en función de una nota.
	String calificacion = (nota >= 4) ? "Aprobado" : "No aprobado";
	System.out.println("El alumno está " + calificacion);
	
//Ejercicios con Math.random()
	//Genera un número aleatorio entre 1 y 10 y muestra un mensaje si es mayor que 5.
	int minimo = 1;
	int maximo = 10;
	
	int rango = maximo - minimo +1; /*+1 para que no me de 0*/
	int randon = 0; /*inicializamos randon*/
	randon = (int) (Math.random() * rango) + minimo; /**rango para que respete el rango y sumo minimo para que arranque de ahi*/
	System.out.println("El numero generado es: " + randon);	
	if (randon > 5) {
		System.out.println("El numero es mayor que 5");
	} else {
		System.out.println("El numero es menor que 5");
	}
	
	//Simula el lanzamiento de un dado con Math.random() y muestra el resultado.
	int min = 1;
	int max = 6;
	int entre = max- min + 1;
	int dado = 0;
	dado = (int) (Math.random() * entre) + minimo; /**rango para que respete el rango y sumo minimo para que arranque de ahi*/
	System.out.println("El numero de dado es: " + dado);	
	
	//Genera un número aleatorio entre 0 y 100 y determina si es mayor, menor o igual a 50.
	int mini = 1;
	int maxi = 100;
	
	int range = maxi - mini +1;
	int numeroAleatorio = 0;
	numeroAleatorio = (int) (Math.random() * range) + minimo;
	System.out.println("El numero generado es: " + numeroAleatorio);	
	if (numeroAleatorio > 50) {
		System.out.println("El numero es mayor que 50");
	} else if (numeroAleatorio < 50) {
		System.out.println("El numero es menor que 50");
	} else if (numeroAleatorio == 50){
		System.out.println("El numero es igual a 50");
	} else {
		System.out.println("El numero no se encuentra dentro del rango asignado");
	}
	
	//Simula una moneda (cara o cruz) usando Math.random().
	int moneda = (int) (Math.random()*range) + minimo;
	String lado = (moneda >= 50) ? "Cara" : "Cruz";
	System.out.println("Tu lado es " + lado);
	
	//Genera un número aleatorio entre 1 y 100 y determina si es múltiplo de 10.
	int random = (int) (Math.random()*100) + 1;
	String multiplo = (random%10 == 0) ? " es multiplo de 10" : " no es multiplo de 10";
	System.out.println("El numero " + random + multiplo);
	
//Ejercicios combinando condicionales
	//Determina si un número es positivo, negativo o cero usando un operador ternario.
	String resultado5 = (num > 0) ? "positivo" : (num < 0) ? "negativo" : "igual a 0"; 
	System.out.println("El numero es " + resultado5);
	
	//Simula un semáforo. Muestra el estado (verde, amarillo, rojo) según un número aleatorio del 1 al 3.
	int colorSemaforo = (int) (Math.random()*3) +1;
	if (colorSemaforo == 1) {
		System.out.println("El semaforo está en rojo");
	} else if (colorSemaforo == 2) {
		System.out.println("El semafoto está en amarillo");
	} else if (colorSemaforo == 3) {
		System.out.println("El semaforo está en rojo");
	}
	
	//Crea un programa que simule una lotería. Genera un número aleatorio y verifica si es igual a un número predeterminado.
	int numLoteria = (int) (Math.random()*99) +1;
	System.out.println("El numero sorteado es: " + numLoteria);
	int cartonLoteria = 32;
	String loteria = (numLoteria == cartonLoteria) ? "El numero coincide" : "El numero no coincide";
	System.out.println(loteria);
	//Genera un número aleatorio entre 1 y 100 y evalúa si es divisible por 3 o por 5.
	String divisible = (random %3 == 0) ? " es divisible por 3" : (random %5 == 0) ? " es divisible por 5" : " No es divisible ni por 3 ni por 5";
	System.out.println("El numero " + random + divisible);
	
	//Simula un dado y determina si el número obtenido es mayor o igual a 4.
	if (dado > 4) {
		System.out.println("El numero obtenido es mayor a 4");
	} else if (dado == 4) {
		System.out.println("El numero obtenido es igual a 4");
	}
	//Genera un número aleatorio entre 1 y 100 y clasifícalo en categorías: bajo (<30), medio (>=30 y <=70), alto (>70).
	if (random <30) {
		System.out.println(random + " es un numero bajo");
	} else if (random >=30 && random <70) {
		System.out.println(random + " es un numero medio");
	} else if (random >70) {
		System.out.println(random + " es un numero alto");
	}
	
	//Determina si un número generado aleatoriamente entre 1 y 100 es primo o no.
	//Simula una adivinanza de un número entre 1 y 10. El usuario ingresa un número y el programa le dice si acertó o no.
	int numAdivinar = 4;
	String resultadoAdivinanza = (randon == numAdivinar) ? "Acertó" : "No acertó";
	System.out.println("Bingo || Su numero es el " + randon + ": " + resultadoAdivinanza);
	
	//Genera un número aleatorio entre 1 y 50 y verifica si está en el rango de [20, 30].
	int otroNum = (int) (Math.random()*50) + 1;
	String resultado7 = (otroNum >20 && otroNum <30) ? " está dentro del rango" : " no está dentro del rango (20-30)";
		System.out.println("El numero " + otroNum + resultado7);
	
//Ejercicios avanzados básicos
	//Simula un lanzamiento de tres dados y verifica si la suma de los resultados es mayor que 10.
	int dado1 = (int) (Math.random()*6)+1;
	System.out.println("Dado1: " + dado1);
	int dado2 = (int) (Math.random()*6)+1;
	System.out.println("Dado2: " + dado2);
	int dado3 = (int) (Math.random()*6)+1;
	System.out.println("Dado3: " + dado3);
	boolean sumaDados = (dado1 + dado2 + dado3 > 10) ? true : false;
	System.out.println("La suma de los 3 dados es mayor que 10?: " + sumaDados);
	
	//Simula una ruleta de colores: genera un número aleatorio del 1 al 5 y asigna un color.
	int numRuleta = (int) (Math.random()*5) +1;
	String colorRuleta;
	switch (numRuleta) {
	case 1:
		colorRuleta = "rojo";
		break;
	case 2:
		colorRuleta = "verde";
		break;
	case 3:
		colorRuleta = "negro";
		break;
	case 4:
		colorRuleta = "blanco";
		break;
	case 5:
		colorRuleta = "amarillo";
		break;
	default: 
		colorRuleta = "no existe el color";
		break;
	}
	System.out.println("Color elegido: " + colorRuleta);
	
	//Calcula el descuento en una tienda dependiendo del tipo de cliente: 1. Normal (sin descuento), 2. Miembro (10% de descuento), 3. VIP (20% de descuento).
	int numCliente = (int) (Math.random()*3) +1;
	String descuentoCliente="";
	switch (numCliente) {
	case 1: 
		descuentoCliente = "normal: no se le aplica descuento";
		break;
	case 2: 
		descuentoCliente = "miembro: se aplica el 10%";
		break;
	case 3: 
		descuentoCliente = "VIP: se aplica el 20%";
		break;
	}
	System.out.println("El cliente es " + descuentoCliente);

	//Evalúa el clima: genera un número aleatorio y asigna un estado del tiempo (soleado, nublado, lluvioso, nevando).
	int numClima = (int) (Math.random()*4) +1;
	String estadoClima = "";
	switch (numClima) {
	case 1: 
		estadoClima = "soleado";
		break;
	case 2:
		estadoClima = "nublado";
		break;
	case 3:
		estadoClima = "lluvioso";
		break;
	case 4:
		estadoClima = "nevando";
		break;
	}
	System.out.println("El estado del clima es: " + estadoClima);
	
	//Determina el ganador de un juego de piedra, papel o tijera usando números aleatorios y switch.
	int numJuego = (int) (Math.random()*3) +1;
	String tocaJuego = "";
	switch (numJuego) {
	case 1: 
		tocaJuego = "piedra";
		break;
	case 2:
		tocaJuego = "papel";
		break;
	case 3:
		tocaJuego = "tijera";
		break;
	}
	System.out.println("Tu oponente eligió: " + tocaJuego);
	//Simula un juego de adivinanza: el usuario tiene que adivinar un número entre 1 y 5 generado aleatoriamente.
	int numAdivinanza = (int) (Math.random()*5) +1;
	String num = "";
	//Crea un programa que asigne una beca: si la nota es >= 85 y la edad < 25, el estudiante recibe una beca.
	//Determina si un número generado aleatoriamente entre 1 y 100 es un número perfecto (la suma de sus divisores propios es igual al número).
	//Genera dos números aleatorios entre 1 y 100 y muestra cuál es mayor.
	//Genera un número aleatorio entre 1 y 100 y evalúa si es mayor que 75 usando un operador ternario.
	//Simula un juego de dados: si la suma de dos dados es 7 o 11, el jugador gana.

	}

}
