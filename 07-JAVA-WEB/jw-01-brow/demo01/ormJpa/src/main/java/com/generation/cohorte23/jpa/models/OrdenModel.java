package com.generation.cohorte23.jpa.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden")
public class OrdenModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	private String nombre_orden;
	
	//Relacion n:1 orden-usuario
	@ManyToOne   
	private UsuarioModel usuario; 
	
	@OneToOne(mappedBy = "orden") //Mapeamos
	private DetalleOrden detalle;
	
	
	//Constructor vacío
	public OrdenModel() {
	}


	//Constructor
	public OrdenModel(long id, String nombre_orden, Integer usuarioId) {
		super();
		this.id = id;
		this.nombre_orden = nombre_orden;
	}

	//Getters y Setters

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombre_orden() {
		return nombre_orden;
	}



	public void setNombre_orden(String nombre_orden) {
		this.nombre_orden = nombre_orden;
	}



	
	
	
	
	
	
}
