package oop.clases;


//Clase que imprima dia mes año
public class Fecha {
	private int dia;
	private int mes;
	private int ano;
	
	//Crear constructor
	public Fecha () {
		
	}

	public Fecha(int día, int mes, int ano) {
		super();
		this.dia = día;
		this.mes = mes;
		this.ano = ano;
	}
	//Metodo para imprimir fecha
	public String diaMesAno() {
		return "La Fecha es: --> " + this.dia + "/" + this.mes + "/" + this.ano;
	}


	//MEtodo heredado del padre
	@Override  //nos dice que el metodo está sobreescrito
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}

	
	
	
	//MEtodos get y set
	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		this.dia = dia;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}


	



}
