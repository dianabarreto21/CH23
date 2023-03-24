package com.generation.cohorte23.app.model;
//Esta es nuestra clase plana (POJO)
public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	
	
	//Constructor vacio para generar objeto
	public Libro() {
	}

	//Constructor sobrecargado
	public Libro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
