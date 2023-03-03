package colecciones.db;

import java.util.*;


public class MyCollection {
	
	public static void main(String[] args) {
		wrapperClass();
		
	}//end main method

	public void listasCollections() {
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
	}
	
	private void imprimir(Collection) {
for(Objet elementos : Collection) {
	
}
	}
	
	static void wrapperClass() {
		//byte, short, char, long, float, int, double
		byte numeroB = 126;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor Maximo " + Byte.MAX_VALUE);
		System.out.println("Valor minimo " + Byte.MIN_VALUE);
		System.out.println("--> " + numeroB);
		
		int numeroI = 2143554613;
		System.out.println("Tamaño de un entero bytes: " + Integer.BYTES);
		System.out.println("Tamaño de un entero size: " + Integer.SIZE);
		System.out.println("Valor max: " + Integer.MAX_VALUE);
		System.out.println("Valor min: " + Integer.MIN_VALUE);
		System.out.println("--> " + numeroI);
		
		short numeroS = 32767;
		System.out.println("Tamaño de un entero bytes: " + Short.BYTES);
		System.out.println("Tamaño de un entero size: " + Short.SIZE);
		System.out.println("Valor max: " + Short.MAX_VALUE);
		System.out.println("Valor min: " + Short.MIN_VALUE);
		System.out.println("--> " + numeroS);

		long numeroL = 65632165862107l;
		System.out.println("Tamaño de un entero bytes: " + Long.BYTES);
		System.out.println("Tamaño de un entero size: " + Long.SIZE);
		System.out.println("Valor max: " + Long.MAX_VALUE);
		System.out.println("Valor min: " + Long.MIN_VALUE);
		System.out.println("--> " + numeroL);
		
		float numeroF = 9.35f;
		System.out.println("Tamaño de un entero bytes: " + Float.BYTES);
		System.out.println("Tamaño de un entero size: " + Float.SIZE);
		System.out.println("Valor max: " + Float.MAX_VALUE);
		System.out.println("Valor min: " + Float.MIN_NORMAL);
		System.out.println("--> " + numeroF);
		
	}
	
	
}
