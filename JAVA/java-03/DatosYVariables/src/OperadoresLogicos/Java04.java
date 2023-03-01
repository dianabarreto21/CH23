package OperadoresLogicos;

public class Java04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// operador && (and)
		int edad = 17;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) { //siempre tiene que ser verdadera las dos opciones
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		// operador || (or)
		String nombre = "Diana";
		String apellido = "Perez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		//operador ! (not)
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		
		/*
		 Verificar si un número es par y positivo:
		int num = 6;

		Verificar si un número está dentro de un rango específico
		int num = 10;

		Verificar si una cadena es igual a otra o no
		String cadena1 = "Hola";
		String cadena2 = "hola";
		 */
		// Ejercicio 1
		int num = 3;
		if(num >=0 && num % 2 == 0) {
			System.out.println("El numero es par y positivo");
				
	} 	else {
		System.out.println("No cumple con alguna de las opciones");
	}
		//Ejercicio 2
		int num2 = 10;
		if(num2 >= 0 && num <=20) {
			System.out.println("El numero está dentro del rango");
		
		
	}   else {
		System.out.println("No está dentro del rango");
	}
		// Ejercicio 3
		
		String cadena1 = "Hola";
		String cadena2 = "hola";
		
		if(cadena1 == cadena2) {
			System.out.println("La cadena de caracteres es igual");
		}else {
			System.out.println("La cadena no es igual");
			
		}
				
				
		
	}
}
