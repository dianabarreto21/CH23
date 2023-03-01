package control;

import java.util.Scanner;

public class OrdenTres {
	// Metodo que imprima de mayor a menor
	Scanner numero = new Scanner(System.in);
	
	public void arreglo() {
		// TODO Auto-generated method stub
		System.out.println("Introduce primer numero: ");
		int num1  = numero.nextInt();
		System.out.println("Introduce primer numero: ");
		int num2  = numero.nextInt();
		System.out.println("Introduce primer numero: ");
		int num3  = numero.nextInt();

		 if (num1 > num2 && num1 > num3) {
	            if (num2 > num3) {
	                System.out.println(num1 + " " + num2 + " " + num3);
	            } else {
	                System.out.println(num1 + " " + num3 + " " + num2);
	            }
	        } else if (num2 > num1 && num2 > num3) {
	            if (num1 > num3) {
	                System.out.println(num2 + " " + num1 + " " + num3);
	            } else {
	                System.out.println(num2 + " " + num3 + " " + num1);
	            }
	        } else {
	            if (num1 > num2) {
	                System.out.println(num3 + " " + num1 + " " + num2);
	            } else {
	                System.out.println(num3 + " " + num2 + " " + num1);
	            }
	        }
		}
}

