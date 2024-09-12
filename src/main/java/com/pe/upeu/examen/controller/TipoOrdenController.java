package com.pe.upeu.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.upeu.examen.entity.TipoOrden;
import com.pe.upeu.examen.service.TipoOrdenService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tipoordenes")
public class TipoOrdenController {
	
	@Autowired
	private TipoOrdenService tipoordenService;

	@GetMapping
	public ResponseEntity<List<TipoOrden>> readAll(){
		try {
			List<TipoOrden> TipoOrden = tipoordenService.readAll();
			if(TipoOrden.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(TipoOrden, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping
	public ResponseEntity<TipoOrden> crearTipoOrden(@Valid @RequestBody TipoOrden cat){
		try {
			TipoOrden c = tipoordenService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<TipoOrden> getTipoOrdenId(@PathVariable("id") Long id){
		try {
			TipoOrden c = tipoordenService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<TipoOrden> delTipoOrden(@PathVariable("id") Long id){
		try {
			tipoordenService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTipoOrden(@PathVariable("id") Long id, @Valid @RequestBody TipoOrden cat){

			Optional<TipoOrden> c = tipoordenService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);

			}else {
				return new ResponseEntity<>(tipoordenService.update(cat), HttpStatus.OK);

			}		
		
	}
}