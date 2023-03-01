package DatosYVariables;

public class Ejercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		 if(num % 2 == 0){
			 System.out.println("Es numero Par");
		 }else {
			 System.out.println("No es numero Par");
		 }
		 
		 byte farenheit = 65;
		 byte centigrados = (byte) ((farenheit-32)/1.8); 
		 double kelvin =  (farenheit - 32) *5/9 + 273.15;
		 
		 System.out.println("La temperatura en centigrados es de: " + centigrados);
		 System.out.println("La temperatura en kelvin es de: " + kelvin);
		 

	}

}
