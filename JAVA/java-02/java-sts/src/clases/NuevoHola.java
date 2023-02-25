package clases;

import java.util.Scanner;

public class NuevoHola {
	
	private String nombre;
	//para inicializar la variable (objeto de tipo String)
	//usamos el metodo constructor

	/**
	 * @param nombre
	 */
	public NuevoHola(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//public void saludo() {
		//System.out.println("Hola " + this.nombre + " desde java");
	//}
	
	public void saludoConNombre() {
		System.out.print("Hola Demonio " + this.nombre);
		
	}
	
}
