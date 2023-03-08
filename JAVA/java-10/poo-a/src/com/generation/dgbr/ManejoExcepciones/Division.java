package com.generation.dgbr.ManejoExcepciones;

public class Division {
	private int numerador;
	private int denominador;
	
	public Division(int numerador, int denominador)throws OpExceptions{
		if(denominador == 0) {
			throw new OpExceptions("el denominador es algo");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	
	}
	
	public void visualizarD() {
		System.out.println(this.numerador / this.denominador );
	}
	
}
