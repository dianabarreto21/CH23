//Clase hije
package com.dgbr.clases;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas {
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		super("Rectangulo"); // accedes al constructor de la clase padre
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return (base * altura);
	}

	@Override
	public void pedirDatos() {
		Scanner datos = new Scanner(System.in);
		System.out.print("introduce la base: ");
		double b = datos.nextDouble();//Se puede declarar variable
		setBase(b);
		System.out.print("introduce la altura: ");
		this.setAltura(datos.nextDouble());// sin pedir variable
	}

///////metodos Get y set////////////
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

}
