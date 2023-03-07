package com.generation.dgbr.clases;

public class Taco {
	private String tipoDeTortilla;
	private String guisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio;
	
	
	// Creo constructor vacio
	
	public Taco() {
		super();
	}

	//Creo constructor sobrecargado

	public Taco(String tortilla, String guisado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
		super();
		this.tipoDeTortilla = tortilla;
		this.guisado = guisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	
	//Metodo ToString
	@Override
	public String toString() {
		return "Taco [tortilla=" + tipoDeTortilla + ", guisado=" + guisado + ", numeroDeTortilla=" + numeroDeTortilla
				+ ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}

	
	//Metodos GET y SET
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tortilla) {
		this.tipoDeTortilla = tortilla;
	}

	public String getGuisado() {
		return guisado;
	}

	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}
