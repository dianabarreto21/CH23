package com.dgbr.clases;

public class PersonaP {
	private String nombre;
	private int edad;
	
	//Constructor
	public PersonaP(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}

///Metodo get y set
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

//MEtodo toString///
	@Override
	public String toString() {
		return "PersonaP [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}
