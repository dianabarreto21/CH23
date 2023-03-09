package com.dgbr.clases;
//Clase Padre y Madre
//Palabra reservada que hace que no sea concreta sino abstracta
public  abstract class FigurasGeometricas {
	private String nombre;
	
	//constructor
public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}


//clase abstracta: el contenido de metodos abstractos (minimo un metodo abstracto)
	//metodo abstracto es declarado solamente (sin llaves {})
	public abstract double areas();
	
	public abstract void pedirDatos();


	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + ", areas()=" + areas() + "]";
	}


	

	
	
}
