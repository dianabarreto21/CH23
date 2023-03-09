package com.dgbr.testers;

import com.dgbr.clases.*;


public class TestFG {

	public static void main(String[] args) {
		//Relacion dinamica(de referencia)
//hacemos referencia a Clase padre; enlace dinamico
		FigurasGeometricas rectangulo = new Rectangulo(10,2);
		rectangulo.areas();
		FigurasGeometricas circulo = new Circulo(15);
		FigurasGeometricas triangulo = new Triangulo(15,7);
		FigurasGeometricas cuadrado = new Cuadrado(6);
		
		
		System.out.println(rectangulo.areas());
		System.out.println(circulo.areas());
		System.out.println(triangulo.areas());
		System.out.println(cuadrado.areas());
		
		System.out.println(rectangulo.toString());
		System.out.println(circulo.toString());
		
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.areas());
	}

}
