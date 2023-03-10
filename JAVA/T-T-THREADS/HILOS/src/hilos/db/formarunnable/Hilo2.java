package hilos.db.formarunnable;

//Runnable es una clase interface abstracta 
public class Hilo2 implements Runnable{
private String nombre;


	public Hilo2(String nombre) {
	this.nombre = nombre;
}

	public String getNombre() {
		return nombre;
	}
		
	@Override
	public void run() {
System.out.println("Inicio del Thread " + this.getNombre());		
	
	for (int i = 0; i < 5; i++) {
		System.out.println(i + " " + nombre);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	}



	
	
	
}
