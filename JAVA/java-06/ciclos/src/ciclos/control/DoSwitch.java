package ciclos.control;

import java.util.Scanner;

import ciclos.forwhiledo.UsoDo;
import ciclos.forwhiledo.UsoFor;
import ciclos.forwhiledo.UsoWhile;


public class DoSwitch {
	public void controlador() {
		Scanner s = new Scanner(System.in);
		Menus mp = new Menus(); // creams instancia de Menus
		UsoWhile objetoUW = new UsoWhile();
		UsoFor objetoUF = new UsoFor();
		UsoDo objetoUD = new UsoDo();

		int opcion = 0;
		do {
			mp.menuPrincipal();
			System.out.print("Introduce una opción: ");
			opcion = s.nextInt();

			switch (opcion) {
			case 1:
				objetoUW.cicloW();

				break;
			case 2:
				objetoUW.centinelW();

				break;
			case 3:
				objetoUW.banderaW();
				
				break;
			case 4:
				objetoUF.cicloFor();
				
				break;
			case 5:
				objetoUF.letrasFor();
				
				break;
			case 6:
				objetoUD.digitosDo();
				
				break; 

			default:
				break;
			}

		} while (opcion > 0 && opcion < 7);
	}
}
