package ciclos.forwhiledo;

import java.util.Scanner;

//Clase ciclo while
public class UsoWhile {
	Scanner entrada = new Scanner(System.in);


	// Metodo ciclo while
	public void cicloW() { // interador que se declara afuera del ciclo
		System.out.println("Ciclo while");
		
		int iterador = 0; // esta variable (iterador) va a estar fuera del ciclo
		while (iterador < 10) {
			System.out.println("Iterador " + iterador);
			iterador = iterador + 1;// se repite el ciclo hasta que el numero sea mayor a 10
		}
	}

	// while uso centinela
	public void centinelW() {
		System.out.println("Ciclo while centinela");
		final int centinela = -1; // palabra reservada final hace constante la variable
		System.out.print("Introduce una calificación: ");
		int nota = entrada.nextInt();
		while (nota != centinela) {
			System.out.println("La nota es: " + nota);
			System.out.print("Introduce una calificación: ");
			nota = entrada.nextInt();

		}
		System.out.println("Fin");
	}

	// while uso bandera
	public void banderaW() {
		System.out.println("Ciclo while bandera");

		boolean valorb = false; // va a controlar la iteracion

		while (!valorb) {
			System.out.println("Introduce un valor numerico: ");
			int valorx = entrada.nextInt();
			if (valorx > 0 && valorx < 25) {
				int potaxio = (int) Math.pow(valorx, 2); // Clase que tiene todos los metodos para hacer procedimientos
															// matematicos
				System.out.println("el resultado --> " + potaxio);
			} else {
				valorb = true;
				System.out.println("fin del ciclo");
			}
		}

	}

}