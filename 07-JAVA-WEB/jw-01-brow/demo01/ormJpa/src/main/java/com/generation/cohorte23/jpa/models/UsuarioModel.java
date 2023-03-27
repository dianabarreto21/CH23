package com.generation.cohorte23.jpa.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	private String nombre;
	private String correo;
	private Integer prioridad;
	
	//Relacion 1:n usuario-producto
	@OneToMany(mappedBy = "usuario") // Relacion uno a muchos para relacionar tablas en mysql usuario 1, prductos n
	private ArrayList<ProductoModel> producto; // le estamos diciendo que se va  a relacionar con ProductoModel 
	//Relacion 1:n usuario-orden
	@OneToMany(mappedBy = "usuario") //Relacion 1:n usuario a orden
	private ArrayList<OrdenModel> orden;
	
	//Constructor vacío 
	public UsuarioModel() {
	}
	
	public UsuarioModel(String nombre, String correo, long id, Integer prioridad) {
		this.nombre = nombre;
		this.correo = correo;
		this.id = id;
		this.prioridad = prioridad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

}
