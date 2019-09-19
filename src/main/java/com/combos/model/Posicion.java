package com.combos.model;


public class Posicion {
	private int idPosicion;
	private String nombre;

	public Posicion(int idPosicion, String nombre) {
		super();
		this.idPosicion = idPosicion;
		this.nombre = nombre;
	}

	public Posicion() {
		super();
	}

	public int getIdPosicion() {
		return idPosicion;
	}

	public void setIdPosicion(int idPosicion) {
		this.idPosicion = idPosicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Posicion [idPosicion=" + idPosicion + ", nombre=" + nombre + "]";
	}

}
