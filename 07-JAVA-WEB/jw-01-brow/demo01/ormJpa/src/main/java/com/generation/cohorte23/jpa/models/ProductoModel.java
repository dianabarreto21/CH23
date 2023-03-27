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
@Table(name = "producto")
public class ProductoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	private String nombre_producto;
	//private Integer usuarioId;
	
	//Relacion n:1 producto-usuario
	@ManyToOne   //Relacionamos producto con usuario 
	private UsuarioModel usuario; //declaramos el objeto y lo generamos con get y set
	
	
	@OneToOne(mappedBy = "producto") //Mapeamos
	private DetalleOrden detalle;
	
	//Constructor vacío
	public ProductoModel() {
	}



	//Constructor
	public ProductoModel(long id, String nombre_producto, Integer usuarioId) {
		super();
		this.id = id;
		this.nombre_producto = nombre_producto;
		
	}

	//Getterrs setters

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombre_producto() {
		return nombre_producto;
	}



	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}



	public UsuarioModel getUsuario() {
		return usuario;
	}



	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	

	
	
	
}
