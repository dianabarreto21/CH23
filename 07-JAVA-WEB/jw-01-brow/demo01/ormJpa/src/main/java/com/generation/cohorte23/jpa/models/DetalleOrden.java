package com.generation.cohorte23.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_orden")
public class DetalleOrden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	private String nombre_detalle_orden;

	@OneToOne
	private OrdenModel orden;
	
	@OneToOne
	private ProductoModel producto;
	
	
	// Constructor vacio
	public DetalleOrden() {
	}

	// Constructor
	public DetalleOrden(long id, String nombre_detalle_orden, Integer usuarioId) {
		super();
		this.id = id;
		this.nombre_detalle_orden = nombre_detalle_orden;
	}

	// Getters setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre_detalle_orden() {
		return nombre_detalle_orden;
	}

	public void setNombre_detalle_orden(String nombre_detalle_orden) {
		this.nombre_detalle_orden = nombre_detalle_orden;
	}

}
