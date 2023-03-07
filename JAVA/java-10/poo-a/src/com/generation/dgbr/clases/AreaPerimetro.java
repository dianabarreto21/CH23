package com.generation.dgbr.clases;


public class AreaPerimetro {
	
	
	
	
	
	// El parametro se le agrega lado y el tipo de va
	public double areaCuadrado(double lado) {
		double area = lado*lado;
		return area;

	}
	
	public double perimetroCuadrado(double lado) {
		double perimetro = lado*4;
		return perimetro;
	}
	
	public double areaTriangulo(int base, int altura) {
		
		return (base*altura)/2;

	}
	
	
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
		
		return ladoA+ladoB+ladoC;
		
	}
	
	
	public double areaCirculo(double radio) {
		double pi = Math.PI;
		
		return pi* (radio*radio);
	}
	
	public double perimetroCirculo() {
		
		return 0;
	}
	
	
	
}
