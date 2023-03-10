package hilos.db.pruebas;

import hilos.db.formathread.Hilo1;

public class TestThread {

	public static void main(String[] args) {
		Thread h = new Hilo1("Deedee");
		h.start();
		Thread h0 = new Hilo1 ("Dexter");
		h0.start();
		Thread h1 = new Hilo1 ("Cerebro");
		h1.start();
		//getState te indica el estado del Hilo
		
		
		System.out.println("El estado del Hilo es " + h.getState());
		
	}

}
