package com.combos.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "sucursales")
public class Sucursal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSucursal;
	private String nombre;
	private String direccion;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="idLocalidad")
	@JsonBackReference
	private Localidad localidad;
	// private List<Empleado> empleados;

//	public Sucursal(int idSucursal, String nombre, String direccion, Localidad localidad, List<Empleado> empleados) {
//		super();
//		this.idSucursal = idSucursal;
//		this.nombre = nombre;
//		this.direccion = direccion;
//		this.localidad = localidad;
//		this.empleados = empleados;
//	}

	public Sucursal() {
		super();
	}

	public Sucursal(String nombre, String direccion, Localidad localidad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
	}


	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Sucursal [idSucursal=" + idSucursal + ", nombre=" + nombre + ", direccion=" + direccion + ", localidad="
				+ localidad.getNombre() + "]";
	}

//	public List<Empleado> getEmpleados() {
//		return empleados;
//	}
//
//	public void setEmpleados(List<Empleado> empleados) {
//		this.empleados = empleados;
//	}
//
//	@Override
//	public String toString() {
//		return "Sucursal [idSucursal=" + idSucursal + ", nombre=" + nombre + ", direccion=" + direccion + ", localidad="
//				+ localidad + ", empleados=" + empleados + "]";
//	}

}
