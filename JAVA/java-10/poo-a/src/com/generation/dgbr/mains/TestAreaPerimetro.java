package com.generation.dgbr.mains;

import com.generation.dgbr.clases.AreaPerimetro;
import com.generation.dgbr.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		AreaPerimetro ap = new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();	
		fg.setArea(ap.areaCuadrado(5));
		System.out.println("el area del cuadrado es: " + fg.getArea());
		fg.setArea(ap.perimetroCuadrado(6));
		//fg.setPerimetro("perimetro del cuadrado" + fg.getArea());
		
		fg.setArea(ap.areaCirculo(6));
		System.out.println(fg.getArea());
	
	}

}
