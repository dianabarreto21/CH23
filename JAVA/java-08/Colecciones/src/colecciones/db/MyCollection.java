package colecciones.db;

import java.util.*;

public class MyCollection {

	public static void main(String[] args) {
		// wrapperClass();
		MyCollection c = new MyCollection(); // se genera el objet de la clase MyCollection
		//c.listasCollections();
		//imprimir(c.listasCollections());// se le pone la collection en imprimir
		//imprimir(c.setCollections());
		mapCollection();
		
	}// end main method

	
	//*****MAP COLLECTION*****//no es collection pero si implementa collections porque usa set
	
	private static void mapCollection() {
		Map miMap = new HashMap();
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
		
		imprimir(miMap.values());
		imprimir(miMap.keySet());

	}
	
	
	//**********SET COLLECTION**********//
	
	Set setCollections() {

			Set miSet = new HashSet();
			miSet.add("uno");
			miSet.add("dos");
			miSet.add("tres");
			miSet.add("cuatro");
			miSet.add("dos");//NO se repiten elementos
			miSet.add("cinco");
			miSet.add("seis");
			
			
			boolean e = miSet.contains(3);
			miSet.retainAll(miSet);
			//miSet.clear();
			miSet.remove("dos");
			miSet.isEmpty();
			
			System.out.println("Tamaño de la lista " + miSet.size());
			System.out.println("está vacía? " + miSet.isEmpty());
			
			
			
			
			return miSet;
	}
		
	
	
	
	//**********LIST COLLECTION***********//
	// metodo de tipo lista debe llevar la función return
	public List listasCollections() {
		List miLista = new ArrayList();
		System.out.println(miLista + "Tamaño de la lista antes " + miLista.size());
		System.out.println("está vacía? " + miLista.isEmpty());
		miLista.add("1");
		miLista.add(2);
		miLista.add(3);
		miLista.add(0, "pato");
		
		miLista.set(0, miLista);
		miLista.remove(2);

		System.out.println(miLista + "Tamaño de la lista despues " + miLista.size());
		System.out.println("está vacía? " + miLista.isEmpty());

		boolean e = miLista.contains(3);
		System.out.println("--> " + e);
		
		

		return miLista;
	}

//Metodo para poder imprimir cualquier collection
	private static void imprimir(Collection collection) {
		for (Object elementos : collection) {
			System.out.println("elementos " + elementos);
		}
	}

	static void wrapperClass() {
		// byte, short, char, long, float, int, double
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
