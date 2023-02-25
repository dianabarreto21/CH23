import Saludo;
class HolaMundo{
	public static void main (String [] args){
		//System.out.print("Hola mundo desde Java");
		Saludo objSaludo; //declaramos el objeto en la clase Saludo
		objSaludo = new Saludo(); //creamos el objeto con new
		objSaludo.saludar(); //El operador "." me ayuda llamar al metodo saludar
	}

}