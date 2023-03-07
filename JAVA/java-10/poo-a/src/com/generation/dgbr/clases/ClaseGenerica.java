package com.generation.dgbr.clases;

public class ClaseGenerica <T>{ //convencion para nombrar los genericos tipo "Type"
	T obj;

	public ClaseGenerica(T obj) {

		this.obj = obj;
	}

	public void claseTipo() {
		System.out.println("El tipo T es: " + obj.getClass().getName() ); //API reflection
		
	}
}
