package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in); // declaramos objeto de tipo Scanner para introducir datos por teclado (al
												// usuario)

	public void controlIf() {
		// TODO Auto-generated method stub
		/*
		 * if (condition) { //la condicion tiene que ser verdadera
		 * 
		 * }
		 * 
		 * if (condition) {
		 * 
		 * } else { // else funciona del lado negativo /lado contrario
		 */
		long nota = 3;
		if (nota > 5) {
			System.out.println("Nota aprobada " + nota);
		}

		if (nota >= 5) {
			System.out.println("Nota aprobada " + nota);
		} else {
			System.out.println("Nota no aprobada " + nota);
		}
	}

	public void divisible() {
		System.out.println("Introduce primer numero: ");
		int dato1 = entrada.nextInt();
		System.out.println("Introduce segundo numero: ");
		int dato2 = entrada.nextInt();

		if (dato1 % dato2 == 0) {
			System.out.println(dato1 + " Es divisible entre " + dato2);

		} else { System.out.println(dato1 + " No es divisible entre " + dato2);
		}
		}

	
		public void compara() {
			System.out.println("Introduce primer numero: ");
			int valor1 = entrada.nextInt();
			System.out.println("Introduce segundo numero: ");
			int valor2 = entrada.nextInt();
		if (valor1 > valor2) {
			System.out.println(valor1 + " es mayor a " + valor2);
			
		} else {
			System.out.println(valor1 + " es menor a " + valor2);
		}
		}
		
		public void anidado() {
			
	
		System.out.println("Introduce primer numero: ");
		int num1 = entrada.nextInt();
		if(num1 > 0) {
			System.out.println("numero positivo " + num1);
		}else if(num1 < 0) {
			System.out.println("numero negativo " + num1);
			
}	else {
	System.out.println("Tu numero es cero");
}
}}
