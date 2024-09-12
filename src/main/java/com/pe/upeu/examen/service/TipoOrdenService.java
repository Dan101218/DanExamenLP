package com.pe.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import com.pe.upeu.examen.entity.TipoOrden;
public interface TipoOrdenService {
	TipoOrden create(TipoOrden a);
	TipoOrden update(TipoOrden a);
	void delete(Long id);
	Optional<TipoOrden> read(Long id);
	List<TipoOrden> readAll();
}