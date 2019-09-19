package com.combos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.combos.model.Provincia;
import com.combos.repositories.ProvinciaRepository;

@RestController
public class ProvinciaController {

	@Autowired
	private ProvinciaRepository repository;

	@PostMapping(value = "/insertarprovincia")
	public ResponseEntity<Provincia> agregarProvincia(@RequestBody Provincia provincia) {
		Provincia prov = repository.save(provincia);
		if (prov != null) {
			new ResponseEntity<Provincia>(HttpStatus.OK);
			return ResponseEntity.ok(prov);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@GetMapping(value = "/listarprovincias")
	public ResponseEntity<List<Provincia>> traerLista() {
		List<Provincia> provincias = (List<Provincia>) repository.findAll();
		if (provincias != null) {
			new ResponseEntity<List<Provincia>>(HttpStatus.OK);
			return ResponseEntity.ok(provincias);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
}
