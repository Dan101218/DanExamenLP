package com.pe.upeu.examen.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pe.upeu.examen.dao.AlmacenDao;
import com.pe.upeu.examen.entity.Almacen;
import com.pe.upeu.examen.repository.AlmacenRepository;


@Component
public class AlmacenDaoImpl implements AlmacenDao{

	@Autowired AlmacenRepository almacenRepository;
	
	@Override
	public Almacen create(Almacen a) {
		// TODO Auto-generated method stub
		return almacenRepository.save(a);
	}

	@Override
	public Almacen update(Almacen a) {
		// TODO Auto-generated method stub
		return almacenRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		almacenRepository.deleteById(id);
	}

	@Override
	public Optional<Almacen> read(Long id) {
		// TODO Auto-generated method stub
		return almacenRepository.findById(id);
	}

	@Override
	public List<Almacen> readAll() {
		// TODO Auto-generated method stub
		return almacenRepository.findAll();
	}
	

}
