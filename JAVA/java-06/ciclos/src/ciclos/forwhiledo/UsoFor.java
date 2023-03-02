package ciclos.forwhiledo;

import java.util.Iterator;

public class UsoFor {
	public void cicloFor() {
		for (int i = 0; i < 10; i++) { // for tiene 3 parametros 1- indice de inicio. 2- prueba logica. 3- el incremento
			System.out.println("el iterador --> " + i);
		}

	}
	
	public void letrasFor() {
		for (int i = 'A'; i <= 'Z'; i++) {
			/*String converti = Character.toString(i);
			System.out.print("soy --> " + converti +  ", " );*/
			System.out.println("soy --> " + (char)i + ", ");
		}

	}
}
