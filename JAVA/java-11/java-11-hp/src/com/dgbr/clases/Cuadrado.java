package com.dgbr.clases;

public class Cuadrado extends FigurasGeometricas {
private int lado;
	


	public Cuadrado(int lado) {
	super("Cuadrado");
	this.lado = lado;
}



	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return lado*lado;
	}



	public int getLado() {
		return lado;
	}



	public void setLado(int lado) {
		this.lado = lado;
	}



	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}

	
	
}
