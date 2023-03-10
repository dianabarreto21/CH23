package hilos.db.pruebas;

import hilos.db.formarunnable.Hilo2;

public class TestRunnable {

	public static void main(String[] args) {
		Hilo2 ht = new Hilo2("Pedro");
		Thread st = new Thread(ht);
		st.start();
		//proceso directo
		new Thread(new Hilo2("Canicula")).start();
		new Thread(new Hilo2("Maincra")).start();
	}

}
