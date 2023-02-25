package principal;

import java.util.Scanner;

import clases.NuevoHola;

public class EjecutarNH {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in)) {
			String nombre ;
			System.out.print("Escribe tu nombre ");
			nombre = sn.nextLine();
			
			NuevoHola nh1 = new NuevoHola(nombre);
			nh1.saludoConNombre();
		}
		
		//NuevoHola nh = new NuevoHola("Diana");
		//nh.saludo();

	}

}
