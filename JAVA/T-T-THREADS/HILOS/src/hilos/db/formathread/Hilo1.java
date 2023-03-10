package hilos.db.formathread;

import java.util.Iterator;

public class Hilo1 extends Thread{
	

	public Hilo1(String name) {
		super(name);

	}

	@Override
	public void run() {
		System.out.println("Se inicia el Thread o Hilo" + this.getName());
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Termina el Thread o Hilo" + this.getName());
	}
}
