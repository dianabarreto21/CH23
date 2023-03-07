package com.generation.dgbr.mains;

import com.generation.dgbr.clases.ClaseGenerica;

public class TestGenerica {
	
	public static void main(String[] args) {
		
		ClaseGenerica <Integer> intObj = new ClaseGenerica <Integer>(55);	
		ClaseGenerica <String> caracteresObj = new ClaseGenerica <String>("Prueba");
		
		intObj.claseTipo();
		caracteresObj.claseTipo();
	}
	
}
