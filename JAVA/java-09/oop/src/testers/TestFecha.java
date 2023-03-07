package testers;

import oop.clases.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha f = new Fecha();
		f.setDia(6);
		f.setMes(3);
		f.setAno(23);
		// SE llama a la instancia
		System.out.println(f.diaMesAno());
		
		System.out.println("---> " + f.getDia()+ "/" + f.getMes() + "/" + f.getAno());
		
		System.out.println("--> " + f.toString());
	}

}
