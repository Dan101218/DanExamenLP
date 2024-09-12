package com.pe.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import com.pe.upeu.examen.entity.FormaPago;
public interface FormaPagoService {
	FormaPago create(FormaPago a);
	FormaPago update(FormaPago a);
	void delete(Long id);
	Optional<FormaPago> read(Long id);
	List<FormaPago> readAll();
}