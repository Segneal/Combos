package com.combos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.combos.model.Localidad;
import com.combos.repositories.LocalidadRepository;

@RestController
public class LocalidadController {

	@Autowired
	private LocalidadRepository repository;
	
	@PostMapping(value = "insertarlocalidad")
	public ResponseEntity<Localidad> agregarLocalidad(@RequestBody Localidad localidad) {
		Localidad loc = repository.save(localidad);
		if (loc != null) {
			new ResponseEntity<Localidad>(HttpStatus.OK);
			return ResponseEntity.ok(loc);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(value = "/listarlocalidades")
	public ResponseEntity<List<Localidad>> traerLista() {
		List<Localidad> localidades = (List<Localidad>) repository.findAll();
		if (localidades != null) {
			new ResponseEntity<List<Localidad>>(HttpStatus.OK);
			return ResponseEntity.ok(localidades);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
}
