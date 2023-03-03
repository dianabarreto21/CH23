package funciones;

//Clase llamada Funciones
public class Funciones {

//Las funciones se pueden declarar en cualquier lugar de la clase(esta funcion si retorna algo)
	public static int sumar(int num1, int num2) {
		int resSum = num1 + num2;
		return resSum;
	}//cierre sumar

	public static int restar(int num1, int num2) {
		int resRest = num1 - num2;
		return resRest;
	}//cierre resta
	public static int multi(int num1, int num2) {
		int resMulti = num1 * num2;
		return resMulti;
	}//cierre multiplicacion
	public static int div(int num1, int num2) {
		int resDiv = num1 / num2;
		return resDiv;
	}//cierre division
	
	public static float sumaDecimal (float valor1, int valor2) {
		return valor1 + valor2;
		
	}
	public static float sumaDecimal2 (float valor1, int valor2) {
		float resultadoDecimal2 = (valor1 + valor2);
		return resultadoDecimal2;
		
	}
	
	//Funcion tipo void
	public static void imprimirAsteriscos() {
		System.out.println("*****************");

	}//cierreasteriscos
	
	
	//Funcion que usa Strings como argumentos
	
	public static String awitaDeLimon(String ing1, String ing2, String ing3) {
		String recetaCompletada = ing1 + ing2 + ing3;
		return recetaCompletada;
		
	}

	// Metodo Principal...Este metodo generalmente es para ejecutar en consola
	public static void main(String[] args) {
//Las invocaciones de la funcion se hacen generalmente dentro del metodo principal o main ****** Esto se puede hacer en otra clase
		System.out.println("El resultado de la suma es: " + sumar(5, 8));
		imprimirAsteriscos();
		System.out.println("El resultado de la suma decimal es: " + sumaDecimal(2.5f, 5));
		System.out.println("El resultado de la suma decimal es: " + sumaDecimal2(2.6f, 5));
		imprimirAsteriscos();
		System.out.println("Pasos para preparar awita de limon: " + awitaDeLimon("Agua ", "Limon ", "Azucar ") );
	}//cierrre metodo main

}//cierre funciones

/*
 * 
 * Funciones -No retornan valores: No devuelven nnada, no se especifica nada, y
 * no usalos la palabra return
 * 
 * -Si retornan valores: Se especicica el tipo de dato, el tipo de valor
 * queregresa y se usa return para esto
 * 
 * metodos tienen objetos
 * 
 * 
 * - Sintaxis de las funciones que si retornan valores
    tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  // Cuerpo de la función
}

    - Sintaxis de las funciones que no retornan valores
    palabraReservada nombreDeLaFuncion(){
    //cuerpo de la funcion
     }
 Cosas que debemos tomar en cuenta al momento de crear nuestras funciones:
    - Deben de llevar un nombre unico
    - Opcionalmente podran recibir argumentos y devolver el resultado
    - Se debe especificar el tipo de dato que vamos a pasar como argumnto, y el resultado final de nuestra funcion
    - Cuidar el orden en como estamos agregando nuestros parametros o argumentos.

 */



