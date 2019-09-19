package com.combos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name = "localidades")
public class Localidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLocalidad;
	private String nombre;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProvincia")
	private Provincia provincia;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "localidad")
	@JsonManagedReference
	private List<Sucursal> sucursales;

	public Localidad() {
		super();
	}

	public Localidad(int idLocalidad, String nombre, Provincia provincia, List<Sucursal> sucursales) {
		super();
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
		this.provincia = provincia;
		this.sucursales = sucursales;
	}


	
	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

	public void addSucursal(Sucursal sucursal) {
		this.sucursales.add(sucursal);
		sucursal.setLocalidad(this);
	}
	
	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", nombre=" + nombre + ", provincia=" + provincia.getNombre()
				+ ", sucursales=" + sucursales + "]";
	}
	
	

	

	
}
