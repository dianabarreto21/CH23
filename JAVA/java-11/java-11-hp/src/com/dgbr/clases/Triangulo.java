package com.dgbr.clases;

public class Triangulo extends FigurasGeometricas{
private double base;
private double altura;



public Triangulo(double base, double altura) {
	super("Triangulo");
	this.base = base;
	this.altura = altura;
}



@Override
public double areas() {
	return (base * altura);
}


//////GETS Y SETS
public double getBase() {
	return base;
}



public void setBase(double base) {
	this.base = base;
}



public double getAltura() {
	return altura;
}



public void setAltura(double altura) {
	this.altura = altura;
}



@Override
public void pedirDatos() {
	// TODO Auto-generated method stub
	
}





}
