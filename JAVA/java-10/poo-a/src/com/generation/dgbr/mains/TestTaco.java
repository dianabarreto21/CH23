package com.generation.dgbr.mains;

import com.generation.dgbr.clases.Taco;
import com.generation.dgbr.clases.TacoAcciones;

public class TestTaco {
	public static void main(String[] args) {
	
		TacoAcciones ta = new TacoAcciones();
		Taco t = new Taco();

		t.setNumeroDeTortilla(3);
		t.setGuisado("Chicharrón");
		t.setTipoDeTortilla("harina");
		t.setTamanioDeTortilla("chica");
		
		ta.preparar(t.getNumeroDeTortilla(), t.getTipoDeTortilla(), t.getTamanioDeTortilla(), t.getGuisado());
		
		System.out.println("Buenas me pone " + t.getNumeroDeTortilla() +  
				" de " + t.getTipoDeTortilla() + " " + t.getTamanioDeTortilla()
				+ " con guiso de " + t.getGuisado() + ", por favor." );
		
		System.out.println( t.toString());
		System.out.println(ta.preparar());
		
}
}
