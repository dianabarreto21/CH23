package com.dgbr.clases;

public class AlumnoB extends PersonaP {
	private int matricula;
	private double promedio;
	
	//Constructor
	public AlumnoB(int matricula, double promedio) {
		
		this.matricula = matricula;
		this.promedio = promedio;
	}
	//Metodos get y set (Acsesores)

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "AlumnoB [matricula=" + matricula + ", promedio=" + promedio + "]";
	}
	
	
	
	
}
