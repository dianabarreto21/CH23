package principal;
import clases.HolaJava;

class EjecutarHola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HolaJava objHJ;
		objHJ = new HolaJava(); //new le da memoria a la clase
		objHJ.saludo();
		// los tres pasos de arriba simplificados
		HolaJava objHJ1 = new HolaJava();
		objHJ1.saludo();
	}

}
