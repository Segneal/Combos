package com.combos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "provincias")
public class Provincia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProvincia;
	private String nombre;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "provincia")
	private List<Localidad> localidades;

	public Provincia() {
		super();
	}

	public Provincia(int idProvincia, String nombre, List<Localidad> localidades) {
		super();
		this.idProvincia = idProvincia;
		this.nombre = nombre;
		this.localidades = localidades;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Localidad> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(List<Localidad> localidades) {
		this.localidades = localidades;
	}

	@Override
	public String toString() {
		return "Provincia [idProvincia=" + idProvincia + ", nombre=" + nombre + ", localidades=" + localidades + "]";
	}

}
