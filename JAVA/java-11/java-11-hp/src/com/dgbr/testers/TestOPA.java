package com.dgbr.testers;

import com.dgbr.clases.Mensajes;
import com.dgbr.clases.OperacionesAritmeticas;
import com.dgbr.clases.Suma;

public class TestOPA {

	public static void main(String[] args) {
		Suma s = new Suma(75, 88);
		OperacionesAritmeticas ss = new Suma(54,63);
		Mensajes sss = new Suma();
		
		System.out.println("de Suma: " + s.suma());
		System.out.println("de OperacionesAritmeticas: " + ss.suma());
		s.mensaje();
		sss.mensaje();
		
	}

}
