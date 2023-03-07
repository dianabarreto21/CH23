package oop.clases;

public class Persona {
	private String nombre = "Peter";
	private int edad;
	private double altura;
	private double peso;
	private String signo;

	// Constructor
public Persona() {
	
}
	

//Metodos Get y Set	se le conoce como pojo o bean
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;// con this accedes al miembro de datos de la clase
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	public String datosPersona() {
		return this.nombre + "" + this.edad + "" + this.altura + "" + this.peso + "" + this.signo;

	}

}



