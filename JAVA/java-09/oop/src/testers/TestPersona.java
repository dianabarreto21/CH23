package testers;

import oop.clases.Persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona p = new Persona();
		//System.out.println(p.nombre);
		p.setNombre("MAria");
		System.out.println(p.getNombre());
		
		Persona p1 =new Persona();
		System.out.println(p1.datosPersona());
	}
}
