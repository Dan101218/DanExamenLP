package com.pe.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import com.pe.upeu.examen.entity.Almacen;
public interface AlmacenService {
	Almacen create(Almacen a);
	Almacen update(Almacen a);
	void delete(Long id);
	Optional<Almacen> read(Long id);
	List<Almacen> readAll();
}

