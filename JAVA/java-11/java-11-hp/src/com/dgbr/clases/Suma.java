package com.dgbr.clases;
//implementa a nuestra interface
//Palabra reservada implements
public class Suma implements OperacionesAritmeticas, Mensajes{
	private double num1;
	private double num2;
	
	
	//constructor vacio
	public Suma() {
		
	}

	public Suma(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public double suma() {
		
		return this.num1+this.num2;
	}

	@Override
	public double resta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double multi() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divi() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mensaje() {
		System.out.println("wakeup Amerrrrica");
		
	}
	
	
	
}
