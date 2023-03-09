package com.dgbr.testers;

import com.dgbr.clases.AlumnoB;
import com.dgbr.clases.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		//Polimorfismo y herencia
		AlumnoB a = new AlumnoB(123, 9.5, "Diana", 20 );
		PersonaP p = new PersonaP("Simon", 18);	
		
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		System.out.println(p.toString());
		//metodo mostrarDatos sacado de AlumnosB (hija) /clase padre PersonaP
		a.mostrarDatos();
		a.mostrarDatos("Pelon");
	}

}
