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

import com.pe.upeu.examen.entity.FormaPago;
import com.pe.upeu.examen.service.FormaPagoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/formapagos")
public class FormaPagoController {
	
	@Autowired
	private FormaPagoService formapagoService;

	@GetMapping
	public ResponseEntity<List<FormaPago>> readAll(){
		try {
			List<FormaPago> FormaPago = formapagoService.readAll();
			if(FormaPago.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(FormaPago, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping
	public ResponseEntity<FormaPago> crearFormaPago(@Valid @RequestBody FormaPago cat){
		try {
			FormaPago c = formapagoService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<FormaPago> getFormaPagoId(@PathVariable("id") Long id){
		try {
			FormaPago c = formapagoService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<FormaPago> delFormaPago(@PathVariable("id") Long id){
		try {
			formapagoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateFormaPago(@PathVariable("id") Long id, @Valid @RequestBody FormaPago cat){

			Optional<FormaPago> c = formapagoService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);

			}else {
				return new ResponseEntity<>(formapagoService.update(cat), HttpStatus.OK);

			}		
		
	}
}