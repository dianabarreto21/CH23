package com.generation.dgbr.clases;

public class Persona {
	//Atributos
	public String nombre;
	private int edad;
	private int nss;
	
	//medoto Constructor vacio
	public Persona() {
		
	}
	// metodo Constructor sobrecargado
	public Persona(String nombre, int edad, int nss) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
	}
	
	
	// Metodo GET Y SET
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
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
	
	
	
	

}
