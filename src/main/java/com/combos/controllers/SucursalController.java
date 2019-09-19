package com.combos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.combos.model.Sucursal;
import com.combos.repositories.SucursalRepository;

@RestController
public class SucursalController {

	@Autowired
	private SucursalRepository repository;
	
	@PostMapping(value = "/insertarsucursal")
	public ResponseEntity<Sucursal> agregarSucursal(@RequestBody Sucursal sucursal) {
		Sucursal sucur = repository.save(sucursal);
		if (sucur != null) {
			new ResponseEntity<Sucursal>(HttpStatus.OK);
			return ResponseEntity.ok(sucur);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@GetMapping(value = "/listarsucursales")
	public ResponseEntity<List<Sucursal>> traerLista() {
		List<Sucursal> sucur = (List<Sucursal>) repository.findAll();
		if (sucur != null) {
			new ResponseEntity<List<Sucursal>>(HttpStatus.OK);
			return ResponseEntity.ok(sucur);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
}
