package com.pe.upeu.examen.dao;
import java.util.List;
import java.util.Optional;

import com.pe.upeu.examen.entity.Almacen;


public interface AlmacenDao {
	Almacen create(Almacen a);
	Almacen update(Almacen a);
	void delete(Long id);
	Optional<Almacen> read(Long id);
	List<Almacen> readAll();
}

