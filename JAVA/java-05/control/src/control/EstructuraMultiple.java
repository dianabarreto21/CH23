package control;

import java.util.Scanner;

public class EstructuraMultiple {
	Scanner dato = new Scanner(System.in);

	public void vocal() {
		// TODO Auto-generated method stub
		System.out.println("Introduce un caracter: ");
		char letra = dato.next().charAt(0);//charAt se toma solo un caracter con en indice 0
		switch (letra) {
		case 'a':
		case 'A': // cada case verifica un caso
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Es vocal");
			break;

		default:
			System.out.println("El caracter no es vocal: " + letra);
			break;
		}

	}
	public void notas() {
		// TODO Auto-generated method stub
		System.out.print("Introduce una nota: ");
		int nota  = dato.nextInt(); //nextInt recibe un entero
		switch (nota) {
		case 10:System.out.println("Excelente");
		break; // romper estructuras depsues del syso
		case 9:System.out.println("Muy bien");break;
		case 8:System.out.println("Bueno");break;
		case 7:System.out.println("Regular");break;
		case 6:System.out.println("Deficiente");break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Reprobado");
			break;

		default:
			System.out.println("Fuera de rango");
			break;
		}

	}
	
	// ?: Operador elvis o ternario
	// variable = (PruebaLogica) ? entrada verdad : entrada Falso
	
	
	public void ternario() {
		// TODO Auto-generated method stub
		System.out.println("Introduce un valor numerico: ");
		int entradaV = dato.nextInt();
		System.out.println("Introduce un segundo valor numerico");
		int entradaF = dato.nextInt();
		int menor = (entradaV <= entradaF) ? entradaV : entradaF;
		System.out.println("Se imprime el menor: " + menor);

	}
	
}
